package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screen_Shot_Class {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magnus.jalatechnologies.com/");
	WebElement username = driver.findElement(By.id("UserName"));
	username.sendKeys("training@jalaacademy.com");
	
	
	WebElement password = driver.findElement(By.name("Password"));
	password.sendKeys("jobprogram");
	
	WebElement SignBtn = driver.findElement(By.id("btnLogin"));
	SignBtn.click();
	
	Thread.sleep(3000);
	 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 
	 String random = RandomString.make(3);
	 
	File des = new File("C:\\Users\\OM SAI AM\\eclipse-workspace\\SeleniumBasci_Batch_9.45Pm\\localPath\\siva.jpg");
//	 File des = new File("C:\\Users\\OM SAI AM\\eclipse-workspace\\SeleniumBasci_Batch_9.45Pm\\ScreenShot\\"+random+".png");
	 
	 FileHandler.copy(Src, des);
	 
}
}
