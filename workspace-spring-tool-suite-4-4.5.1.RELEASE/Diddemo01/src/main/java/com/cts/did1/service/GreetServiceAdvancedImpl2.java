package com.cts.did1.service;

public class GreetServiceAdvancedImpl2 implements GreetService{
	
	private GreetNoteProvider gnp;
	
	public GreetServiceAdvancedImpl2() {
	
	}
	
	public GreetNoteProvider getGnp() {
		return gnp;
	}


	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}



	public GreetServiceAdvancedImpl2(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote() +userName;
	}


}
