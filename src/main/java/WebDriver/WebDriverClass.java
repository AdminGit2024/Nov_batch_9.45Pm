package WebDriver;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String titleName = driver.getTitle();
		System.out.println("title of my current page is: "+titleName);
		
		String getUrl = driver.getCurrentUrl();
		
		System.out.println(getUrl);
		
	}
}
