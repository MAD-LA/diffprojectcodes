package TestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldowndemo {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoblaze.com/"); 
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		
		driver.quit();
		
		
		
		
		

	}

}
