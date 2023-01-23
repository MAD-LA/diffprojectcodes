package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws Exception {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dell.com/en-us"); 
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Actions ac = new Actions (driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))).build().perform();
		//mousing over products 
		
		Thread.sleep(5000);
		
		//WebElement Server = driver.findElement(By.linkText("Servers"));
		//Server.click();
		//if you want to click on servers from products
		
		Actions ac1 = new Actions (driver);
		ac1.moveToElement(driver.findElement(By.xpath("//button[text()='Gaming']"))).build().perform();
		// mousing over gaming
		
		//Thread.sleep(5000);
		
		//WebElement closeemail = driver.findElement(By.xpath("//button [@class=\"email-close-btn\"]"));
		//closeemail.click();
		//to close the holiday deal pop up----not working
		
		WebElement videogames = driver.findElement(By.linkText("Video Games"));
		videogames.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
