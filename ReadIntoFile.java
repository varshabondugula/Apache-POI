package com.visam.maven_demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadIntoFile extends LoanService {

	public void readIntoFile() {

		try {

			FileInputStream fin = new FileInputStream(
					new File("C:\\Users\\vandanavenkatesh\\Desktop\\Customer Detail.xlsx"));
			XSSFWorkbook wb1 = new XSSFWorkbook(fin);
			XSSFSheet spreadsheet = wb1.getSheetAt(0);

			XSSFRow row = spreadsheet.getRow(0);
			System.out.println("Your Details");

			for (int c = 0; c < 3; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.println(cell.getStringCellValue());
				System.out.println("file read");
			}

		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("file not read");
		}
	}

}
