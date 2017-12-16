package com.tutorial.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\SeleniumSoftware\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);			
		
		System.out.println("Opened browser");
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Hiting the URL correctly");		
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("dummy14567@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		
		//WebDriverWait eWait = new WebDriverWait(driver,10); 
		
		//eWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1"))).click();

		//click on the radio button		
		Thread.sleep(4000);
		
		driver.findElement(By.id("id_gender1")).click();
		
		System.out.println("RadioButton is clicked");

		System.out.println("Hiting the URL correctly");//Change made by person1
		
		
	}

}
