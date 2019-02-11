package com.hrms.TestScripts;

import org.testng.annotations.Test;

public class GroupExceution 
{
	@Test(groups="functional")
	public void createUserOne() 
	{
		System.out.println("Functional Testing");
	}
	
	@Test(groups="functional")
	public void createUserTwo() 
	{
		System.out.println("Functional Testing");
	}
	
	@Test(groups="Regresstion")
	public void createUserThree() 
	{
		System.out.println("Regresstion Testing");
	}
	
	@Test(groups="santity")
	public void createUserFour() 
	{
		System.out.println("Santity Testing");
	}
	
	@Test(groups="Regresstion")
	public void createUserFive() 
	{
		System.out.println("Regresstion Testing");
	}
	
	@Test(groups="santity")
	public void createUserSix() 
	{
		System.out.println("Santity Testing");
	}
	
	@Test(groups="functional")
	public void createUserSeven() 
	{
		System.out.println("Functional Testing");
	}
	
	@Test(groups="santity")
	public void createUserEight() 
	{
		System.out.println("Santity Testing");
	}
	
	@Test(groups="functional")
	public void createUserNine() 
	{
		System.out.println("Functional Testing");
	}
}
