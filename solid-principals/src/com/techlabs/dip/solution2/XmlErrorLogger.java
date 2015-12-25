package com.techlabs.dip.solution2;

public class XmlErrorLogger implements IErrorLogger{
	@Override
	public void log(String msg){
		System.out.println("Generating xml....");
		System.out.println("for error : "+msg);
	}

}
