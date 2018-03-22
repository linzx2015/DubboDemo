package com.dubbo.provider;

import java.util.List;

public interface DemoService
{
	//与client交互
	String hello2Consumer(String to);
	
	List getUser();
}
