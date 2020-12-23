package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	//open browser
	@Before
	public void open() {
		
		driver=new ChromeDriver();
		driver.get("http://www.jcpenny.com");
		
	}
	
	//close browser
	@After
	public void close() {
		
		driver.quit();
	}
	

}
