package com.cts.did1.service;

public class GreetServiceEnhancedImpl implements GreetService{
	
	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}
	
	

	public GreetServiceEnhancedImpl() {
		super();
	}



	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String userName) {
		
		return greeting  + userName;
	}

}
