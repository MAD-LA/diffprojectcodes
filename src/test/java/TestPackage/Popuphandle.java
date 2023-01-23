package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandle {

	
	public static WebDriver driver;
	//using WebDriver as global variable instead of local 
	
	public static void main(String[] args) throws Exception {
		

 System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");

 driver = new ChromeDriver(); 

 driver.get("https://www.demoblaze.com/"); 
 
 driver.manage().window().maximize();

 WebElement Contact = driver.findElement(By.linkText("Contact"));
Contact.click();
 
Thread.sleep(5000);

WebElement Sendmessage = driver.findElement(By.xpath("//button[text()='Send message']"));
Sendmessage.click(); 

Thread.sleep(5000);
 
driver.switchTo().alert().accept();
//when pop up appears that isn't able to inspect, use this code to accept and quit 


Thread.sleep(5000);

// driver.quit();
 

		
		
		
	}

}
