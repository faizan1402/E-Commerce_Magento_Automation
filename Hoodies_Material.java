package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hoodies_Material {
 
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
     public void InsideWhatsNewHoodies() throws InterruptedException{
	   driver.findElement(By.linkText("What's New")).click();
	   driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
	   driver.findElement(By.xpath("//div[contains(text(),'Material')]")).click();
	   //open cotton page
	   
	   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[5]/div[2]/ol/li[1]/a")).click();
	    
	     //hoodies material
	     driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[6]/div[1]")).click();
	    
	   
	   
	 }
	 
	 
	 @AfterMethod
	    public void tearDown() {
	  	  driver.quit();
	    
	    }
}
