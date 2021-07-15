package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinHotelApp extends BaseClass {
	public static void main(String[] args) throws Exception {
		browserConfig();
		openURL("http://adactinhotelapp.com/index.php");
		maximizeWindow();
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		input(txtUsername, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","LoginInformation",1,0));
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		input(txtPassword, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","LoginInformation",1,1));

		WebElement btnLogin = driver.findElement(By.id("login"));
		click(btnLogin);
		
		WebElement ddnLocation = driver.findElement(By.id("location"));
		selectByIndex(ddnLocation, 5);
		
		WebElement ddnHotel = driver.findElement(By.id("hotels"));
		selectByValue(ddnHotel,"Hotel Sunshine");
		
		WebElement ddnRoomType = driver.findElement(By.id("room_type"));
		selectByVisibleText(ddnRoomType,"Super Deluxe");
		
		WebElement ddnNoofRoom = driver.findElement(By.id("room_nos"));
		selectByValue(ddnNoofRoom,"2");
		
		WebElement txtCheckInDate = driver.findElement(By.id("datepick_in"));
		clear(txtCheckInDate);
		input(txtCheckInDate,excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,0));
		
		WebElement txtCheckOutDate = driver.findElement(By.id("datepick_out"));
		clear(txtCheckOutDate);
		input(txtCheckOutDate,excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,1));
		
		WebElement ddnAdultsRoom = driver.findElement(By.id("adult_room"));
		selectByValue(ddnAdultsRoom,"2");
		
		WebElement ddnChildrenRoom = driver.findElement(By.id("child_room"));
		selectByVisibleText(ddnChildrenRoom,"2 - Two");
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		click(btnSearch);
		
		WebElement radioButtonSelect = driver.findElement(By.id("radiobutton_0"));
		click(radioButtonSelect);
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		click(btnContinue);
		
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		input(txtFirstName, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,2));
		
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		input(txtLastName, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,3));
		
		WebElement txtBillingAddress = driver.findElement(By.id("address"));
		input(txtBillingAddress, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,4));
		
		WebElement txtCreditCardNo = driver.findElement(By.id("cc_num"));
		input(txtCreditCardNo, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,5));
		
		WebElement ddnCreditCardType = driver.findElement(By.id("cc_type"));
		selectByValue(ddnCreditCardType,"MAST");
		
		WebElement ddnExpiryDateMonth = driver.findElement(By.id("cc_exp_month"));
		selectByVisibleText(ddnExpiryDateMonth,"August");
		
		WebElement ddnExpiryDateYear = driver.findElement(By.id("cc_exp_year"));
		selectByIndex(ddnExpiryDateYear, 12);
		
		WebElement txtCVVNo = driver.findElement(By.id("cc_cvv"));
		input(txtCVVNo, excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx","HotelInformation",1,6));
		
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		click(btnBookNow);
		
		Thread.sleep(10000);
		
		WebElement txtOrderNo = driver.findElement(By.id("order_no"));
		String text = txtOrderNo.getAttribute("value");	
		System.out.println("Order Number :"+text);
		excelwrite("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx", "OrderInformation", 0, 0, text);
		
		WebElement btnLogout = driver.findElement(By.id("logout"));
		click(btnLogout);
		
	}

}
