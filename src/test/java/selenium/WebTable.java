package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable {
	public WebDriver driver;
	@BeforeMethod
	    public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRUSHTI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
	@Test
	public void find_TotalNo_Of_Rows() {
		driver.get("file:///C:/Users/SRUSHTI/Desktop/Webtable.html");
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		driver.close();
	}
	@Test
	public void find_TotalNo_Of_Columns() {
		driver.get("file:///C:/Users/SRUSHTI/Desktop/Webtable.html");
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		driver.close();
	}
	@Test
	public void find_TotalNo_Of_Cells() {
		driver.get("file:///C:/Users/SRUSHTI/Desktop/Webtable.html");
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		driver.close();
    }
	
	
//	@Test
//	public void Print_Only_Numbers() {
//		driver.get("file:///C:/Users/SRUSHTI/Desktop/Webtable.html");
//		int countNumberValue = 0;
//		int sum=0;
//		for (WebElement cell : allCells) {
//		String cellValue = cell.getText();
//		try{
//		int number = Integer.parseInt(cellValue);
//		System.out.print(“ ”+number);
//		countNumberValue++;
//		sum = sum+number;
//		}catch (Exception e) {
//		}
//		}
//		System.out.println("Total count of numeric values is :"+countNumberValue);
//		System.out.println("Total sum of all the numeric values is :"+sum);	
//		driver.close();
//}
	
}
