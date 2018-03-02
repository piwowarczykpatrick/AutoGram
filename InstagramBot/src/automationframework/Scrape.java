package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrape extends Login {
	

	public static String [] userLinks = {};
	public static String [] picLinks = {};
	
	public static String[] scrapeUsers(String[] scrapeHashtagsU, String[] userLinks, WebDriver driver){
		for (int i = 0; i < scrapeHashtagsU.length; i++){
			int count = 20;
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsU[i] + "/");
			for (int p = 1; p < count; p++){
				System.out.println(p);
			driver.findElement((By.xpath("//article/div[2]/div/div/div[1]/div["+p+"]"))).click();
			System.out.println(driver.getCurrentUrl());
			userLinks[p] = driver.getCurrentUrl();
			}
		}
		return userLinks;
	}
	
	public static String[] scrapePhotos(String[] scrapeHashtagsP, String[] picLinks,WebDriver driver){
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
