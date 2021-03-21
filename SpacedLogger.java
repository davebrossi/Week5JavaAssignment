package com.promineo.tech;

public class SpacedLogger implements Logger{ //having created instances of classes to allow us to create Asterisk Logger, we now turn to the 
	//task of creating the second implementing class based around altering the format of Strings to include spaces between each character, i.e,
	//'hello' becomes "h e l l o" 
//going off Stack Overflow, the simplest way to parse out a String is to replace "" with " " and .trim to remove leading and trailing spaces.  
	//this is written as .replace("", " ").trim()
	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ").trim());
		
	}

	@Override
	public void error(String error) {
		System.err.println("Error!! " + error.replace("", " ").trim());
		
	}


		
	}


