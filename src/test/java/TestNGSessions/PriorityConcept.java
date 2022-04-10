package TestNGSessions;

import org.testng.annotations.Test;

//Non-Priority based test cases are given 1st preference
//we can have even priority=0, this will be executed before priority = 1
//we can have priority = -1, -2, -3 also negative
//If two test cases are having same priority then order of execution is decided alphabetically

public class PriorityConcept {

	@Test()
	public void a_test() {
		System.out.println(" A Test ");
	}

	@Test()
	public void b_test() {
		System.out.println(" B Test ");
	}

	@Test(priority = 3)
	public void c_test() {
		System.out.println(" C Test ");
	}

	@Test(priority = 2)
	public void d_test() {
		System.out.println(" D Test ");
	}

	@Test(priority = 4)
	public void e_test() {
		System.out.println(" E Test ");
	}

}