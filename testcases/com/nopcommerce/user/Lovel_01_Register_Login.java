package com.nopcommerce.user;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;






public class Lovel_01_Register_Login {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.out.println(projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath + "/browserDrivers/geckodriver");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		driver.get("https://www.nopcommerce.com/en");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
