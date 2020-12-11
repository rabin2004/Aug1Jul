package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginSuccessPage extends TestBase {

	@FindBy(xpath="//h3[text()='Login Successfully']")
	WebElement loginSuccessfulMsg;
	
	public LoginSuccessPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginSuccessMsg() {
		return loginSuccessfulMsg.getText();
	}
	
	public String getLoginSuccessPageTitle() {
		return driver.getTitle();
	}

	
}
