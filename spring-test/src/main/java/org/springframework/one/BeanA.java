package org.springframework.one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.stereotype.Service;

@Service
public class BeanA {
	private String userName;
	private String password;

	@Autowired
	private EnvironmentAware environmentAware;

	public EnvironmentAware getEnvironmentAware() {
		return environmentAware;
	}

	public void setEnvironmentAware(EnvironmentAware environmentAware) {
		this.environmentAware = environmentAware;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
