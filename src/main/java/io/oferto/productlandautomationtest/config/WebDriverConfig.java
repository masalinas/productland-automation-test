package io.oferto.productlandautomationtest.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Configuration
public class WebDriverConfig {

	@Bean
	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return webDriver;
	}
}
