package com.cg.springcore.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.service.Employee;

public class MyMainApplication {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) app.getBean("emp");
		System.out.println(employee);

	}

}
