package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.irfe.Hello;
import com.service.HelloService;
import com.test.HelloWorld;



public class HelloProgram {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//HelloService helloService = (HelloService)context.getBean("helloService");
		//Hello hello = helloService.getHello();
		//hello.hello();
		
		//HelloWorld hello = (HelloWorld)context.getBean("helloworld");
		//hello.printName();
		
		//System.out.println(Math.round(11.5));
		//System.out.println(Math.round(-11.5));

		//System.out.println(Math.round(-11.7));
		//System.out.println(Math.round(11.3));
		
		int i=12;
		System.out.println(i+=i-=i*=i);
		


		
	}
}
