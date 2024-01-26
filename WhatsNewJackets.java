package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhatsNewJackets {
   
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
    public void InsideWhatsNewJackets() throws InterruptedException {
	   driver.findElement(By.linkText("What's New")).click();
	   driver.findElement(By.linkText("Jackets")).click();
	  // driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
	   driver.findElement(By.xpath("//img[@class='product-image-photo' and @src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/j/wj12-blue_main_1.jpg']")).click();
	   
	   //size of jackets
	   driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-167\"]")).click();
	   
	   //choose the color of jackets
	   driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
	   
	   //quantity of item
	   driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
	   
	   //add to cart item
	   
	   driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
	   
	   //add to wishlist item
	   driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
	   
	   Thread.sleep(3000);
	   
}
	   @AfterMethod
	    public void tearDown() {
	  	  driver.quit();
	    
	    }
		
	   
	
}
