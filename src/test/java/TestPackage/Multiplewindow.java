package TestPackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paychex.com/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

		driver.findElement(By.linkText("Paychex Flex login")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> ite = window.iterator();
		
		String Window1 = ite.next();
		String Window2 = ite.next();
		
		driver.switchTo().window(Window2);
		System.out.println("We are in second window");
		
		Thread.sleep(10000);
		
		driver.switchTo().window(Window1);
		System.out.println("We are in first window");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
