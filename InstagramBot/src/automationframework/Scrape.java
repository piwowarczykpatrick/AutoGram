package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrape extends Login {
	

	private static String[] userLinks;
	String [] picLinks = {};
	
	public static String[] scrapeUsers(String[] scrapeHashtagsU, WebDriver driver){
		for (int i = 0; i < scrapeHashtagsU.length; i++){
			String[] userLinks = new String[100];
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsU[i] + "/");
			String url = driver.findElement((By.xpath("//article/div[2]/div/div/div/a[1]"))).getAttribute("href");
			driver.get(url);
			System.out.println("Scrape User - Saving URL: " + driver.getCurrentUrl());
			System.out.println(i);
			userLinks[i] = driver.getCurrentUrl();
			}
		return userLinks;
	}
	
	public static String[] scrapePhotos(String[] scrapeHashtagsP, String[] picLinks,WebDriver driver){
		for (int i = 0; i < scrapeHashtagsP.length; i++){
			int count = 20;
			driver.get("https://www.instagram.com/explore/tags/" + scrapeHashtagsP[i] + "/");
			for (int p = 0; p < count; p++){
			String url = driver.findElement((By.xpath("//article/div[2]/div/div/div/a[1]"))).getAttribute("href");
			driver.get(url);
			System.out.println("Scrape Photos - Saving URL: " + driver.getCurrentUrl());
			picLinks[p] = driver.getCurrentUrl();
			}
		}
		return picLinks;
	}
	
}
