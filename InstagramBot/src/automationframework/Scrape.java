package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrape {
	
	static WebDriver driver = new FirefoxDriver();

	public static void scrapeUsers(String[] scrapeHashtags){
		for (int i = 0; i < scrapeHashtags.length; i++){
			//driver.findElement((By.xpath("//input[@type='text']"))).click();
			driver.findElement((By.xpath("//input[@type='text']"))).sendKeys("test");
			
		}
		
	}
}
