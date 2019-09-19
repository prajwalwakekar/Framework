package com.salesforce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() 
	{
		File src = new File("./TestData/LoginData.xlsx");
		try {
			FileInputStream fin = new FileInputStream(src);
			wb = new XSSFWorkbook(fin);
		
		} catch (Exception e) {
			System.out.println("Unable to read file" +e.getMessage());
		}
	}
	
	public String getStringData(int sheetIndex, int rowCount, int colCount)// to get value by index
	{
		return wb.getSheetAt(sheetIndex).getRow(rowCount).getCell(colCount).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int rowCount, int colCount)
	{
		return wb.getSheet(sheetName).getRow(rowCount).getCell(colCount).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int rowCount, int colCount)
	{
		return wb.getSheet(sheetName).getRow(rowCount).getCell(colCount).getNumericCellValue();
	}

}
