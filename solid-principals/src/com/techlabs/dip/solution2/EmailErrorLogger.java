package com.techlabs.dip.solution2;

public class EmailErrorLogger implements IErrorLogger {
	@Override
	public void log(String msg){
		System.out.println("sending email....");
		System.out.println("for error : "+msg);
	}

}
