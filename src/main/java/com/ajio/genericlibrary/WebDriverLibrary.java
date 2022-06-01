package com.ajio.genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This class is used to maintain all the webdriver common actions 
 * @author Admin
 *
 */
public class WebDriverLibrary {
	static WebDriverWait wait;
	static Select s;
	static Actions act;
	static JavascriptExecutor js;
	static JavaLibrary javautil=new JavaLibrary();
	
	/**
	 * this method is used to navigate to the application
	 * @param url
	 */
	public static void navigateApp(String url, WebDriver driver) {
		driver.get(url);
	}
	
	
	/**
	 * This method is used to maximize browser and to implicitly wait till the page load
	 * @param longtime
	 * @param driver
	 */
	public static void browserSetting(long longTime, WebDriver driver) {
		maximizeBrowser(driver);
		waitTillPageLoad(longTime, driver);	
	}
	
	/**
	 * This method is used to implicitly wait till page load
	 * @param longTime
	 * @param driver
	 */
	public static void waitTillPageLoad(long longTime, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(longTime, TimeUnit.SECONDS);
	}
	
	
	/**
	 * This method is used to maximize the browser
	 * @param driver
	 */
	 public static void maximizeBrowser(WebDriver driver) {
		 driver.manage().window().maximize();
	 }
	
	 
	 /**
	  * This method is used to initialize the action class
	  * @param driver
	  */
	 public static void initializeActions(WebDriver driver) {
		 act=new Actions(driver);
	 }

	/**
	 * This method is used to mouse hover on the element
	 * @param moreLink
	 * @param driver
	 */
	public static void mouseHoverOnTheElement(WebElement moreLink, WebDriver driver) {
		Actions act=new Actions(driver);
	 	act.moveToElement(moreLink).perform();
	}

	/**
	 * this method is used to double click on the element
	 * @param element
	 */
	public static void doubleClick(WebElement element) {
		act.moveToElement(element);		
	}
	
	
	
	/**
	 * this method is used to initialize select class
	 * @param argument
	 */
	public static void initializeDropDown(WebElement element) {
	  s = new Select(element);
	}
	
	/**
	 * this method is used to handle dropdown by visible text
	 * @param element
	 */
	public static void handleByVisibleText(WebElement element, String visibleText) {
		s.selectByVisibleText(visibleText);
	}
	
	
	/**
	 * this method is used to handle dropdown by index
	 * @param elelment
	 * @param index
	 */
	public static void handleByIndex(WebElement elelment, int index) {
		s.selectByIndex(index);
	}
	
	
    /**
     * this method is used to handle dropdown by value
     * @param value
     * @param elelment
     */
	public static void handleByIndex(String value, WebElement elelment) {
		s.selectByValue(value);
	}
	
	
	
	/**
	 * this method is used to wait the control till the particular element is clickable
	 * @param element
	 */
	public static void waitUntilElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
		
	


	/**
	 * this method is used to wait the control till the particular element is visible
	 * @param element
	 */
	public static void waitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	
	/**
	 * this method is used to initialize instance wait
	 * @param driver
	 * @param longTime
	 */	
	public static void expclicitlyWait(WebDriver driver, long longTime) {
		 wait = new WebDriverWait(driver, longTime);		
	}
	
	
	/**
	 * This method is used to Switch the window based on the title
	 * @param driver
	 * @param partialText
	 */
	public static void switchToWindowBasedOnTitle(WebDriver driver, String partialText) {
	Set<String> sessionIDs = driver.getWindowHandles();	
	for(String id:sessionIDs)
	{
		driver.switchTo().window(id);
		if(driver.getTitle().contains(partialText))
		{
			break;
		}
	}
}
	
	/**
	 * this method is used to switch from webpage to frame by using index
	 * @param driver
	 * @param index
	 */
	public static void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method is used to switch from webpage to frame by using name Or Id
	 * @param driver
	 * @param nameOrId
	 */
	public static void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public static void switchtoFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	
	/**
	 * this method is used to the main frame
	 * @param driver
	 */
	public static void switchBackToHome(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
	/**
	 * This method is used to exit from the browser
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public static void initializeJs(WebDriver driver) {
		js=(JavascriptExecutor) driver;
	}
	
	
	public static void enterDataThroughJs(WebElement element, String data) {
	js.executeScript("argumnets[0].value=arguments[1]", element, data);	
	}
	
	
	public static void clickThroughJs(WebElement element) {
		js.executeScript("argumnets[0].clcik()", element);
	}
	
	
	public static void navigateAppThroughJs(String url) {
		js.executeScript("window.location=argumnets[0]", url);
	}
	
	
	public static void scrollToSpecificHeight(String height) {
		js.executeScript("argumnets[0].scrollBy(0,"+height+")");
	}
	
	
	public static void scrollToBottom() {
	js.executeScript("argumnets[0].scrollBy(0, document.body.scrollHieght)");
	}
	
	
	public static void scrollTillElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	
	public static void takeScreenShot(String fileName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./shreenshot/"+fileName+"_"+javautil.dateTimeInFormat()+".png");
	    System.out.println(dst.getAbsolutePath());
		FileUtils.copyFile(src, dst);
		    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
