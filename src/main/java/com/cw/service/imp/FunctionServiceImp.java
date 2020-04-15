package com.cw.service.imp;

import java.util.Collection;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cw.bean.Function;
import com.cw.dao.FunctionDao;
import com.cw.service.FunctionService;
@Service
@Transactional
public class FunctionServiceImp implements FunctionService {

	@Resource
	FunctionDao functionDao;
	
	@Override
	public void save(Function function) {
		functionDao.save(function);

	}

	@Override
	public void delete(Integer id) {
		functionDao.delete(id);

	}


	@Override
	public void update(Function function) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Function> getAll() {
		// TODO Auto-generated method stub
		return functionDao.findAll();
	}

	@Override
	public Function getFunctionById(Integer id) {
		
		return functionDao.findByid(id);
	}

}
