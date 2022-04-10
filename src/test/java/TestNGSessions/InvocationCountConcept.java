package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10, priority = 1, expectedExceptions = ArithmeticException.class)

	// if you want to execute the same test case multiple times then use
	// invocationCount
	// If invocationCount=10, that test case will be executed 10 times
	// It is used to generate load
	// Login method will be executed 1000 times generating load testing
	public void homePageSearchTest() {
		System.out.println("Home Page Search Test");
	}

}