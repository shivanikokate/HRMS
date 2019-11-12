package Testng_Example;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Loginlogout 
{
	  @BeforeMethod
	public void login()
	{
		Reporter.log("login completed");
		System.out.println("Login completed");
		
	}
	@Test(priority=2)
	public void addEmp()
	{
		Reporter.log("Emp Added");
		System.out.println("Emp Added");

		
	}
	
	@Test(priority=1)
	public void delEmp()
	{
		Reporter.log("Emp Deleted");
		System.out.println("Emp deleted");


	}
	
	@AfterMethod 
	public void logout()
	{
		System.out.println("Logout completed");

		Reporter.log("logout completed");
	}

}
