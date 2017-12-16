package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectInteractionsCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\SeleniumSoftware\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Opened browser");
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Hiting the URL");		
		
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();	
		
		
		boolean isEnabled= driver.findElement(By.id("layered_category_9")).isEnabled();
		
		driver.findElement(By.id("layered_category_9")).click();
		
		boolean isSelected= driver.findElement(By.id("layered_category_9")).isSelected();
				
				
		System.out.println("Checkbox is "+ isEnabled);
		
		System.out.println("Checkbox is "+ isSelected);
		
		
		
		
		
		
		
		
		
	}

}
