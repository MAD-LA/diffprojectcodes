package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendardemo {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.southwest.com/"); 
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		
	//	WebElement airport = driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode"));
	//	airport.clear();
	//	airport.sendKeys("CMH");
		
		JavascriptExecutor date = (JavascriptExecutor) driver;
	
		date.executeScript("document.getElementByID('LandingAirBookingSearchForm_departureDate').value='11/25/2022'");
		
		//above code not working... have to try the one below
		
	//	WebElement depart = driver.findElement(By.id("LandingAirBookingSearchForm_departureDate"));
	//	depart.clear();
	//	depart.sendKeys("11/25");
		
	//	Thread.sleep(5000);
		
		
		date.executeScript("document.getElementByID('LandingAirBookingSearchForm_returnDate').value='12/01/2022'");
		
	//	WebElement returndate = driver.findElement(By.id("LandingAirBookingSearchForm_returnDate"));
	//	returndate.clear();
	//	returndate.sendKeys("12/05");
		
		Thread.sleep(5000);
		
	//	WebElement search = driver.findElement(By.id("LandingAirBookingSearchForm_submit-button"));
	//	search.click();
		
		
	//	Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
