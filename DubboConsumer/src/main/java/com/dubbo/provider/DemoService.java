package com.dubbo.provider;

import java.util.List;

public interface DemoService
{
	//��client����
	String hello2Consumer(String to);
	
	List getUser();
}
