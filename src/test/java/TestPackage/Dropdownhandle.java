package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.ebay.com/"); 
		
		driver.manage().window().maximize();
		
		Select sl = new Select (driver.findElement(By.id("gh-cat")));
		
		//sl.selectByValue("2984");
		//sl.selectByVisibleText("Cameras & Photo");
		sl.selectByIndex(5);
		
		Thread.sleep(5000);
		
		WebElement Search = driver.findElement(By.id("gh-btn"));
		Search.click();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
