/*********Implicit Wait********
 * ---wdriver.manage().timeouts().implicitWait(Duration.ofSeconds(10));---
 * Adv:
 * 1. single time/one time statement
 * 2. it will not wait till maximum time if the element is available.
 * 3. Applicable for all the elements
 * 4. Easy to use.
 * 
 * DisAdv:
 * 1. if the time is not sufficient then you will get exception 
*/

package waitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
WebDriver wDriver = new ChromeDriver();
		
		try {
			
			wDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			wDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wDriver.manage().window().maximize();
			
			wDriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			wDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			wDriver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		finally {
			wDriver.quit();
		}
	}
}