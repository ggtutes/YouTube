package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ObjecInteractionsDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\SeleniumSoftware\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Opened browser");
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Hiting the URL");		
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("dummy14567@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		
		Thread.sleep(4000);	
			
		WebElement daysDropdown = driver.findElement(By.id("days"));
		
		WebElement monthsDropdown = driver.findElement(By.id("months"));
		
		WebElement yearsDropdown = driver.findElement(By.id("years"));
		
		Select days = new Select(daysDropdown);
		
		Select months = new Select(monthsDropdown);
		
		Select years = new Select(yearsDropdown);

		
		days.selectByIndex(2);
		months.selectByValue("3");
		years.selectByVisibleText("2017");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
