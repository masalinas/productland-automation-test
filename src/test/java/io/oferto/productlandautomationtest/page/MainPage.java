package io.oferto.productlandautomationtest.page;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MainPage {
	
	//@Autowired
	//private WebDriver webDriver;
	
	@FindBy(how = How.ID, using="name")
	public WebElement lblName;
	
	/*@PostConstruct
	public void InitLoginPage() {
		PageFactory.initElements(webDriver, this);
	}*/
	
	public MainPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public String getName() {
		return lblName.getText();			
	}
}
