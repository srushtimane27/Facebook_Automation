package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass {
public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
    @Test
    public void SelectByValue() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByValue("i");
    	driver.close();
    }
    @Test
    public void selectByIndex() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(3);
    	driver.close();
    }
    @Test
    public void selectByVisibleText() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByVisibleText("DOSA");
    	driver.close();
    }
    @Test
    public void multipalSelect() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    			if(se.isMultiple()){
    				se.selectByIndex(1);
    				se.selectByIndex(2);
    				se.selectByValue("dosa");
    				se.selectByValue("uttappa");
    				se.selectByVisibleText("Dosa");
    				se.selectByVisibleText("Uttappa");
                 } 
    			driver.close();
    }
    @Test
    public void getOptions() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	List<WebElement> options = se.getOptions();
    	driver.close();
    }
    @Test
    public void getFirstSelectedOption() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
    	WebElement firstSelectedOption = se.getFirstSelectedOption();
    	driver.close();
    }
    @Test
    public void getAllSelectedOption() {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
		List<WebElement> selectedOptions = se.getAllSelectedOptions();
    	driver.close();
    }
    @Test
    public void deselectAll() throws InterruptedException {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
		Thread.sleep(3000);
		se.deselectAll();
    	driver.close();
    }
    @Test
    public void deselectByIndex() throws InterruptedException {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
		Thread.sleep(3000);
		se.deselectByIndex(1);
    	driver.close();
    }
    @Test
    public void deselectByValue() throws InterruptedException {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
		Thread.sleep(3000);
		se.deselectByValue("DOSA");
    	driver.close();
    }
    @Test
    public void deselectByVisibleText() throws InterruptedException {
    	driver.get("file:///C:/Users/SRUSHTI/Desktop/ListBox_Breakfast.html");
    	Select se = new Select(driver.findElement(By.xpath("//*[@id='mtr']")));
    	se.selectByIndex(1);
		se.selectByIndex(2);
		Thread.sleep(3000);
		se.deselectByVisibleText("DOSA");
    	driver.close();
    }
    
 
}


    
    
    			








