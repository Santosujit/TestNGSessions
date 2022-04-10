package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	int age = 10;

	@Test(expectedExceptions = { NullPointerException.class, ArithmeticException.class })

	// NullPointerException, ArithmeticException if they come It will be ignored,
	// test will be not halted
	public void a_test() {
		System.out.println(" A Test ");
		int i = 9 / 0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.age);
	}

}