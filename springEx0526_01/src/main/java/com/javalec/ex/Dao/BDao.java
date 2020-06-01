package com.javalec.ex.Dao;

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

	PreparedStatement pstmt;
	public JdbcTemplate template;
	String sql;

	public BDao() {
		template = Constant.template;
	}

	// list
	public ArrayList<BDto> list() {
		sql = "select * from mvc_board order by bGroup desc,bStep asc";
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}

	// write
	public void write(final String bName, final String bTitle, final String bContent) {

		// preparedStatementCreator는 sql구문이 메소드안에 들어가있어야 한다. 그리고 pstmt =
		// con.prepareStatement(sql)을 해줘야한다.
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				System.out.println(bName);
				System.out.println(bTitle);
				System.out.println(bContent);
				sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent) values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);
				return pstmt;
			}

		});
	}

	public void upHit(final String bId) {
		// 조회수 1증가
		sql = "update mvc_board set bHit= bHit+1 where bId = ?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));

			}
		});
	}

	public BDto contentView(String bId) {

		upHit(bId);
		sql = "select * from mvc_board where bId =" + bId;
		// (sql,new Object[] {bId}, new BeanPropertyRowMapper
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}

	public void modify(final String bId, final String bName, final String bTitle, final String bContent) {
		sql = "update mvc_board set bName = ?, bTitle = ?, bContent = ? where bId = ?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bId));

			}
		});
	}

	public BDto modifyView(String bId) {

		sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public BDto reply_view(String bId) {

		String sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public void reply(String bId, final String bName, final String bTitle, final String bContent, final String bGroup,
			final String bStep, final String bIndent) {

		replyShape(bGroup, bStep);

		sql = "insert into mvc_board(bId,bName,bTitle,bContent,bGroup,bStep,bIndent)values(mvc_board_seq.nextval,?,?,?,?,?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep) + 1);
				ps.setInt(6, Integer.parseInt(bIndent) + 1);
			}
		});
	}

	// 답변 글 입력시 bStep 1씩 증가
	public void replyShape(final String bGroup, final String bStep) {

		sql = "update mvc_board set bStep=bStep+1 where bGroup=? and bStep > ?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bGroup));
				ps.setInt(2, Integer.parseInt(bStep));

			}
		});
	}

	public void delete(final String bId) {

		sql = "delete from mvc_board where bId = ?";
		// template.update(sql);

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));

			}
		});
	}
}
