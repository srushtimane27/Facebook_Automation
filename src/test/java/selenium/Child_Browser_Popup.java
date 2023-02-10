package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child_Browser_Popup {
	
    public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
    
    @Test
    public void get_WindowHandle() {
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	String windowID = driver.getWindowHandle();
    	System.out.println(windowID);	
    	driver.close();
    }
    @Test
    public void get_WindowHandles() {
    	driver.get("https://demoqa.com/browser-windows");
    	driver.manage().window().maximize();
    	driver.findElement(By.id("windowButton")).click();
    	 String mainWindowHandle = driver.getWindowHandle();
         Set<String> allWindowHandles = driver.getWindowHandles();
         Iterator<String> iterator = allWindowHandles.iterator();
         while (iterator.hasNext()) {
             String ChildWindow = iterator.next();
                 if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                 driver.switchTo().window(ChildWindow);
                 WebElement text = driver.findElement(By.id("sampleHeading"));
                 System.out.println("Heading of child window is " + text.getText());
             }
         }
         driver.quit();
    }
}
