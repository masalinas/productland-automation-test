package io.oferto.productlandautomationtest.ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(how = How.ID, using="username")
	public WebElement txtUsername;
		
	@FindBy(how = How.ID, using="password")
	public WebElement txtPassword;
		
	@FindBy(how = How.ID, using="kc-login")
	public WebElement btnLogin;
		
	public LoginPage(WebDriver webDriver) {
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
