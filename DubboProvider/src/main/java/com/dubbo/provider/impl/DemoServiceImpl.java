package com.dubbo.provider.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.dubbo.provider.DemoService;
import com.dubbo.provider.pojo.User;

public class DemoServiceImpl implements DemoService
{

	public String hello2Consumer(String to)
	{
		return "hello "+to+",i am provider!";
	}

	public List getUser()
	{
		List list=new ArrayList();
		User user=new User();
		user.setName("user111");
		user.setAge(18);
		user.setSex(true);
		
		User user2=new User();
		user2.setName("user222");
		user2.setAge(5);
		user2.setSex(false);
		list.add(user);
		list.add(user2);
		return list;
	}
}
