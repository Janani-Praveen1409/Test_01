package com.MavenExcelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {

	public static void main(String[] args) throws IOException, Exception {

		File f = new File("C:\\Users\\HP  1022\\eclipse-workspace\\MavenExcelDemo\\salary.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Cell cell = wb.getSheetAt(0).getRow(1).getCell(1);
		System.out.println(cell);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING));
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
	}
	else if()
}