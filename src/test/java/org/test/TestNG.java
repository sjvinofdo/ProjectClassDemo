package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Vinodhini Workspace\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
	
	@Test(invocationCount=3,priority=-1)
	public void testCase1() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("UsernameWelcome");
		Assert.assertTrue(true);
	}

	@Test(priority=-2)
	public void testCase2() {
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("PasswordWelcome");
		String attribute = txtPassword.getAttribute("value");
		Assert.assertEquals("PasswordWelcome", attribute);
	}

	@Test(priority=-0)
	//@Test(enabled=false)
	public void testCase3() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
