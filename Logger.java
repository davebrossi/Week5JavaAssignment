package com.promineo.tech;

public interface Logger { //This is the first step in meeting the needs of the homework prompt.  These method signatures will be applied
	//to the two classes we apply the methods through, AsteriskLogger and SpacedLogger, each with its own method to produce two types of
	//results we can then Instantiate in the final entry point main method 'App' class.  We generate two signatures, one for log, one for 
	//error both of a string type.  
	public void log(String log);
	
	public void error(String error);
	
	
}
