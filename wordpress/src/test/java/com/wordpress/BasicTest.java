package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasicTest {
	public WebDriver driver;
	
	
	@Test
	public void testlaunchgoogle(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/wordpress/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("search-field")));
		driver.findElement(By.linkText("Log in")).click();;
		driver.quit();
		
	
		
	}
	
	
	

}
