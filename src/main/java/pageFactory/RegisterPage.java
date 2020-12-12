package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath="//font[contains(text(),'To create your account')]")
	WebElement registerPageMsg;

	public RegisterPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean registerPageMsgDisplayed() {
		return registerPageMsg.isDisplayed();
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}

}
