package step_definitions;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageFactory.HomePage;

public class LogInFunctionalityTest extends TestBase {
	HomePage hp;
	
	public LogInFunctionalityTest() throws IOException {
		super();
		hp = new HomePage();
	}
	
	@BeforeMethod
	public void loadUrl() {
		initialization();
	}
	
	@Test
	public void positiveLoginFunctionalityTest() {
		Assert.assertEquals(hp.getHomePageTitle(), "Welcome: Mercury Tours");
		hp.typeUsername(prop.getProperty("validUsername"));
		hp.typePassword(prop.getProperty("validPassword"));
		hp.clickSubmitBtn();
		
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
