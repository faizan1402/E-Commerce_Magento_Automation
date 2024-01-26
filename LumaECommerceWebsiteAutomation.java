package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LumaECommerceWebsiteAutomation {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 //WebDriver driver = new ChromeDriver(options);
		 this.driver = new ChromeDriver(options);
	  driver.manage().window().maximize(); // maximize the window
	  driver.manage().deleteAllCookies(); //means delete all cookies and catche
		 //dynamic wait
	  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//load the page dynamically
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load the elements dynamically
	  driver.get("https://magento.softwaretestingboard.com/"); //E-Commmerce Side

}
	
	
	
	 //Whats New Page
	@Test
	public void WhatsNew() throws InterruptedException {
		//driver.findElement(By.xpath("//span[contains(text(),\"What's New\")]")).click();
		driver.findElement(By.linkText("What's New")).click();
		//driver.findElement(By.xpath("//main[@id='maincontent']//strong[1]//span[1]"));
		
		driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[1]/strong[2]")).click();
		//open the item 
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
		
		//select hoddies size -S
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-167\"]")).click();
		//color -gray
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]")).click();
		
		//quantity of items
		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
		
		// Add to Cart
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		
		// Add to Wishlist
		//driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
		
		
		Thread.sleep(6000);
	}
	
	@AfterMethod
    public void tearDown() {
  	  driver.quit();
    
    }
	
	
}
