package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot{
	
public WebDriver driver;
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
}
@Test
public void takescreenshot() throws IOException {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("Srushti Mane");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File SFile = ts.getScreenshotAs(OutputType.FILE);
	
	File DFile = new File("C:\\Users\\SRUSHTI\\eclipse-workspace\\Facebook\\FacebookScreenShot\\" + "FacebookScreenShot.png");
	FileHandler.copy(SFile,DFile);
}
}
