package com.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) throws Exception {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Beans.xml");
		 Motor m1=context.getBean("motor",Motor.class);
         System.out.println(m1.hashCode());
         
         Motor m2=context.getBean("motor",Motor.class);
         System.out.println(m2.hashCode());
	}

}
