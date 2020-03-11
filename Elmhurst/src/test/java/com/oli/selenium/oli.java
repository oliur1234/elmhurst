package com.oli.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oli {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mroli\\git\\Elmhurst\\Elmhurst\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("This page is before login"+driver.getTitle());
       driver.findElement(By.name("email")).sendKeys("moliurr@gmail.com");
       
       driver.findElement(By.name("pass")).sendKeys("javed1");
       
       driver.findElement(By.xpath("//*[@value='Log In']")).click();
       System.out.println("This page is after login"+driver.getTitle());
       driver.close();
	}

}
