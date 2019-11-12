package com.hrms.testscripts;
//import com.hrms.lib.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class Testng_TC_101 
{
	
	General g=new General();

	@BeforeMethod
	public void startup() throws Exception 
	{		
	g.openApp();
	System.out.println("1");
	g.waitStmt();
	System.out.println("2");
	g.verifyHrmsTitle();
	System.out.println("3");

	}
	@Test
	public void Login() throws Exception
	{
	g.login();
	g.verifyTitle();
	g.verifyWelcomeText();
	}
	
	@AfterMethod
	public void teardown() 
	{
		g.logout();
		g.closeApp();
	}
		
}
	


