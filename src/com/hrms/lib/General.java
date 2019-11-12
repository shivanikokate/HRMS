package com.hrms.lib;
import org.openqa.selenium.By;
import com.utility.Log;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class General extends Global 
{
	public void openApp() throws Exception
	{
		Log.info("*******started execution***********");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium PDF\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		Log.info("Application Opened Successfully");
		System.out.println("Application Opened");
	}
	
	public void waitStmt() throws Exception
	{
		Thread.sleep(3000);
	}
	
	public void login() throws Exception
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();	
		Thread.sleep(3000);
		System.out.println("Login Completed");


	}
	public void logout()
	{
		driver.findElement(By.linkText(link_Logout)).click();
			System.out.println("Logout Completed");
	
	}
	
	public void closeApp()
	{
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application close successfully");
		Log.info("*******End execution***********");
	}
	
	public void addEmp()
	{
		System.out.println("Employee Added");
	}
	
	public void deleteEmp()
	{
		System.out.println("Employee deleted");

	}
	
		
		public void verifyHrmsTitle()
		{
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
			{
				System.out.println("HRMS Title Matched");
			}
			else
			{
				System.out.println("HRMS Title not Matched");

			}
		}
			public void verifyTitle()
			{
				if(driver.getTitle().equals("OrangeHRM"))
				{
					System.out.println(" Title Matched");
				}
				else
				{
					System.out.println("Title not Matched");

				}
			
			}
			
			public void verifyWelcomeText()
			{
				
				assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
				{
					System.out.println("text macthed");
				}
			}
			
			public void mouseOverPIM()throws Exception
			{
				WebElement element = driver.findElement(By.linkText("PIM"));
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				Thread.sleep(3000L);
				
			}
			
			public void clickAddemp()throws Exception

			{
				driver.findElement(By.linkText("Add Employee")).click();
				Thread.sleep(3000);
				System.out.println("Clicked on Add Employee submenu");
			}
			
			public void clickEmplist()throws Exception

			{
				driver.findElement(By.linkText("Employee List")).click();
				Thread.sleep(3000);
				System.out.println("Clicked on Employee List submenu ");
			}
			
			public void enterframe() 
			{
				driver.switchTo().frame("rightMenu"); 
			}
			public void exitframe()
			{
				driver.switchTo().defaultContent();
			}
			public void enterName()
			{
				driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
				driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
				driver.findElement(By.id("btnEdit")).click();
				System.out.println("Employee Added.........");
			}
			
			public void selEmpIdddl() throws Exception
			{
				Select drpdwn = new Select(driver.findElement(By.name("loc_code")));
				drpdwn.selectByVisibleText("Emp. ID");
				Thread.sleep(5000);
				//driver.findElement(By.xpath ("")).click();
			}
			
			public void enterId()
			{
				driver.findElement(By.name("loc_name")).sendKeys("0007");
			}
			
			public void clickSearch()
			{
				driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
				driver.findElement(By.name("chkLocID[]")).click();

			}
			
			public void clickDelete()
			{
				driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
				System.out.println("Record deleted successfully....");

			}
			
			}

