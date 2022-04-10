package TestNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {// It's the parent class, we have used Inheritance concept in TestNG

	WebDriver driver;

	@BeforeTest // these codes are common to all the classes, launching and quitting browser
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
