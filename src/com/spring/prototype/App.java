package com.spring.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/com.spring.prototype/beans.xml");
		
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");
		
		person1.setTaxId(666);
 
		System.out.println(person2);
		// in prototype every time request to the container new object is created.
		// here person1 and person2 are two different beans and every time beans will work separately. 
		// here we setup person1 tax value incase of singleton person2 print the same value as person1 but in prototype every bean is different.
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
