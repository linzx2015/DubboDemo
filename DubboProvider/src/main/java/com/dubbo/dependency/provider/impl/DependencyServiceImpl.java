package com.dubbo.dependency.provider.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.dubbo.dependency.provider.DependenceService;
import com.dubbo.provider.DemoService;

public class DependencyServiceImpl implements DependenceService
{
	//此处需要引用demoService
	@Autowired
	private DemoService demoService;
	
	@Override
	public int needDependency()
	{
//		List userList=demoService.getUser();
//		if(userList.size()>0)
		int i=1;
		if(i>0)
		{
			System.out.println("------假装调用demoService---------");
			return 1;
		}else
		{
			return 0;
		}
	}

}
