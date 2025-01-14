/************GetMethods************
	---we can access these methods through webdriver interface---
 * 1. get(url)
 * 2. getTitle()
 * 3. getCurrentUrl()
 * 4. getPageSource()
 * 5. getWindowHandle()
 * 6. getWindowHandles() 
*/
package webDriverMethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wDriver = new ChromeDriver();
		Thread.sleep(5000);
		
		//get(url)-- Opens the url on the browser.
		wDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		//getTitle() - Print the title of the page.
		System.out.println("Title of the page: " + wDriver.getTitle());	
		
		//getCurrentUrl() - Print current URL of the page
		System.out.println("Current URL of the page: " + wDriver.getCurrentUrl());
		
		//getPageSource() - print source code of the page
		System.out.println("Source code of the page: \n" +  wDriver.getPageSource());
		
		//getWindowHandle() - Print Id of the single browser tab
		String windowID=wDriver.getWindowHandle();
		System.out.println("Window ID" + windowID); //Dynamic ID
		
		Thread.sleep(3000);
		
		wDriver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//getWindowHandles() - Print Id of the all browser tab
		Set<String> windowsID = wDriver.getWindowHandles();
		System.out.println(windowsID);
		
		

	}

}
