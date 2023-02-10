package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScript_Popup {
	public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
@Test
public void click_Button_See_Alert() throws InterruptedException {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("alertButton")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(alert.getText());
	Thread.sleep(3000);
	alert.accept();
	Thread.sleep(3000);
	driver.close();
}
@Test
public void timer_Alert() throws InterruptedException {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.id("timerAlertButton")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.close();
}
@Test
public void conforemation_Alert() throws InterruptedException {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("confirmButton")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(alert.getText());
	Thread.sleep(3000);
	alert.accept();
	driver.close();
}
@Test
public void prompt_Alert() throws InterruptedException {
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor jsexe = (JavascriptExecutor)driver;
	jsexe.executeScript("window.scrollBy(0,100)");
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Srushti");
	alert.accept();
	driver.close();
}


}
