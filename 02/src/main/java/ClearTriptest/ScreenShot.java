package ClearTriptest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class ScreenShot implements ITestListener{

	
		public void OnTestFailure(ITestResult il)
		{
		String m=il.getName();
		takeScreenshot(m);
	}

	public void takeScreenshot(String m) 
	{
			
		
			TakesScreenshot ss = (TakesScreenshot) SuperTestScript.driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Fail_Screenshot/"+m+".png");
		try
		{
				FileUtils.moveFile(src, dest);
		}
		catch (Exception ec)
		{
			Reporter.log("Screenshot not moved",true);
		}
		}
	
	
	public void onFinish(ITestContext arg0)
	{
		
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
