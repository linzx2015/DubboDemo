package com.dubbo.dependency.consumer.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.dependency.provider.DependenceService;
import com.dubbo.provider.DemoService;

public class DependencyConsumerTest
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext(new String[]{"dependency-consumer.xml"});
		context.start();
		//本地应用方关联dependencyService
		DependenceService dependencyService=(DependenceService) context.getBean("dependencyService");
		if(dependencyService.needDependency()>0)
		{
			System.out.println("----needDependencyTest---success");
		}else
		{
			System.out.println("----needDependencyTest---false");			
		}
	}
}
