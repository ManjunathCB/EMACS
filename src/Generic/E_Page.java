package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class E_Page 
{
	public WebDriver driver;
	public E_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching",true);
		   }
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
		}
	
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Present",true);
		   }
		catch(Exception e)
		{
			Reporter.log("Element is not Present",true);
			Assert.fail();
		}
	
	}

}
