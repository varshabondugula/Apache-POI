package com.visam.maven_demo1;

import java.io.*;

import java.util.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.*;

public class LoanService extends Details {

	public static void main(String s[]) {

		WriteIntoFile w = new WriteIntoFile();
		ReadIntoFile r = new ReadIntoFile();

		w.writeIntoFile();
		r.readIntoFile();

	}

}
