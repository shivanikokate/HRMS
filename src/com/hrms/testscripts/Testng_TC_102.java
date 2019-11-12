package com.hrms.testscripts;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import com.hrms.lib.General;

public class Testng_TC_102 
{	
		General g=new General();
		//@Test(priority=1)
		@BeforeClass
		public void startup() throws  Exception
		{
		g.openApp();
		g.waitStmt();
		g.verifyHrmsTitle();;
		g.login();
		}
		//@Test(priority=2)
		@Test
		public void mouseoververify() throws  Exception
		{		
		g.verifyTitle();
		g.verifyWelcomeText();
		g.mouseOverPIM();
		g.clickAddemp();
		g.enterframe();
		g.enterName();
		g.exitframe();
		g.waitStmt();
		}
		
		//@Test(priority=3)
		@AfterClass
		public void teardown() 
		{
		g.logout();
		g.closeApp();
		}

	}


