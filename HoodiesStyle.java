package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoodiesStyle {
   
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
	 //Open Style of Hoodies 
	   @Test
	   public void InsideWhatsNewHoodies() throws InterruptedException{
		   driver.findElement(By.linkText("What's New")).click();
		   driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
		   
		   // open style page 
		   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		
		   //  
		   // hoodies Sweat Shirt
		   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]/a")).click();
		   
		   Thread.sleep(3000);
		   
	   }
	   
	   @AfterMethod
	    public void tearDown() {
	  	  driver.quit();
	    
	    }
		
}
