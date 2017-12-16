package com.tutorial.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\SeleniumSoftware\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Opened browser");
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Hiting the URL");		
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("dummy14567@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		
		//Thread.sleep(4000);
		
		//check if radio button is enabled
		
		boolean radioEnabled = driver.findElement(By.id("id_gender1")).isEnabled();
		
		if (radioEnabled=true) {

		//click on the radio button
		driver.findElement(By.id("id_gender1")).click();
		
		}
		
		//verify if clicked 
		boolean radioSelect = driver.findElement(By.id("id_gender1")).isSelected();
		
		if (radioSelect=true) {
			
			System.out.println("Radio button is Selected");
			
		}
		else {
			
			System.out.println("Radio button is NOT Selected");
			
		}
		
		//check if checkbox is enabled
		boolean checkboxEnabled = driver.findElement(By.id("newsletter")).isEnabled();
		
		
		
		if (checkboxEnabled=true)
		{
		
		// click on checkbox	
		driver.findElement(By.id("newsletter")).click();
		
		}
		
		//check if checkbox is selected
		boolean checkboxSelected = driver.findElement(By.id("newsletter")).isSelected();
		
		if (checkboxSelected=true) {
			
			System.out.println("checkbox is Selected");
			
		}
		else {
			
			System.out.println("checkbox is NOT Selected");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
