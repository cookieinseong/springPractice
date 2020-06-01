package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.util.Constant;

public class BDao {

	// jdbc template
	JdbcTemplate template;

	public BDao() {
		// dataSource가 담겨 있는 jdbcTemplate 객체
		template = Constant.template;

//		try {
//			context = new InitialContext();
//			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
//		} catch (Exception e) {
//			e.printStackTrace();
//			e.getMessage();
//		}
	} // 생성자

	// 객체선언
	DataSource ds = null;
	Context context = null;
	Connection con = null;
	PreparedStatement pstmt;
	ResultSet rs;

	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto bdto = new BDto();

	String sql;

	// DB컬럼
	int bId, bHit, bGroup, bStep, bIndent;
	Timestamp bDate;
	String bName, bTitle, bContent;

	public BDto reply_view(String bId) {

		String sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}

	public void reply(String bId, final String bName, final String bTitle, final String bContent, final String bGroup,
			final String bStep, final String bIndent) {
		// replyShape(bGroup, bStep);

		String sql = "insert into mvc_Board(bId,bName,bTitle,bContent,bGroup,bStep,bIndent)"
				+ "(mvcboard_seq.nextval,?,?,?,?,?,?)";

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

	public void delete(final String bId) {
		sql = "delete from mvc_board where bId = ?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bId);

			}
		});
	}

	public void write(final String bName, final String bTitle, final String bContent) {

		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)"
						+ "values(mvc_board_seq.nextval, ?,?,?,mvc_board_seq.currval,0,0,0)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);

				return pstmt;
			}
		});
	}

	public void upHit(final String bId) {

		String sql = "update mvc_board set bHit=bHit+1 where bId = ?";
		// select - template.query / template.queryForObject(sql, new
		// beanPropertyRowMapper<BDto>(BDto.class));
		// insert,update,delete - template.update
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));

			}
		});
	}

	public BDto contentView(String bId) {

		upHit(bId);
		// 조회수 1증가, upHit(bId)
		// update mvc_boardB set bHit=bHit+1 where bId = ?;

		sql = "select * from mvc_board where bId = " + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

//		try {
//			con = ds.getConnection(); // 커넥션 풀에서 가지고옴
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				bId = rs.getInt("bId");
//				bName = rs.getString("bName");
//				bTitle = rs.getString("bTitle");
//				bContent = rs.getString("bContent");
//				bDate = rs.getTimestamp("bDate");
//				bHit = rs.getInt("bHit");
//				bGroup = rs.getInt("bGroup");
//				bStep = rs.getInt("bStep");
//				bIndent = rs.getInt("bIndent");
//
//				bdto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
//				dtos.add(bdto);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			e.getMessage();
//		} finally {
//
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//				e2.getMessage();
//			}
//		}
//
//		return dtos;
//	}

	}

	// List
	public ArrayList<BDto> list() {

		sql = "select * from mvc_board order by bGroup desc";
		// template.queryForObject는 BDto 객체를 한개만 받아온다.
		// template.query는 반환값이 object이기 때문에 형변환이 필요
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

//		try {
//			con = ds.getConnection(); // 커넥션 풀에서 가지고옴
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				bId = rs.getInt("bId");
//				bName = rs.getString("bName");
//				bTitle = rs.getString("bTitle");
//				bContent = rs.getString("bContent");
//				bDate = rs.getTimestamp("bDate");
//				bHit = rs.getInt("bHit");
//				bGroup = rs.getInt("bGroup");
//				bStep = rs.getInt("bStep");
//				bIndent = rs.getInt("bIndent");
//
//				bdto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
//				dtos.add(bdto);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			e.getMessage();
//		} finally {
//
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//				e2.getMessage();
//			}
//		}
//
//		return dtos;
//	}
	}
}
