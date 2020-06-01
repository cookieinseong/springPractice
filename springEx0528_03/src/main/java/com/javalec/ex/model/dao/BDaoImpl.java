package com.javalec.ex.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.ex.model.dto.BDto;

@Repository
public class BDaoImpl implements BDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BDto> list() {
		// select를 할건데 mapper이름.id ->
		return sqlSession.selectList("board.list");
	}

	@Override
	public BDto content_view(int bId) {

		return sqlSession.selectOne("board.content_view", bId);
	}

	@Override
	public void delete(int bId) {
		System.out.println(sqlSession.delete("board.delete", bId));
	}

	@Override
	public void write(BDto bDto) {
		sqlSession.insert("write", bDto);

	}

	@Override
	public BDto modify_view(int bId) {

		return sqlSession.selectOne("modify_view", bId);
	}
}
