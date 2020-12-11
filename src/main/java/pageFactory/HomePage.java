package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	WebDriver driver;

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName") // WebElement username = driver.findElement(By.name("userName"));
	WebElement usernameTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
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

}
