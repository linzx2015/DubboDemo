package com.dubbo.provider.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest
{
	//在出现xsd缺失的错误时,需要在配置时在最http://code.alibabatech.com/schema/dubbo 之后加上/dubbo.xsd即可
	public static void main(String[] args) throws IOException
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				new String[]{"dubbo-provider.xml"});
		ctx.start();
		System.out.println("---start provider---");
		System.in.read();//利用输入端的阻塞来模拟,确保服务一直开启
	}
}
