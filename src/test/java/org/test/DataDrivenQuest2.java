package org.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenQuest2 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenStudent.xlsx");
		FileInputStream fin = new FileInputStream(file);

		Workbook wrkbook = new XSSFWorkbook(fin);
		Sheet sheet = wrkbook.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			System.out.println("Row"+ i+" data is :");
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+",");
			}
			System.out.println();

		}
	}
}
