package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrape {
	
	static WebDriver driver = new FirefoxDriver();

	public static String [] userLinks = {};
	public static String [] picLinks = {};
	
	public static String[] scrapeUsers(String[] scrapeHashtagsU, String[] userLinks){
		for (int i = 0; i < scrapeHashtagsU.length; i++){
			int count = 20;
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsU[i] + "/");
			for (int p = 0; p < count; p++){
			driver.findElement((By.xpath("//article/div[2]/div/div/div["+count+"]"))).click();
			userLinks[p] = driver.getCurrentUrl();
			}
		}
		return userLinks;
	}
	
	public static String[] scrapePhotos(String[] scrapeHashtagsP, String[] picLinks){
		for (int i = 0; i < scrapeHashtagsP.length; i++){
			int count = 20;
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsP[i] + "/");
			for (int p = 0; p < count; p++){
			driver.findElement((By.xpath("//article/div[2]/div/div/div["+count+"]"))).click();
			picLinks[p] = driver.getCurrentUrl();
			}
		}
		return picLinks;
	}
	
}
