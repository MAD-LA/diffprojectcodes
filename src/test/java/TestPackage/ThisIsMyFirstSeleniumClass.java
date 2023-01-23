package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisIsMyFirstSeleniumClass {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
  
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to tell Selenium to wait max of 20 seconds before launching
		
		driver.get("https://www.demoblaze.com/"); 
		//Given user open application
		
		//driver.manage().window().maximize();
		//to maximize window
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//to tell selenium to wait after page loads 
		
		//driver.manage().deleteAllCookies();
		//to delete all cookies
	
		WebElement LoginButton = driver.findElement(By.id("login2"));
		LoginButton.click(); 
	   //Then click Login button
		
		Thread.sleep(5000);
		
		WebElement UserName = driver.findElement(By.xpath("//input [@id=\"loginusername\"]"));
		UserName.sendKeys("autimation@nexttechitc.com");
		//Then enter valid username
		
		Thread.sleep(5000);
		
		WebElement Password = driver.findElement(By.id("loginpassword"));
		Password.sendKeys("12345");
		//When enter valid password 
		
		Thread.sleep(5000);
		
		WebElement LoginLink = driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
		LoginLink.click();		
		//Then click login link
		
		//driver.quit();
		//close() to close current window, and quit() to close all windows
		
		
		
		
		
	
		
	
	   
		
		
		
		
	}

}
