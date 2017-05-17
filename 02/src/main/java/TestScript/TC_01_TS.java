package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01_TS {
	@Test
	public void run()
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/TYSS/Downloads/chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("bjbjh")).click();
		
}}
