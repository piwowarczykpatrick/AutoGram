package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LikePosts {
	
	public static void LikePosts(String[] picLinks, String[] picsLiked, WebDriver driver){
		
		for (int i = 0; i < picLinks.length; i++){
			driver.get(picLinks[i]);
			driver.findElement(By.xpath("//a[@class='_eszkz _l9yih']")).click();
			System.out.println("[Instagram Bot]: Photo Liked - " +picLinks[i]);
			picsLiked[i] = picLinks[i];
		}
	}

}
