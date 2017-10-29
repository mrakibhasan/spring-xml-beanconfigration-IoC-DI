package com.spring.init.destory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans//com.spring.init.destory/beans.xml");
		
		Person person = (Person)context.getBean("person");

		//System.out.println(person);// we do not this because 
		((ClassPathXmlApplicationContext)context).close();// we neeed to close the application context for init-destroy.
	}

}
