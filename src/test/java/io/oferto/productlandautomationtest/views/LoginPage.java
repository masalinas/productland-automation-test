package io.oferto.productlandautomationtest.views;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {
	@Autowired
	private WebDriver webDriver;
	
	@FindBy(how = How.ID, using="username")
	public WebElement txtUsername;
		
	@FindBy(how = How.ID, using="password")
	public WebElement txtPassword;
		
	@FindBy(how = How.ID, using="kc-login")
	public WebElement btnLogin;
		
	@PostConstruct
	public void InitLoginPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public void login(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);			
	}
		
	public void clickLogin() {
		btnLogin.click();			
	}
}
