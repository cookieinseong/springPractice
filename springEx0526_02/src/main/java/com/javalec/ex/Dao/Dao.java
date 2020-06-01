package com.javalec.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.Dto.Dto;
import com.javalec.ex.constant.Constant;

public class Dao {

	public JdbcTemplate template;
	String sql;
	PreparedStatement pstmt;

	public Dao() {

		template = Constant.template;
	}

	public ArrayList<Dto> list() {

		sql = "select * from mvc_board order by bGroup desc, bStep asc";

		return (ArrayList<Dto>) template.query(sql, new BeanPropertyRowMapper<Dto>(Dto.class));

	}

	public void write(final String bName, final String bTitle, final String bContent) {

		sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
		System.out.println(bName);
		System.out.println(bTitle);
		System.out.println(bContent);
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);

			}
		});
	}

	public Dto content_view(String bId) {

		upHit(bId);

		sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<Dto>(Dto.class));
	}

	public void upHit(final String bId) {

		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				sql = "update mvc_board set bHit = bHit + 1 where bId = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(bId));
				return pstmt;
			}
		});
	}

	public void delete(String bId) {

	}

}
