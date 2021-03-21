package com.promineo.tech;

public class AsteriskLogger implements Logger{ //having created the logger interface, I was presented with the prompt to auto import the method 
	//signatures from the interface, which I did.  These two method signatures will be further expanded upon here with empty bodies and 
	//override notation.  AsteriskLogger asks for two methods; the first is that I surround my data type String with Three Asterisks ***String***
	//the second that I generate an error message with Asterisks ***ERROR: String***


	@Override
	public void log(String log) {
		System.out.println("***"+ log + "***");
		
	}

	@Override
	public void error(String error) {
		System.err.println("****************\n***ERROR "+ error + "***\n****************");
		
	}

}
