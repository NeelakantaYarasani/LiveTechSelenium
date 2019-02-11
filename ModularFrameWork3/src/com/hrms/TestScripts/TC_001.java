package com.hrms.TestScripts;

import com.hrms.lib.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC_001 
{
@Test 
	public void allMethods() throws Exception 
	{
		DOMConfigurator.configure("log4j.xml");
		
		Gereral g=new Gereral();
		
		g.browserOpen();
		g.browserLogin();
		g.waitMethod();
		g.takeScreenShot();
		g.maximizeBrowser();
		g.waitMethod();
		g.applicationLogout();
		g.waitMethod();
		g.closeBrowser();
	}
}
