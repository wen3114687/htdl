package com.cw.dao;

import java.util.List;

public interface BaseDao <T>{

    void save(T entity);
    
    void update(T entity);

    void saveOrUpdate(T entity);

    void delete(Integer id);
    
    T findByid(Integer id);
    
    List<T> findByids(Integer[] ids);
    
    List<T> findAll();

    void flush();
}
