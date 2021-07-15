package org.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\Sample.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet=w.getSheet("Sheet1");
		
		System.out.println("Names:-");
		Row r=sheet.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(c);
		
		Row r1=sheet.getRow(2);
		Cell c1=r1.getCell(1);
		System.out.println(c1);
		
		Row r2=sheet.getRow(3);
		Cell c2=r2.getCell(1);
		System.out.println(c2);
		
		Row r3=sheet.getRow(4);
		Cell c3=r3.getCell(1);
		System.out.println(c3);
		
		Row r4=sheet.getRow(5);
		Cell c4=r4.getCell(1);
		System.out.println(c4);
		
		System.out.println();
		System.out.println("Mobile Number:-");
		Row row=sheet.getRow(1);
		Cell c5=row.getCell(2);
		System.out.println((long)c5.getNumericCellValue());
		
		Row row1=sheet.getRow(2);
		Cell cell=row1.getCell(2);
		System.out.println((long)cell.getNumericCellValue());
		
		Row row2=sheet.getRow(3);
		Cell cell2=row2.getCell(2);
		System.out.println((long)cell2.getNumericCellValue());
		
		Row row3=sheet.getRow(4);
		Cell cell3=row3.getCell(2);
		System.out.println((long)cell3.getNumericCellValue());
		
		Row row4=sheet.getRow(5);
		Cell cell4=row4.getCell(2);
		System.out.println((long)cell4.getNumericCellValue());
		
		System.out.println();
		System.out.println("Email ID:-");
		Row row5=sheet.getRow(1);
		Cell cell1=row5.getCell(3);
		System.out.println(cell1);
		
		Row ro5=sheet.getRow(2);
		Cell cel1=ro5.getCell(3);
		System.out.println(cel1);
		
		Row r5=sheet.getRow(3);
		Cell ce1=r5.getCell(3);
		System.out.println(ce1);
		
		Row r11=sheet.getRow(4);
		Cell c11=r11.getCell(3);
		System.out.println(c11);
		
		Row r12=sheet.getRow(5);
		Cell c12=r12.getCell(3);
		System.out.println(c12);
		
	}
}
