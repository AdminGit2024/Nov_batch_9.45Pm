package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameClass {

	public static void main(String[] args) throws InterruptedException {
		
//		this is my new code
//		1. launch the browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().window().minimize();	
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
		
		
//		6. click on MoreTab
		WebElement moreTab = driver.findElement(By.linkText("More"));
		moreTab.click();
		Thread.sleep(3000);
		
//		7. click on iframeTab	
		WebElement iframeTab = driver.findElement(By.linkText("iFrames"));
		iframeTab.click();
		
		
//		8. switch focus from main page to another page		
		driver.switchTo().frame("iframe2");
		
//		10. click on toggle button which is present inside another frame			
		WebElement toggle = driver.findElement(By.linkText("Toggle navigation"));
		toggle.click();
		
		
		WebElement employeeTab = driver.findElement(By.linkText("Employee"));
		employeeTab.click();
		Thread.sleep(3000);
		
		WebElement createTab = driver.findElement(By.linkText("Create"));
		createTab.click();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		WebElement employeeTab1 = driver.findElement(By.linkText("Employee"));
		employeeTab1.click();
		Thread.sleep(3000);
		
		WebElement createTab1 = driver.findElement(By.linkText("Create"));
		createTab1.click();
		
	} 
}
