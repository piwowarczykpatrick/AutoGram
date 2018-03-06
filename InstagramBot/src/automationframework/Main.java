package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
public static void main (String [] args){
	String username2 = "testaccount";
	String password2 = "testpassword";
	String [] scrapeHashtagsU  = {"bikelife"};
	String [] scrapeHashtagsP = {"zx6r"};
	String [] userLinks;
	String [] picLinks;
	//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("[Instagram Bot]: Logging in");
	Login.login(driver);
	userLinks = Scrape.scrapeUsers(scrapeHashtagsU, driver);
	//picLinks = Scrape.scrapePhotos(scrapeHashtagsP, Scrape.picLinks, driver);
	FollowUsers.followUsers(userLinks);
	
}
}
