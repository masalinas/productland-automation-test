package io.oferto.productlandautomationtest.ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(how = How.ID, using="name")
	public WebElement lblName;
	
	public MainPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public String getName() {
		return lblName.getText();			
	}
}
