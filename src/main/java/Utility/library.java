package Utility;

import org.openqa.selenium.WebElement;

public class library {

	public static void custom_sendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
