package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
public static void main (String [] args){
	String username2 = "testaccount";
	String password2 = "testpassword";
	
	String [] scrapeHashtagsU  = {"bikelife","636","yzfr6","r6"};
	String [] scrapeHashtagsP = {"bikelife","636","yzfr6","r6"};
	
	//String [] scrapeHashtagsU  = {"bikelife","636","yzfr6","r6","r1","yzfr1","streetfighters","streetfighterz","gsxr","gsxr600","gsxr1000","ktm","supermoto","grom"};
	//String [] scrapeHashtagsP = {"bikelife","636","yzfr6","r6","r1","yzfr1","streetfighters","streetfighterz","gsxr","gsxr600","gsxr1000","ktm","supermoto","grom"};
	String[] userLinks = new String[scrapeHashtagsU.length];
	String [] picLinks = new String[scrapeHashtagsP.length];
	String [] usersFollowed = new String[scrapeHashtagsU.length];
	String [] picsLiked = new String[scrapeHashtagsP.length];
	
	
	//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("[Instagram Bot]: Logging in");
	driver.get("https://www.instagram.com/");
	driver.get("https://www.instagram.com/accounts/login/");
	Login.login(driver);
	userLinks = Scrape.scrapeUsers(scrapeHashtagsU,userLinks, driver);
	picLinks = Scrape.scrapePhotos(scrapeHashtagsP, picLinks, driver);
	System.out.println("User Links: " +userLinks.length);
	System.out.println("Pic Links: " +picLinks.length);
	System.out.println(userLinks);
	usersFollowed = FollowUsers.followUsers(userLinks, driver);
	//LikePosts.LikePosts(picLinks, picsLiked, driver);
	UnfollowUsers.unfollow(usersFollowed, driver);
	//some sort of reports (users followed, photos liked, users unfollowed, runtime etc.)
	driver.quit();
	
	
}
}
