package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name="userName") // WebElement username = driver.findElement(By.name("userName"));
	WebElement usernameTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	@FindBy(xpath="//span[contains(text(),'Enter your userName and password correct')]")
	WebElement enterValidCredentialsErrorMsg;
	
	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String username) {
		usernameTxtField.sendKeys(username);
	}
	
	public void typePassword(String password) {
		passwordTxtField.sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getEnterValidCredentialsErrorMsg() {
		return enterValidCredentialsErrorMsg.getText().trim();
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}

}
