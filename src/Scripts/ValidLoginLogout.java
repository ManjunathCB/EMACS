package Scripts;

import org.testng.annotations.Test;

import Generic.E_Test;
import Generic.Excel;
import POM.HomePage;
import POM.LoginPage;

public class ValidLoginLogout extends E_Test
{


	@Test
	public void testValidLoginLogout() throws InterruptedException
	{
		String un=Excel.getCellValue(ExcelPath,"ValidLoginLogout",1,0);
		String pwd=Excel.getCellValue(ExcelPath,"ValidLoginLogout",1,1);
		//String lp_title=Excel.getCellValue(ExcelPath,ValidLoginLogout,1,2);
		//String hp_title=Excel.getCellValue(ExcelPath,ValidLoginLogout,1,3);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		//Thread.sleep(3000);
		lp.clickLogin();
		//Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		//hp.verifyHomePage(hp_title);
		hp.clickLogout();
		//lp.verifyLoginPage(lp_title);
		   
	}

}
