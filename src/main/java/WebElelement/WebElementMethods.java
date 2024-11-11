package WebElelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys("training@jalaacademy.com");
		
		
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("jobprogram");
		
		WebElement SignBtn = driver.findElement(By.id("btnLogin"));
		SignBtn.click();
	
	}

}
