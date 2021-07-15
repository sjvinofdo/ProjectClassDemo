package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentExcelInput {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\StudentDetails.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wrkbook = new XSSFWorkbook(fin);
		Sheet sheet = wrkbook.getSheet("Sheet1");

//		Row createRow1 = sheet.createRow(6);
//		Cell createCell1 = createRow1.createCell(1);
//		createCell1.setCellValue("Sri");
//
//		FileOutputStream fileOutputStream = new FileOutputStream(f);
//		wrkbook.write(fileOutputStream);
		
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(9);
		
		String course = cell.getStringCellValue();
		
		if(course.equals("MBA"))
		{
			cell.setCellValue("MCA");
		}
		FileOutputStream fout = new FileOutputStream(f);
		wrkbook.write(fout);

	}
}
