package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/"); 
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		
		WebElement helplink = driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a"));
		helplink.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
