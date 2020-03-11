package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tuesday {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mroli\\git\\PremierLeague\\Driver\\chromedriver.exe");
	
	WebDriver obj = new ChromeDriver();
	
	obj.get("https://www.facebook.com/");
	
	obj.getTitle();
	
	obj.findElement(By.xpath("//*[@id='email']")).sendKeys("moliurr@gmail.com");
	obj.findElement(By.xpath("//*[@id='pass']")).sendKeys("javed1");
	
	obj.findElement(By.xpath("//*[@id='u_0_2']")).click();
	
	obj.findElement(By.xpath("//*[@//*[@class='//*[@class='_1vp5']")).click();
	obj.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
	
	}

}
