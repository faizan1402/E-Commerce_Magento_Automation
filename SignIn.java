package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignIn {
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
	public void SignIn() throws InterruptedException {
		driver.findElement(By.xpath("//html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("officialfaizanahmad@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='login[password]' and @id='pass']")).sendKeys("Faizan@12345");
		driver.findElement(By.xpath("//button[@type='submit' and @class='action login primary']")).click();
		Thread.sleep(4000);
		
	}
	
	@AfterMethod
    public void tearDown() {
  	  driver.quit();
    
    }
}
