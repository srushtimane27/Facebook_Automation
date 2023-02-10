package selenium;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload_Download_Popup {

	public WebDriver driver;
	
    @BeforeMethod
    public void setup() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    }
    @Test
    public void file_Upload_Using_SendKeys() throws InterruptedException {
    	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@type='file'][@Single='']")).sendKeys("file:///C:/Users/SRUSHTI/Downloads/abc.pdf");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();	
    	Thread.sleep(2000);
    	driver.close();
    }
    @Test
    public void file_Upload_Using_AutoitTool() throws InterruptedException, IOException {
    	driver.get("https://smallpdf.com/pdf-converter");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 jltaIN']")).click();
    	Thread.sleep(4000);
    	Runtime.getRuntime().exec("C:\\Users\\SRUSHTI\\Documents\\Pdf_File.exe");
    }
    @Test
    public void file_Download() {
    	driver.get("https://www.selenium.dev/downloads/");
    	driver.manage().window().maximize();
    	driver.findElement(By.partialLinkText("4.8.0")).click();
    }
}
