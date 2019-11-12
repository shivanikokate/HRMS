package Testng_Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_101
{
	
	WebDriver driver;
	@Test
	public void openFF() throws Exception 
	{
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Reporter.log("Opened HRMS application in Firefox Browser");
	Thread.sleep(5000L);
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
	if(browser.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium PDF\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
	//else if(browser.equals("IE")) {
	//System.setProperty("webdriver.ie.driver","E:\\Selenium\\WebDriver\\chromedriver_win32\\IEDriverServer.exe");
	//driver=new InternetExplorerDriver();
	//}
	else if(browser.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium PDF\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
