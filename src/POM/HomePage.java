package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.E_Page;

public class HomePage extends E_Page
{
	@FindBy(xpath="//a[@href='Logout.jsp']")
	private WebElement logoutbtn;
	@FindBy(xpath="//img[@src='images/EMACS.jpg']")
	private WebElement emactab;
	@FindBy(xpath="//img[@src='images/Wedge.jpg']")
	private WebElement wedgetab;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logoutbtn.click();
	}
	public void clickEmac()
	{
		emactab.click();
	}
	public void clickWedge()
	{
		wedgetab.click();
	}
	public void verifyHomePage(String hp_title)
	{
		verifyTitle(hp_title);
	}

}
