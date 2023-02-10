package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wait {
public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
    @Test
    public void Implicit_Wait() throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	String eTitle = "Demo Guru99 Page";
    	String aTitle = "" ;
    	driver.get("http://demo.guru99.com/test/guru99home/" );
    	driver.manage().window().maximize() ;  	
    	aTitle = driver.getTitle();  
    	if (aTitle.equals(eTitle))
    	{
    	System.out.println( "Test Passed") ;
    	}
    	else {
    	System.out.println( "Test Failed" );
    	}	
    	driver.close();
    }    
}
