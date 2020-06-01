package com.javalec.ex.BDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	JdbcTemplate template;

	public BDao() {
		// dataSource가 담겨 있는 jdbcTemplate 객체
		template = Constant.template;
	}

	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto bdto = new BDto();
	String sql;

	public void upHit(final String bId) {

		sql = "update mvc_board set bHit = bHit+1 where bId = ?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));

			}
		});
	}

	public BDto contentView(String bId) {

		sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public ArrayList<BDto> list() {

		sql = "select * from mvc_board order by bGroup desc";

		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
}
