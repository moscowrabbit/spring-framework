package org.springframework.one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.one.annotation.BeanAProxy;
import org.springframework.stereotype.Service;

@Service
public class BeanA {
	private String userName;
	private String password;
	@BeanAProxy(userName = "张三",password = "张三123")
	public String invoke(String userName, String password) throws Exception {
		this.userName = userName;
		this.password = password;
		System.out.println("beanA start invoke...");
		System.out.println("you userName is : " + userName + " ,password is : " + password + "");
		System.out.println("beanA invoke end...");
		return userName;
		//throw new Exception("手动异常.....");
	}

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
