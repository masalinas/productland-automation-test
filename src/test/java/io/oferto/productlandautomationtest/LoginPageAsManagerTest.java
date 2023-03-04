package io.oferto.productlandautomationtest;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.oferto.productlandautomationtest.views.LoginView;

@SpringBootTest
public class LoginPageAsManagerTest {
	@Value("${app.url}")
	private String appUrl;
	
	@Autowired
	private WebDriver webDriver;
	
	@Autowired
	private LoginView loginView;
		
	@Test
	public void login() {
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriver.navigate().to(appUrl);
		
		loginView.login("manager", "password");		
		loginView.clickLogin();
	}
}
