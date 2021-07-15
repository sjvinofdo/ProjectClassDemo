package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Vinodhini Workspace\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openURL(String URL) {
		driver.get(URL);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void input(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void selectByIndex(WebElement element, int no) {
		Select select = new Select(element);
		select.selectByIndex(no);
	}

	public static void selectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public static void selectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public static void getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
	}

	public static void getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

//	public static void getOptions(WebElement element, int value) {
//		Select select = new Select(element);
//		List<WebElement> options = select.getOptions();
//		WebElement webElement = options.get(value);
//		String text = webElement.getText();
//		System.out.println(text);
//	}

	public static void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public static void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);
	}

	public static void isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		System.out.println("GetText value: "+text);
		return text;
	}

	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	public static String excelRead(String location, String sheetname, int rowvalue, int cellvalue) throws Exception {
		File fpath = new File(location);
		FileInputStream fins = new FileInputStream(fpath);
		Workbook wrkbook = new XSSFWorkbook(fins);
		Sheet sheet = wrkbook.getSheet(sheetname);

		Row row = sheet.getRow(rowvalue);
		Cell cell = row.getCell(cellvalue);
		String value = " ";

		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				value = sdf.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
		}
		return value;

	}

	public static void excelwrite(String location, String sheetname, int rowvalue, int cellvalue, String name)
			throws Exception {

		File fpath = new File(location);
		FileInputStream fins = new FileInputStream(fpath);
		Workbook wrkbook = new XSSFWorkbook(fins);
		Sheet sheet = wrkbook.createSheet(sheetname);

		Row createRow = sheet.createRow(rowvalue);
		Cell createCell = createRow.createCell(cellvalue);
		createCell.setCellValue(name);

		FileOutputStream fout = new FileOutputStream(fpath);
		wrkbook.write(fout);
	}
}
