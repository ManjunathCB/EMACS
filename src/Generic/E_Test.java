package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class E_Test implements E_Const
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(gecko_key,gecko_value);
		driver=new FirefoxDriver();
		driver.get("http://emacs.adityabirlamoney.com/abm/Login.jsp");
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}
