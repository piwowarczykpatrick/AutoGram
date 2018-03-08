package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrape extends Login {
	

	private static String[] userLinks;
	static String [] picLinks = {};
	
	public static String[] scrapeUsers(String[] scrapeHashtagsU, String[] userLinks, WebDriver driver){
		for (int i = 0; i < scrapeHashtagsU.length; i++){
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsU[i] + "/");
			String url = driver.findElement((By.xpath("//article/div[2]/div/div/div/a[1]"))).getAttribute("href");
			driver.get(url);
			System.out.println("[Instagram Bot]: Scraping Users - Saving URL: " + driver.getCurrentUrl());
			userLinks[i] = driver.getCurrentUrl();
			}
		return userLinks;
	}
	

	public static String[] scrapePhotos(String[] scrapeHashtagsP, String[] picLinks, WebDriver driver){
		for (int i = 0; i < scrapeHashtagsP.length; i++){
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsP[i] + "/");
			String url = driver.findElement((By.xpath("//article/div[2]/div/div/div/a[1]"))).getAttribute("href");
			driver.get(url);
			System.out.println("[Instagram Bot]: Scraping Pictures - Saving URL: " + driver.getCurrentUrl());
			picLinks[i] = driver.getCurrentUrl();
		}
		return picLinks;
	}
	
}
