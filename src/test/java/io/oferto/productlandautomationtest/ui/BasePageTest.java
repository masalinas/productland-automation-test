package io.oferto.productlandautomationtest.ui;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
public class BasePageTest {
	@Value("${app.url}")
	protected String appUrl;
	
	protected WebDriver webDriver;
	
    @BeforeEach
    void setupTest() {
    	webDriver = WebDriverManager.chromedriver().create();
    	webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void teardown() {
    	webDriver.quit();
    }
}
