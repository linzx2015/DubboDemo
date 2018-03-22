package com.dubbo.consumer.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.provider.DemoService;

public class ConsumerTest
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
		context.start();
		//本地应用方关联demoConsumerService
		DemoService demoService=(DemoService) context.getBean("demoConsumerService");
		String fromProvider=demoService.hello2Consumer("linzx");
		System.out.println("--fromProvider--"+fromProvider);
		List userList=demoService.getUser();
		if(userList!=null)
		{
			for(int i=0;i<userList.size();i++)
			{
				System.out.println("--userInfo--"+userList.get(i).toString());
			}
		}
	}
}
