package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
	public WebDriver driver;
	@BeforeMethod
	    public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
 @Test	
	public void frames_Function() throws InterruptedException {
		driver.get("file:///C:/Users/SRUSHTI/Desktop/Page2.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Srushti");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("2684");
		Thread.sleep(3000);
		driver.close();
	}
	

}
