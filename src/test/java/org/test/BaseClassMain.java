package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClassMain extends BaseClass {
	
	public static void main(String[] args) {
		browserConfig();
		openURL("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		maximizeWindow();
		
		WebElement textField = driver.findElement(By.xpath("(//input[@class='spTextField'])[1]"));
		input(textField,"Welcome");
		
		WebElement passField = driver.findElement(By.xpath("(//input[@class='spTextField'])[2]"));
		input(passField,"welcome@123");
		
		WebElement txtArea = driver.findElement(By.xpath("//textarea[@class='spTextField']"));
		clear(txtArea);
		input(txtArea,"Hello Welcome to the Base Class Session");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='cbselenium']"));
		click(checkBox);
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='radioselenium']"));
		click(radioBtn);
		
		WebElement multiSelect = driver.findElement(By.name("multipleselect[]"));
		selectByIndex(multiSelect, 0);
		
		WebElement multiSelect1 = driver.findElement(By.name("multipleselect[]"));
		selectByValue(multiSelect1,"msmanual");
		
		WebElement multiSelect2 = driver.findElement(By.name("multipleselect[]"));
		selectByVisibleText(multiSelect2,"Selenium");
		
		WebElement dropDown = driver.findElement(By.xpath("(//select[@class='spTextField'])[2]"));
		getFirstSelectedOption(dropDown);
		
//		WebElement dropDown1 = driver.findElement(By.xpath("(//select[@class='spTextField'])[2]"));
//		getOptions(dropDown1);
		
		isMultiple(dropDown);
		
		closeBrowser();
	}
	
	

}
