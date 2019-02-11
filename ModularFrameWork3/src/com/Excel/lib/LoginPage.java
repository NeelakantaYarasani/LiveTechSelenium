package com.Excel.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginPage 
{
	public String username;
	public String password;
	public String URL;
	
	public  void  excelLogin() throws Exception
	{
		//File file=new File("G:\\LiveTech\\Selenium_Student_SW\\LoginFile.xlsx");
		File file=new File("./testData//LoginFile.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		username=sheet.getRow(1).getCell(0).getStringCellValue();
		
			System.out.println("User name is : "+username);
			
		password=sheet.getRow(1).getCell(1).getStringCellValue();
			
			System.out.println("Password is  : "+password);	
			
		URL=sheet.getRow(1).getCell(2).getStringCellValue();
			
			System.out.println("URL is  : "+URL);
				
	}
}

