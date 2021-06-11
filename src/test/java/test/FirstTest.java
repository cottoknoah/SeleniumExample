package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	static WebDriver driver;
	String URL = "https://www.google.com";
	
	
//	CTRL + SHIFT + O for imports !!!
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/FireFox/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
	}
	
	
	@Before
	public void setup() {
		driver.get(URL);
	
	}
		
	@AfterClass
	public static void tearDown() {
		driver.quit();
		
	}
	
	
	@Test
	public void testOne()  throws InterruptedException {
		Thread.sleep(2000);
		
	}

}
