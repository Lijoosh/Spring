package com.liju.chat.dao;

import org.apache.ibatis.session.SqlSession;

import com.liju.chat.domain.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSession sqlSession;

	@Override
	public User checkLogin(User user) {
		return sqlSession.selectOne("checkLogin", user);
	}
	

}
