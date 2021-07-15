package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentExcel {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\vinod\\OneDrive\\Desktop\\StudentDetails.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wrkbook = new XSSFWorkbook(fin);
		Sheet sheet = wrkbook.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows Present Sheet : " + physicalNumberOfRows);

		Row row = sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("No of Cells Present Row : " + physicalNumberOfCells);

		System.out.println();
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell1 = row1.getCell(j);
				int cellType = cell1.getCellType();
				if (cellType == 1) {
					String stringCellValue = cell1.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType == 0) {
					if (DateUtil.isCellDateFormatted(cell1)) {
						Date dateCellValue = cell1.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
						String format = sdf.format(dateCellValue);
						System.out.println(format);
					} else {
						double numericCellValue = cell1.getNumericCellValue();
						long l = (long) numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}
			}
		}
	}
}