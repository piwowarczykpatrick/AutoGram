package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FollowUsers {

	public static String[] followUsers(String [] userLinks, WebDriver driver){
		String[] usersFollowed = new String[userLinks.length];
		for (int i = 0; i < userLinks.length; i++){
		int count = 0;
		if (isLoggedIn(driver) == false){
			Login.login(driver);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			driver.get(userLinks[i]);
			driver.findElement((By.xpath("//img[@class='_rewi8']"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				driver.findElement((By.xpath("//button[text()='Follow']"))).click();
				Thread.sleep(2000);
				usersFollowed[count] = driver.getCurrentUrl();
				System.out.println("[Instagram Bot]: User Followed - " +usersFollowed[i]);
			} catch (org.openqa.selenium.NoSuchElementException e){
				System.out.println("[Instagram Bot]: User already Followed!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		return usersFollowed;
	}
	
	    

public static boolean isLoggedIn(WebDriver driver){
	 try
       {
           driver.findElement(By.xpath("//button[text()='Log in']"));
           return false;
       }
       catch (NoSuchElementException e)
       {
           //e.printStackTrace();
           return true;
       }
}
}
