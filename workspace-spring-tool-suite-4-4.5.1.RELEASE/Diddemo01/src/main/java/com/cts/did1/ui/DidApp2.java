package com.cts.did1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did1.service.GreetService;
import com.cts.did1.service.GreetServiceEnhancedImpl;

public class DidApp2 {
	public static void main(String []args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml") ;
	
	GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl)context.getBean("g2");
	gs2.setGreeting("Vanakam ");
	System.out.println(gs2.greet("Yamini"));
	
	GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl)context.getBean("g2");
	System.out.println(gs3.greet("Yamini"));
	
	GreetService gs4=(GreetService)context.getBean("g3");
	System.out.println(gs4.greet("Yamini"));
	

}

}
