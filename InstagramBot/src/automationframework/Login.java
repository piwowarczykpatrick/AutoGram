package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void login(){
		String username = "cs2credittest@gmail.com";
		String password = "Cs2creditTest!";
		
		//System.setProperty("webdriver.gecko.driver", "/Users/patrickpiwowarczyk/Documents/workspace/InstagramBot/geckodriver.exec");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.instagram.com/");
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement((By.xpath("//input[@name='username']"))).sendKeys(username);
		driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(password);
		driver.findElement((By.xpath("//button[text()='Log in']"))).click();
	}
				
		

	}


