package Test_login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Obj.LoginPom;
import Utility.BaseClass;
import Utility.ExcelDataProvider;
import Utility.library;

public class VerifyLoginTest extends BaseClass {

	@Test
	public void TC_001() throws Exception {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
			//login.getTxt_email().sendKeys("Test1");
			//login.getTxt_pass().sendKeys("123456789");
	        //library.custom_sendkeys(login.getTxt_email(),"Test");
	        //library.custom_sendkeys(login.getTxt_pass(),"12345");
			library.custom_sendkeys(login.getTxt_email(),ExcelDataProvider.getstingdata("Sheet1", 0, 0));
            library.custom_sendkeys(login.getTxt_pass(),ExcelDataProvider.getstingdata("Sheet1", 0, 1));
	}
}