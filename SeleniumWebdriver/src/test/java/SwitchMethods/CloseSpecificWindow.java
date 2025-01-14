package SwitchMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			
 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.get("https://demo.opencart.com/");
		Set<String> windowId = driver.getWindowHandles();
		
		for (String windID : windowId) {
			System.out.println(windID);
			String title = driver.switchTo().window(windID).getTitle();
			System.out.println(title);

			if (title.equals("OrangeHRM") || title.equals("")) {
				driver.close();
			}
		}
	}	
		catch (Exception e) {
			System.out.println("Exception arise");
		}
		

	}

}
