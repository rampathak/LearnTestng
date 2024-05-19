package testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHome {
	
	public static WebDriver driver;
	//launch the application
	
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	
	
	public void tearDownBrowser() {
		driver.quit();
	}
	
	// with running using main as java application we cannot get report so in testng we don't run from main method
	// we run it from testng
	// we cannot generate report how many testcases fail and how many passes using java
	
	
//	public static void main(String[] args) {
//		GoogleHome googlehome = new GoogleHome();
//		googlehome.launchApplication();
//		googlehome.tearDownBrowser();
//	}
	
	
	public void search_test(String searchvalue) throws InterruptedException {
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		searchbox.sendKeys(searchvalue);
		Thread.sleep(40);
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(50);
		
	}
	@Test
	
	public void execute_test() throws InterruptedException {
		launchApplication();
		search_test("Govinda");
		Thread.sleep(80);
		tearDownBrowser();
		
		
	}
	
	
@Test
	
	public void execute_test2() throws InterruptedException {
		launchApplication();
		search_test("Krishna");
		Thread.sleep(80);
		tearDownBrowser();
		
		
	}
	
	
	

}


