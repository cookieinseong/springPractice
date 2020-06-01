package com.javalec.ex.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.ex.model.dao.BDao;
import com.javalec.ex.model.dto.BDto;

@Service
public class BServiceImpl implements BService {

	@Autowired
	private BDao bDao;

	@Override
	public List<BDto> list() {
		return bDao.list();
	}

	@Override
	public BDto content_view(int bId) {

		return bDao.content_view(bId);
	}

	@Override
	public void delete(int bId) {
		bDao.delete(bId);
	}

	@Override
	public void write(BDto bDto) {
		bDao.write(bDto);

	}

	@Override
	public BDto modify_view(int bId) {
		return bDao.modify_view(bId);

	}
}
