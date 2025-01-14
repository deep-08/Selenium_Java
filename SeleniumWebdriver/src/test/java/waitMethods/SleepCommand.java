/*********Sleep********
 * ---Sleep()---
 * Adv:
 * 1. Easy to use.
 * 
 * DisAdv:
 * 1. if the time is not sufficient then you will get exception
 * 2. it will wait for maximum time out. this will reduce the performance script.
 * 3. multiple times
 * 
*/
package waitMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) {
		WebDriver wDriver = new ChromeDriver();
		
		try {
			wDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wDriver.manage().window().maximize();
					
//			Thread.sleep(2000); --Pause on Execution.
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
