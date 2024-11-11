package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
//		1. launch the browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
//		2. enter the url	
		driver.get("https://magnus.jalatechnologies.com/");	
		
//		3. enter username
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email or Mobile No']"));
		username.sendKeys("training@jalaacademy.com");
		
//		4.Enter password
//		driver.findElement(By.id("Password"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("jobprogram");
		
//		5. click on sign button
		WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signInBtn.click();
		Thread.sleep(3000);
		
		WebElement moreTab = driver.findElement(By.linkText("More"));
		moreTab.click();
		Thread.sleep(3000);
		
		
		WebElement popupTab = driver.findElement(By.linkText("Popups"));
		popupTab.click();
		
		WebElement confirmPopUp = driver.findElement(By.name("confirm"));
		
		confirmPopUp.click();
		
		Alert alertPopUp = driver.switchTo().alert();
		Thread.sleep(3000);
		alertPopUp.accept();
		
	}
}
