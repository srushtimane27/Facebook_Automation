package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void login_Page() throws InterruptedException{			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();		
		String title = driver.getTitle();
		System.out.println("Title:" +title);	
		String source = driver.getPageSource();
		System.out.println("Souce: " +source);	
		String url = driver.getCurrentUrl();
		System.out.println("url: " +url);	
		//driver.quit();			
	}	
	@Test
	public void browser_navigate() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void locators() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Srushti");
		Thread.sleep(3000);
		element.clear();
		Thread.sleep(3000);
		element.sendKeys("Srushti Mane");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Srushti123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void linktest__locators() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten password?")).click();	
	}
	@Test
	public void partiallinktext_locators() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}	
	@Test
	public void cssselector() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.cssSelector("input[id='email']"));
		element.sendKeys("Srushti");
	}	
	@Test
	public void cssselector_hash() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.cssSelector("input#email"));
		element.sendKeys("Srushti");
	}	
	@Test
	public void cssselector_dot() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.cssSelector("input.email"));
		element.sendKeys("Srushti");
	}
	@Test
	public void cssselector_class() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));
		element.sendKeys("Srushti");
		Thread.sleep(3000);
		driver.close();
	}
       @Test
	public void xpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Srushti Mane");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("srushtimane123");
		driver.findElement(By.xpath("//div[contains(@class='_55r1 _6luy')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
    @Test
	public void two_elements_xpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number'][@id='email']")).sendKeys("Srushti Mane");
		Thread.sleep(3000);
		driver.close();
    }
    @Test
	public void text_function_xpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Srushti Mane");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("srushtimane123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.close();
	}
    @Test
	public void contain_function_xpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Srushti Mane");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("srushtimane123");
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
