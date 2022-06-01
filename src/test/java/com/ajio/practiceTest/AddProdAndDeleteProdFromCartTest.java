package com.ajio.practiceTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProdAndDeleteProdFromCartTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.ajio.com");
		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@title='KIDS']")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//img[@src='https://assets.ajio.com/cms/AJIO/WEB/15042022-D-KHP-shopbyproduct-header.jpg']")));
        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/s/starting-at-rs-199-4663-75761']")).click();
	
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@class='']"));
		Select s = new Select(ele);
		s.selectByValue("prce-desc");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='brands']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='3pin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='612 League']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='AARIKA GIRLS ETHNIC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://assets.ajio.com/medias/sys_master/root/h68/h43/12259017293854/612_league_white_%26_maroon_shirt_with_printed_vest.jpg']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(null);
		driver.findElement(By.xpath("//span[.='4-5Y']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='btn-gold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ic-cart ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Delete']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
