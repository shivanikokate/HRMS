package com.hrms.testscripts;
import com.hrms.lib.*;
import org.apache.log4j.xml.DOMConfigurator;


public class TC_101 
{
	public static void main (String args[])throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General g =new General();
		g.openApp();
		g.waitStmt();
		g.verifyHrmsTitle();;
		g.login();
		g.verifyTitle();
		g.verifyWelcomeText();
		g.logout();
		g.closeApp();
	}
}
