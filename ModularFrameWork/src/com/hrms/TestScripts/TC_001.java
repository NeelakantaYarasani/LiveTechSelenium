package com.hrms.TestScripts;

import com.hrms.lib.*;
import org.testng.annotations.Test;

public class TC_001 
{
@Test 
	public void allMethods() throws Exception 
	{
		Gereral g=new Gereral();
		
		g.browserOpen();
		g.browserLogin();
		g.maximizeBrowser();
		g.waitMethod();
		g.applicationLogout();
		g.waitMethod();
		g.closeBrowser();
	}
}
