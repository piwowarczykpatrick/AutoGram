package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void login(WebDriver driver){
		String username = "cs2credittest@gmail.com";
		String password = "Cs2creditTest!";
		
		//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec");
		//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec")
		
		
		driver.findElement((By.xpath("//input[@name='username']"))).sendKeys(username);
		driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(password);
		driver.findElement((By.xpath("//button[text()='Log in']"))).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
				
		

	}


