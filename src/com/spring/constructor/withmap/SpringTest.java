package com.spring.constructor.withmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/com.spring.constructor.withmap/beans.xml");
		Question question=(Question) context.getBean("question");
		question.displayInfo();
		((ClassPathXmlApplicationContext)context).close();
	}

}
