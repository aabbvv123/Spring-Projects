package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao dao =context.getBean(StudentDao.class);
		System.out.println("application running successfully...!");
	}
	
	
}

