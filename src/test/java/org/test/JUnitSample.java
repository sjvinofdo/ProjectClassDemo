package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JUnitSample {
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

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println("Before Method Date :" + date);
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println("After Method Date :" + date);
	}

	@Test
	public void testCase1() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("UsernameWelcome");
		Assert.assertTrue(true);
		// Assert.assertTrue(false);
	}

	@Ignore
	@Test
	public void testCase2() {
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("PasswordWelcome");
		String attribute = txtPassword.getAttribute("value");
		//Assert.assertEquals("Password", attribute);
		Assert.assertEquals("PasswordWelcome", attribute);
	}

	@Test
	public void testCase3() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
