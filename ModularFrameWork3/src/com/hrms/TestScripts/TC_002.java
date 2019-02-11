package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Gereral;

public class TC_002 
{
	@Test
	public void functions() throws Exception
	{
		Gereral g=new Gereral();
		g.browserOpen();
		g.browserLogin();
		g.waitMethod();
		g.addComponent();
		g.applicationLogout();
		g.waitMethod();
		g.closeBrowser();
	}
}
