package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenQuest3 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenStudent.xlsx");
		FileInputStream fin = new FileInputStream(file);

		XSSFWorkbook wrkbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");

		XSSFRow createRow = sheet.createRow(11);
		// Cell createCell = createRow.createCell(0);
		// createCell.setCellValue("11");

		createRow.createCell(0).setCellValue("11");
		createRow.createCell(1).setCellValue("Esther");
		createRow.createCell(2).setCellValue("BE Mechanical");

		FileOutputStream fout = new FileOutputStream("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenStudent.xlsx");
		wrkbook.write(fout);
	}
}
