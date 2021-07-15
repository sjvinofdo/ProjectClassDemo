package org.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenQuest1 {
	public static void main(String[] args) throws Exception {
		File file=new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenStudent.xlsx");
		FileInputStream fin=new FileInputStream(file);
		
		Workbook wrkbook=new XSSFWorkbook(fin);
		Sheet sheet=wrkbook.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of Rows in excel sheet : "+physicalNumberOfRows);
		
		Row row=sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("Total number of cells in excel sheet : "+physicalNumberOfCells);
		
	}
}
