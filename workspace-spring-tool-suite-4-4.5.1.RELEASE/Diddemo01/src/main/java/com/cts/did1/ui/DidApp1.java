package com.cts.did1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did1.service.GreetService;

public class DidApp1 {
	public static void main(String []args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml") ;
	GreetService gs=(GreetService)context.getBean("g1");
	System.out.println(gs.greet("Yamini"));
	GreetService gs2=(GreetService)context.getBean("g2");
	System.out.println(gs2.greet("Yamini"));
	GreetService gs3=(GreetService)context.getBean("g3");
	System.out.println(gs3.greet("Yamini"));
	
	GreetService gs4=(GreetService)context.getBean("g4");
	System.out.println(gs4.greet("Yamini"));



}

}
