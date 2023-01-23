package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksdemo {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dell.com/en-us"); 
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		List <WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		//to give the number of links on the webpage
		//all linktext tagnames always start with a
		
		for (int i=0; i<alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getAttribute("href"));
		}
		//for loop to print out list of all the links, href is the name of attribute for all links
		
		
		
		driver.quit();
		
	}

}
