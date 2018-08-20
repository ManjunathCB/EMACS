package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.E_Page;

public class LoginPage extends E_Page
{
	@FindBy(id="user")
	private WebElement untbox;
	@FindBy(id="pass")
	private WebElement pwdtbox;
	@FindBy(id="Image3")
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		submitbtn.click();
	}
	public void verifyLoginPage(String lp_title)
	{
		verifyTitle(lp_title);
	}
}
