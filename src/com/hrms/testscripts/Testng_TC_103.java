package com.hrms.testscripts;
import org.testng.annotations.Test;


import com.hrms.lib.General;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class Testng_TC_103 
{
	General g=new General();
	@BeforeMethod
	public void startup() throws Exception
	{
		g.openApp();
		g.waitStmt();
		g.verifyHrmsTitle();
	}
	@Test
	public void funct() throws Exception
	{
		g.login();
		g.verifyTitle();
		g.verifyWelcomeText();
		g.mouseOverPIM();
		g.clickEmplist();
		g.enterframe();
		g.selEmpIdddl();
		g.enterId();
		g.clickSearch();
		g.clickDelete();
		g.exitframe();
		g.waitStmt();

	}
	@AfterMethod
	public  void teardown()
	{
		g.logout();
		g.closeApp();
	}
	
}


