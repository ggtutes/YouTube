package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\SeleniumSoftware\\chromedriver.exe");	
		
	    System.out.println("Opening the browser");
	    
		WebDriver driver = new ChromeDriver();	
		
		System.out.println("Hitting URL");
		
		driver.get("http://www.x-rates.com/table/?from=USD&amount=1");		
		
		for (int i=1;i<=3;i++)
			{
			
			WebElement header = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div[1]/div[1]/table[1]/thead/tr/th["+i+"]"));
			
			System.out.println("Header "+ i+ " = " + header.getText());
			
			}	
		
		
		for (int j=1;j<=10;j++)//rows
		{
			for (int k=1;k<=3;k++)//cols
			{
				WebElement body = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div[1]/div[1]/table[1]/tbody/tr[1]/td[1]"));
				
				System.out.println("Row "+j +" columnn "+ k + "="+ body.getText());
			}
		
		}
		
		
		}
		
		
		
		
		
		
		

	}


