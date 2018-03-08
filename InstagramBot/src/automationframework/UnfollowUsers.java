package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnfollowUsers {
	
	public static void unfollow(String[] usersFollowed, WebDriver driver){
		for (int i = 0; i < usersFollowed.length; i++){
			driver.get(usersFollowed[i]);
			driver.findElement(By.xpath("//button[text()='Following']"));
			
		}
		
	}

}
