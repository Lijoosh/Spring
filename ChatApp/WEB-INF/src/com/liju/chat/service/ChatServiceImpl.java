package com.liju.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liju.chat.dao.UserDao;
import com.liju.chat.domain.User;

@Service("chatService")
public class ChatServiceImpl implements ChatService {
	
	@Autowired
	private UserDao userDao;

	public User checkLogin(User user) {
		return userDao.checkLogin(user);
	}

}
