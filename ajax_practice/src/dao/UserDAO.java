package dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.config.SqlMapConfig;
import user.UserVO;

public class UserDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public UserDAO() {
		session = sessionf.openSession(true);
	}
	
	public ArrayList<UserVO> getMemberList(String userName) {
		
		
		return session.selectList("Member.getMemberList", userName);
	}
	
	
}
