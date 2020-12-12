package step_definitions;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageFactory.HomePage;
import pageFactory.RegisterPage;

public class HomePageLinksTest extends TestBase {
	HomePage hp;
	RegisterPage rp;

	public HomePageLinksTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void loadUrl() throws IOException {
		initialization();
		hp = new HomePage();
		rp = new RegisterPage();
	}
	
	@Test
	public void registerLinkTest() {
		Assert.assertEquals(hp.getHomePageTitle(), "Welcome: Mercury Tours");
		hp.clickRegisterLink();
		Assert.assertTrue(rp.registerPageMsgDisplayed());
		Assert.assertEquals(rp.getRegisterPageTitle(), "Register: Mercury Tours");		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
