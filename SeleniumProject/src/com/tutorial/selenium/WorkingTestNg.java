package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingTestNg {
	
		public static WebDriver driver;	
	
		@Test
		public void loginTest() {
	 	System.setProperty("webdriver.chrome.driver","G:\\SeleniumSoftware\\chromedriver.exe");	
		
	    System.out.println("Opening the browser");
	    
		driver = new ChromeDriver();	
		
		System.out.println("Hitting URL");
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("login")).click();
		
		System.out.println("Clicking on Sign in object");
		
		driver.findElement(By.id("email")).sendKeys("ggtutes@gmail.com");
		
		System.out.println("Entering Email address");	
		
		driver.findElement(By.name("passwd")).sendKeys("12345");
		
		System.out.println("Entering Password");
		
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		
		System.out.println("Cliking on sign in button");		
		}
		
		@Test 
		public void verifyPhone() {			
			
			String actualText = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/span/strong")).getText();
			
			String expectedTest = "0442568987";
			
			Assert.assertEquals(actualText, expectedTest);
			
			
			
		}
		

}
