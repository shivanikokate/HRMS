package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;

public class TC_103 
{
	public static void main (String args[]) throws Exception
	{
		DOMConfigurator.configure("log4j.xml");

		General g=new General();
		g.openApp();
		g.waitStmt();
		g.verifyHrmsTitle();
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
		g.logout();
		g.closeApp();
	}

}
