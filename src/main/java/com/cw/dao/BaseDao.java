package com.cw.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao <T>{

    void save(T entity);
    
    void update(T entity);

    void saveOrUpdate(T entity);

    void delete(String id);
    
    T findByid(String id);
    
    List<T> findByids(String[] ids);
    
    List<T> findAll();

    void flush();
}
