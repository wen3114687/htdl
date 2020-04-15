package htdl;

import org.junit.Test;

import com.cw.bean.User;
import com.cw.dao.UserDao;

public class Daotest {

	@Test
	public void test() {
		UserDao personDao=null;
		User peson=personDao.findByid(1);
		
	}

}
