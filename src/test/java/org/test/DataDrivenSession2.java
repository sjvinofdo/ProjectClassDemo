package org.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSession2 {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\Sample.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wrkbook = new XSSFWorkbook(fin);
		Sheet sheet = wrkbook.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows Present Sheet : " + physicalNumberOfRows);

		Row row = sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("No of Cells Present Row : " + physicalNumberOfCells);
		System.out.println();
		System.out.println("To print particular Row Values");
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
		}

		System.out.println();
		System.out.println("To Print all the values from the sheet");
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row1.getCell(j);
				System.out.println(cell);
			}

		}

		System.out.println();
		Row row2 = sheet.getRow(2);
		Cell cell1 = row2.getCell(0);
		System.out.println(cell1);

		System.out.println();
		int cellType = cell1.getCellType();
		System.out.println("Cell Type : " + cellType);

		if (cellType == 1) {
			String stringCellValue = cell1.getStringCellValue();
			System.out.println(stringCellValue);
		}

		else if (cellType == 0) {
			double numericCellValue = cell1.getNumericCellValue();
			System.out.println(numericCellValue);
		}

	}
}
