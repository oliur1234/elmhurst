package Cucumber;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mroli\\git\\PremierLeague\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement BMW = driver.findElement(By.id("hondaradio"));
		BMW.click();
		
		WebElement dropDown = driver.findElement(By.id("carselect"));
		Select selectDrop =new Select(dropDown);
		selectDrop.selectByVisibleText("Benz");
		
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		Select DropMulti = new Select(multiSelect);
		DropMulti.selectByVisibleText("Apple");
		DropMulti.selectByVisibleText("Peach");
		
		WebElement checkHonda = driver.findElement(By.id("hondacheck"));
		checkHonda.click();
		

	}

}
