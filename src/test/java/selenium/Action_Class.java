package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action_Class {
	
public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
@Test
public void rightClick_Using_ContextClick_Method() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement MoNumber = driver.findElement(By.xpath("//input[@id='email']"));
		Actions actions = new Actions(driver);
		actions.contextClick(MoNumber).perform();
		Thread.sleep(3000);
		driver.close();
	}

@Test
public void dragAndDrop_Method() throws InterruptedException {
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	actions.dragAndDrop(src,des).perform();
	actions.moveToElement(src).clickAndHold().perform();
	actions.release(des).perform();
	driver.close();
}

@Test
public void doubleClick_Method() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	WebElement MobileNumber = driver.findElement(By.id("email"));
	WebElement Password = driver.findElement(By.name("pass"));
	actions.doubleClick(MobileNumber).perform();
	Thread.sleep(3000);
	actions.doubleClick(Password).perform();
	Thread.sleep(3000);
	driver.close();
}
@Test
public void keyboard_Methods() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.partialLinkText("Forgotten password"));
	Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
	actions.sendKeys(Keys.DOWN).perform();
	actions.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);
	driver.close();
}
@Test
public void google_ShortCuts() throws InterruptedException {
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement search = driver.findElement(By.name("q"));
	Actions action = new Actions(driver);
	action.sendKeys("facebook").perform();
	Thread.sleep(3000);
	action.keyDown(Keys.CONTROL).sendKeys("A").perform();
	action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	action.keyDown(Keys.CONTROL).sendKeys("c").perform();
	action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	action.keyDown(Keys.CONTROL).sendKeys("t").perform();
	action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	action.keyDown(Keys.CONTROL).sendKeys("v").perform();
	action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	action.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);
	driver.close();
  }
}

