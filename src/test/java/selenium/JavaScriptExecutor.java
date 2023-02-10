package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	public WebDriver driver;
@BeforeMethod
    public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
}
@Test
public void enterText_DisabledField() throws InterruptedException 
{
	driver.get("file:///C:/Users/SRUSHTI/Desktop/Disabled.html");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(3000);
	js.executeScript("document.getElementById('t1').value='Srushti Mane'");
	Thread.sleep(3000);
	js.executeScript("document.getElementById('t2').value=''");
    Thread.sleep(3000);
    js.executeScript("document.getElementById('t2').value='Manager'");
    Thread.sleep(3000);
    js.executeScript("document.getElementById('t2').type='button'");
}
@Test
public void scrollUp_And_MoveToElement() throws InterruptedException 
{
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor jsexe = (JavascriptExecutor)driver;
	jsexe.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	jsexe.executeScript("window.scrollBy(0,-600)");
	Thread.sleep(3000);
	driver.close();	
}

}
