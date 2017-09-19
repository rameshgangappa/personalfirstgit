package com.wd.ohrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ohrmaddempoyee1{
	WebDriver driver;
	@BeforeClass
	public void OpenApplication() {
		
		// opening browser
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		// open application
		//Desiredbrowser.openApplication(driver, "http://opensource.demo.orangehrmlive.com");
		//ohrm = new OhrmInt(driver);
		//Webdr
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("rock1");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("rock2");
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	}

	@AfterClass
	public void closeApplication() {
		//ohrm.closeApplication();
		driver.close();
		
	}
}
