package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HiddenDivisionPopup {
public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
    @Test
    public void hiddenDivPopup() {
    	driver.get("https://www.irctc.co.in/nget/train-search");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("3");
    	driver.close();
    }
}
