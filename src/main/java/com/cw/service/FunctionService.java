package com.cw.service;

import java.util.Collection;

import com.cw.bean.Function;

public interface FunctionService {
	void save(Function function);
	void delete(String id);
	Function getFunctionById(String id);
	void update(Function function);
	Collection<Function> getAll();
}
