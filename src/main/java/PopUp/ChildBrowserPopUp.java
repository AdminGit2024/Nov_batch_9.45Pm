package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

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
		
		WebElement oneWindow = driver.findElement(By.id("btn-one"));
		oneWindow.click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> itr = windows.iterator();
		String mainWindow = itr.next();
		System.out.println("main window id is : "+ mainWindow);
		String childWindow = itr.next();
		System.out.println("child window id is : "+ childWindow);
		
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		
		WebElement clickOnGmail = driver.findElement(By.linkText("Gmail"));
		clickOnGmail.click();
		
		
		String url = driver.getCurrentUrl();
		
//		System.out.println(url);
		
		driver.switchTo().window(mainWindow);
		WebElement clickOnConfirmBox = driver.findElement(By.name("confirm"));
		
		clickOnConfirmBox.click();
	}
}
