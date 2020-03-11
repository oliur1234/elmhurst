package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

    public class loginStepDef {
	static WebDriver driver;
	static TestingPageFactory pf;
	
	@Given("^user go to login page$")
	public void user_go_to_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		pf = PageFactory.initElements(driver, TestingPageFactory.class);
		
	}

	@When("^user enters a valid user name$")
	public void user_enters_a_valid_user_name() throws Throwable {
	    driver.findElement(By.xpath(" //input[@name='userName']")).sendKeys("user@phptravels.com");
	}
	
	@Given("^user print the page title$")
	public void user_print_the_page_title() throws Throwable {
		
	System.out.println(driver.getTitle());
	}
	    

	@When("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demouser");
		
	    
	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	    
	}
	

	@Then("^user click on log out button$")
	public void user_click_on_log_out_button() throws Throwable {
	    
	    
	}

	@When("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    
	    
	}


}
