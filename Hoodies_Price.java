package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hoodies_Price {
	
	
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
		   
		   // hoodies price page open
		   driver.findElement(By.xpath("//div[normalize-space()='Price']")).click();
		   
		   //Hoodies price 
		   driver.findElement(By.xpath("//span[contains(text(),'$39.99')]")).click();
		   
		   //Select price the item
		   driver.findElement(By.xpath("//img[@class='product-image-photo' or @src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/h/wh12-gray_main_1.jpg']")).click();
		   
		   //select the size of sweatshirt
		   driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
		   
		   // select the color of sweatshirt
		   driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']")).click();
		   
		   // select the sweatshirt on addcart
		   //driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		   
		   //Sweatshirt Add to wishlist
		   //driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
		   
		   //Add to compare the list
		   driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[2]")).click();
		   
		   
		   Thread.sleep(6000); 
	 }
	 
	 @AfterMethod
	    public void tearDown() {
	  	  driver.quit();
	    
	    }

}
