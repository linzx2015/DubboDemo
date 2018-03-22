package com.dubbo.dependency.provider.test;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyTest
{
	public static void main(String[] args) throws IOException
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				new String[]{"dependency-provider.xml"});
		ctx.start();
		System.out.println("---start dependency provider---");
		System.in.read();//利用输入端的阻塞来模拟,确保服务一直开启
	}
}
