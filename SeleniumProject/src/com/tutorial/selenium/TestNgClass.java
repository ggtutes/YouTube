package com.tutorial.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	
	
		@Test
	   public void test1() {			
			//#1 log into app
	      System.out.println("TestCase1");
	   }

	   @Test	   
	   public void test2() {		   
		   //#2 Book ticket
	      System.out.println("TestCase2");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("beforeMethod");
	   }	 

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("beforeClass");
	   }
	   
	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("beforeTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("beforeSuite");
	   }
	   
	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("afterMethod");
	   }	   
	   
	   @AfterTest
	   public void afterTest() {
	      System.out.println("afterTest");
	   }
	   
	   
	   @AfterClass
	   public void afterClass() {
	      System.out.println("afterClass");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("afterSuite");
	   }
	   


}
