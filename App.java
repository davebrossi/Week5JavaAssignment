package com.promineo.tech;

public class App {

	
	public static void main(String[] args) { //In the end, this is where we'll create instances of each logger, as there should be four unique
		//methods resulting from the interface, and two classes that will implement the methods. At least in the context of what is asked,
		//we'll be implementing the methods one at a time to make use of the logger interface.  

		Logger logger = new AsteriskLogger();
		logger.log("How are you Gentlemen!?!?");
		logger.error ("All of your base, are belong to us!!");
		
		Logger logger1 = new SpacedLogger(); //initially I was concerned about the fact that you cannot reuse the the same Interface interface = 
		//new Reference class for instantiation.  However, guess and check comes in handy here.  It turns out that since you -cannot- duplicate
		//the interface, you -can- rename the second instance and still Instantiate
		
		logger1.log("You are on your way to destruction!!");
		logger1.error("WHAT YOU SAY!?");
		
		
		
	}
	}


