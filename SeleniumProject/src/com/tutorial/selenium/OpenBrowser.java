package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		/*
		 * 
		 -ID
		-XPATH
		-CLASSNAME
		-NAME
		-LINK TEXT
		-PARTIAL LINK TEXT
		-CSS SELECTOR	*/
				
		
	    System.setProperty("webdriver.chrome.driver","G:\\SeleniumSoftware\\chromedriver.exe");	
		
	    System.out.println("Opening the browser");
	    
		WebDriver driver = new ChromeDriver();	
		
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
		
		driver.findElement(By.cssSelector("input[id=search_query_top]")).sendKeys("Testing");
		
		System.out.println("Entered search value");
		
		driver.findElement(By.partialLinkText("out")).click();
		
		System.out.println("Clicking on sign out");			

	}

}
