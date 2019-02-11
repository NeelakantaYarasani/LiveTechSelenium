package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global 
{
	//Variables 
	static WebDriver driver;
	static String URL="http://127.0.0.1/orangehrm-2.6/login.php";
	
	//Obejects
	static String txt_LoginName="txtUserName";
	static String txt_Password="txtPassword";
	static String button_Login="Submit";
	static String link_Logout="Logout";	
}
