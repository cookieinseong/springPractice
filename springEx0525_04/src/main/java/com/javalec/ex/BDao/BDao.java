package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	JdbcTemplate template;
	BDto bdto = new BDto();
	String sql;
	PreparedStatement pstmt;

	public BDao() {
		template = Constant.template;
	}

	public void delete(final String bId) {
		sql = "delete from mvc_board where bId = ?";
		// template.update(sql, new prerparedStatementCreator()->메소드안에 sql이 존재
		// template.update(sql, new preparedStatementSettor()->메소드밖에 sql이 존재
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bId);

			}

		});
	}

	public void upHit(final String bId) {

		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				String sql = "update mvc_board set bHit = bHit+1 where bId = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bId);
				return pstmt;
			}
		});
	}

	public BDto contentView(String bId) {

		upHit(bId);
		sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public void write(final String bName, final String bTitle, final String bContent) {
		// insert,update,delete - template.update
		// preparedStatementCreator()
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent) values(mvc_board_seq.nextval,?,?,?,mvc_board_seq.currval,0,0,0)";

				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);

				return pstmt;
			}
		});

	}

	public ArrayList<BDto> list() {
		sql = "select * from mvc_board order by bGroup desc";

		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
}
