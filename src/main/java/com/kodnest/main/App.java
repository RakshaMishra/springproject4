package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.University;
import com.kodnest.bean.Trainer;

public class App {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
//	        Trainer t=(Trainer) context.getBean("t1");
//	        System.out.println(t);
	        University u=(University) context.getBean("u1");
	        System.out.println(u);
	        
	        
	}

}
