package com.spring.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/com.spring.factorymethod/beans.xml");
		
		Person person = (Person)context.getBean("person");

		System.out.println(person);;

		((ClassPathXmlApplicationContext)context).close();
	}

}
