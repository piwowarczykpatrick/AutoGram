package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
public static void main (String [] args){
	String username2 = "testaccount";
	String password2 = "testpassword";
	String [] scrapeHashtags  = {"bikelife"};
	
	//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	Login.login();
	Scrape.scrapeUsers(scrapeHashtags);
	//Scrape.scrapePhotos();
	
}
}
