/***********BroswerMethods*********
 * 	--Access this methods through browser
 * 1.quit()
 * 2.close() 
*/

package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wDriver = new ChromeDriver();
		wDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wDriver.manage().window().maximize();
		
		Thread.sleep(2000);
		wDriver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(2000);
		wDriver.close(); //Wherever the window focused..
		Thread.sleep(2000);
		wDriver.quit(); //close the all window.
	}

}
