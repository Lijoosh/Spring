package com.liju.chat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liju.chat.domain.User;
import com.liju.chat.domain.WebServiceResponse;
import com.liju.chat.service.ChatService;

@Controller
public class WebServiceController {
	
	@Autowired
	private ChatService chatService;
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public @ResponseBody WebServiceResponse checkLogin(@RequestParam(required = true) final String userName, 
			@RequestParam(required = true) final String password) {
		WebServiceResponse response = new WebServiceResponse();
		if(userName != null && password != null) {
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user = chatService.checkLogin(user);
			if(user != null) {
				response.setWebserviceStatus("0");
				response.setUser(user);
			} else {
				response.setWebserviceStatus("1");
				response.setFailureMessage("Invalid username or password");
			}
		} else {
			response.setWebserviceStatus("1");
			response.setFailureMessage("Sorry! Some error has occured");
		}
		return response;
	}
	
}
