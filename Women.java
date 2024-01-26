package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Women {
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
	
	
	@Test
	public void Women() {
		driver.findElement(By.xpath("//span[contains(text(),'Women')]")).click();
	
	}
	
	@Test
	public void Jackets() throws InterruptedException {
		
       
        //WebElement elementToHover = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        WebElement elementToHover = driver.findElement(By.linkText("Women"));
      
     // Create an instance of Actions class
        Actions actions = new Actions(driver); 
        // Perform the hover action
        actions.moveToElement(elementToHover).build().perform();
        Thread.sleep(6000);
	}
	
	
	@Test
	public void Women1() throws InterruptedException {
		
		//driver.findElement(By.xpath("//span[contains(text(),'Women')]")).click();
		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
    public void tearDown() {
  	  driver.quit();
    
    }
}
