package io.oferto.productlandautomationtest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.oferto.productlandautomationtest.page.LoginPage;
import io.oferto.productlandautomationtest.page.MainPage;

@SpringBootTest
public class LoginUsersPageTest {
	
	@Value("${app.url}")
	private String appUrl;
	
	//@Autowired
	private WebDriver webDriver;
	
	//@Autowired
	//private LoginPage loginView;
	
	//@Autowired
	//private MainPage mainPage;
	
    @BeforeEach
    void setupTest() {
    	webDriver = WebDriverManager.chromedriver().create();
    	webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void teardown() {
    	webDriver.quit();
    }
	
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
