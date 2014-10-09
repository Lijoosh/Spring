package com.liju.chat.domain;

public class WebServiceResponse {
	
	private String webserviceStatus;
	
	private String failureMessage;
	
	private User user;

	public String getWebserviceStatus() {
		return webserviceStatus;
	}

	public void setWebserviceStatus(String webserviceStatus) {
		this.webserviceStatus = webserviceStatus;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
