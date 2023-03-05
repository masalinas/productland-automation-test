package io.oferto.productlandautomationtest.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import io.oferto.productlandautomationtest.ui.page.LoginPage;
import io.oferto.productlandautomationtest.ui.page.MainPage;

public class LoginUsersPageTest extends BasePageTest {

	@Test
	public void loginAsManager() {
		webDriver.get(appUrl);	
		
		LoginPage loginView = new LoginPage(webDriver);
				
		loginView.login("manager", "password");		
		loginView.clickLogin();
		
		MainPage mainPage = new MainPage(webDriver);
		String name = mainPage.getName();
		
		assertEquals("Manager, ProductLand", name);
	}
	
	@Test
	public void loginAsReviewer() {
		webDriver.get(appUrl);
		
		LoginPage loginView = new LoginPage(webDriver);
				
		loginView.login("reviewer", "password");		
		loginView.clickLogin();
		
		MainPage mainPage = new MainPage(webDriver);
		String name = mainPage.getName();
		
		assertEquals("Reviewer, ProductLand", name);
	}
		
	@Test
	public void loginAsPremium() {
		webDriver.get(appUrl);
		
		LoginPage loginView = new LoginPage(webDriver);
				
		loginView.login("premium", "password");		
		loginView.clickLogin();
		
		MainPage mainPage = new MainPage(webDriver);
		String name = mainPage.getName();
		
		assertEquals("Premium, ProductLand", name);
	}
	
	@Test
	public void loginAsUser() {
		webDriver.get(appUrl);
		
		LoginPage loginView = new LoginPage(webDriver);
				
		loginView.login("user", "password");		
		loginView.clickLogin();
		
		MainPage mainPage = new MainPage(webDriver);
		String name = mainPage.getName();
		
		assertEquals("User, ProductLand", name);
	}
}
