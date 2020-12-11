package step_definitions;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageFactory.HomePage;
import pageFactory.LoginSuccessPage;

public class LogInFunctionalityTest extends TestBase {
	HomePage hp;
	LoginSuccessPage lsp;
	
	public LogInFunctionalityTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void loadUrl() throws IOException {
		initialization();
		hp = new HomePage();
		lsp = new LoginSuccessPage();
	}
	
	@Test
	public void positiveLoginFunctionalityTest() {
		Assert.assertEquals(hp.getHomePageTitle(), "Welcome: Mercury Tours");
		hp.typeUsername(prop.getProperty("validUsername"));
		hp.typePassword(prop.getProperty("validPassword"));
		hp.clickSubmitBtn();
		
		Assert.assertEquals(lsp.getLoginSuccessPageTitle(), "Login: Mercury Tours");
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
