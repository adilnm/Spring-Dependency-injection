package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.Laptop;

public class LaptopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("laptop-repair.xml");
		Laptop laptop = (Laptop) context.getBean("laptop1");

		System.out.println(laptop);
	}

}
