package com.hrms.lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.Excel.lib.LoginPage;
import com.hrms.log4j.Log;


public class Gereral extends Global  
{	 
	String Emp_Code;
	public void browserOpen() 
	{
		driver=new ChromeDriver();
			System.out.println("Browser Opened");
		Reporter.log("Broeser Opened");
		Log.info("Browser Opened Successfully");
	}
	public void browserLogin() throws Exception 
	{
		LoginPage login=new LoginPage();
		login.excelLogin();
		driver.get(login.URL);	
		driver.findElement(By.name(txt_LoginName)).sendKeys(login.username);
		driver.findElement(By.name(txt_Password)).sendKeys(login.password);
		driver.findElement(By.name(button_Login)).click();
		Reporter.log("Application Login");
		Log.info("Application Login Successfully");
	}
	
	public void waitMethod() throws Exception 
	{
		Thread.sleep(2000);
	}
	
	public void maximizeBrowser() 
	{
		driver.manage().window().maximize();
	}
	
	public void applicationLogout() 
	{
		driver.findElement(By.linkText(link_Logout)).click();
			System.out.println("application logout");
			Reporter.log("Application is Logout");
			Log.info("Application Logout Successfully");
	}
	
	public void closeBrowser() 
	{
		driver.close();
			System.out.println("application closed");
			Reporter.log("Browser Closed");
			Log.info("Browser Closed");
	}
	
	public void addComponent() 
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Emp_Code=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
			System.out.println("Employee Code is : "+Emp_Code);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("neelakanta");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Selenium");
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
	}
	
	public void navigationtoBack() 
	{
		driver.navigate().back();
	}
	
	public void clickonSearchBy() throws Exception
	{
		driver.switchTo().frame("rightMenu");
		WebElement dropdown=driver.findElement(By.id("loc_code"));
		dropdown.click();
		Thread.sleep(3000);
		Select select=new Select(dropdown);
		Thread.sleep(3000);
		select.selectByVisibleText("Emp. ID");
		driver.switchTo().defaultContent();
	}
	
	public void searchFor() throws Exception
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("loc_name")).sendKeys(Emp_Code);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='0009'][@name='chkLocID[]']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().defaultContent();
			System.out.println("DeleteSuccessfully");
	} 
	
	public void takeScreenShot() throws Exception 
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots//HrmsLogin.png"));
		Reporter.log("ScreenShotTaken");
		Log.info("ScreenShot Successful");
	}
}
