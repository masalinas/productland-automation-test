package io.oferto.productlandautomationtest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.oferto.productlandautomationtest.views.LoginPage;

@SpringBootTest
public class LoginPageTest {
	@Value("${app.url}")
	private String appUrl;
	
	@Autowired
	private WebDriver webDriver;
	
	@Autowired
	private LoginPage loginView;
		
	@Test
	public void loginManagerUser() {
		webDriver.navigate().to(appUrl);
		
		loginView.login("manager", "password");
		
		loginView.clickLogin();
	}
}
