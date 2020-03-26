package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelTestdata
{
	public  String excel_username(int a) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\triveni\\Desktop\\Projectframework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheetAt(0);	
		String ab =sheet.getRow(a).getCell(0).getStringCellValue();		
		return ab;
	}
			
//	To read and return the password
	public  String excel_password(int b) throws IOException 
	{ 
	FileInputStream fil = new FileInputStream(new File("C:\\Users\\triveni\\Desktop\\Projectframework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String pwd =sheet.getRow(b).getCell(1).getStringCellValue();			          
	    return pwd;
  }

}
