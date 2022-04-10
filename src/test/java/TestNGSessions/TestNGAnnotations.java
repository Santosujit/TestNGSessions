package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	// In TestNG you don't need to write main method
	// TestNG has its own mechanism to execute test cases

	@Test(priority = 1) // This test case will be executed 1st as Priority is given as 1
	public void addTest() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(c, 300);
	}

	@Test(priority = 2) // This test case will be executed 2nd as Priority is given as 2
	public void subTest() {
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println(c);
		Assert.assertEquals(c, 100);
	}

	@Test(priority = 3) // This test case will be executed 3rd as Priority is given as 3
	public void mulTest() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);
		Assert.assertEquals(c, 200);
	}
}
