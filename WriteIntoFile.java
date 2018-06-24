package com.visam.maven_demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoFile extends LoanService {

	public ArrayList<Details> details = new ArrayList<Details>();

	public void writeIntoFile() {
		Details d = new Details();
		d.insertData();
		details.add(d);

		try {

			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet spreadsheet = wb.createSheet("CustomerDetails");

			FileOutputStream fout = new FileOutputStream(
					new File("C:\\Users\\vandanavenkatesh\\Desktop\\Customer Detail.xlsx"));

			XSSFRow row = spreadsheet.createRow(0);
			row.createCell(0).setCellValue(d.getName());
			row.createCell(1).setCellValue(d.getScore());
			row.createCell(2).setCellValue(d.getSalary());

			wb.write(fout);
			fout.close();
			wb.close();
		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("Error creating");
		}

	}

}
