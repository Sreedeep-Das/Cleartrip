package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ClearTriptest.SuperTestScript;

public class BaseClass {
	
	 public WebElement w;
	 Alert a1=SuperTestScript.driver.switchTo().alert();
	 public void alertconfirm()
	 {
		 a1.accept();
	 }
	 public void alertcancel()
	 {
		 a1.dismiss();
	 }
	 public  void alertMsg()
		{
			a1.getText();
		}
	 Select s1=new Select(w);
	 public  void selectIndex(int n)
		{
			s1.selectByIndex(n);
			
		}
	 public  void deselectIndex(int n)
		{
			s1.deselectByIndex(n);
		}
		public  void selectvalue(String val)
		{
			s1.selectByValue(val);
		}
		public  void deselectvalue(String val)
		{
			s1.deselectByValue(val);
		}
		public  void selectText(String val)
		{
			s1.selectByVisibleText(val);
		}
		public  void deselectText(String val)
		{
			s1.deselectByVisibleText(val);
		}
		public  void check()
		{
			Boolean s2=s1.isMultiple();
		}
		
		public  void alloption()
		{
			s1.getAllSelectedOptions();
		}
		
		public  void firstoption()
		{
			s1.getFirstSelectedOption();
		}
		public  void option()
		{
			s1.getOptions();
		}
		public  void frameIndex(int n)
		{
			SuperTestScript.driver.switchTo().frame(n);
		}
		
		public  void frameelement(WebElement e1)
		{
			SuperTestScript.driver.switchTo().frame(e1);
		}
		
		public  void framevisibleText(String text)
		{
			SuperTestScript.driver.switchTo().frame( text);
		}
		Actions a2=new Actions(SuperTestScript.driver);
		
		public  void movingElement(WebElement e1)
		{
			a2.moveToElement(e1).perform();
		}
		
		public  void rightClick()
		{
			a2.contextClick().perform();
		}
		
		public  void rightClickElement(WebElement e1)
		{
			a2.clickAndHold(e1).perform();
		}
		public  void doubleClick()
		{
			a2.doubleClick().perform();
		}
		
		public  void releseElement(WebElement dec)
		{
			a2.release(dec).perform();
		}
		
		public  void dragAndDrop(WebElement src,WebElement tar)
		{
			a2.dragAndDrop(src, tar).perform();
		}
		public  void dragAndDropWithXY(WebElement src,int x,int y)
		{
		
			a2.dragAndDropBy(src, x, y);
		}
		JavascriptExecutor jse=(JavascriptExecutor)SuperTestScript.driver;
		
		
		public  void Scroll()
		{
			jse.executeScript("window.scrollBy(0,50)");
					
		}
		public  void handlingAlert()
		{
			jse.executeScript("alert('hello world')");
		}
		public  void click(WebElement e1)
		{
			jse.executeScript("arguments[0].click();", e1);
		}
		public  void sendKeys(String text,WebElement e1)
		{
			jse.executeScript("arguments[0].value="+text, e1);
		}
		
		public  void getTheTitle()
		{
			String t1 =  jse.executeScript("return document.title;").toString();
		}
		public  void navigateToDifferentPage(String url)
		{
			jse.executeScript("window.location ="+url);
		}
		
		
		
		
		
}
		
	
		