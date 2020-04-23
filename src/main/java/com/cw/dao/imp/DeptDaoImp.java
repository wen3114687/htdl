package com.cw.dao.imp;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.cw.bean.Department;
import com.cw.dao.DeptDao;

@SuppressWarnings("unchecked")
@Repository
public class DeptDaoImp extends BaseDaoImp<Department> implements DeptDao{

	
	@Override
	public List<Department> findTopDepts() {
		String sql="";
		return getSession().createQuery(sql).list();
	}


}
