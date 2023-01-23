package TestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.southwest.com/"); 
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 200)");
		
		Thread.sleep(3000);
		
		JavascriptExecutor date = (JavascriptExecutor) driver;



		  date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='11/25/2022'");

		 Thread.sleep(3000);

		  date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='12/01/2022'");

		
		Thread.sleep(5000);

		driver.quit();
		
		
		
		
		
		
		

	}

}
