package ClearTriptest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class SuperTestScript
{
	String browsertype=ExcelLib.getdata("path", "TC_01", 0, 1);
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public static void openbrowser(String browsertype, String url)
	{
		if (browsertype.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("WebDriver.gecko.driver", "path");
			driver=new FirefoxDriver();
		}
		if (browsertype.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "path");
			driver=new ChromeDriver();
		}
		if (browsertype.equalsIgnoreCase("IE"))
		{
			System.setProperty("WebDriver.ie.driver", "path");
			driver=new InternetExplorerDriver();
		}
		driver.get("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public static void closebrowser() {
		driver.close();
	}
	
	@AfterSuite
	public static void executionReport()
	{
		Date d1= new Date();
		String t1=d1.toString().replace(":", "_");
	}
	
}
