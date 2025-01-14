package navigations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
				
		Set<String> windowID= driver.getWindowHandles();
		
		//Appoach:1
/*		List<String> windowList = new ArrayList<String>(windowID);
		
		String parentID = windowList.get(0);
		String childID  = windowList.get(1);
		
		//Switch to child window & getTitle
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
	
		//Switch to parent window & getTitle
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle()); */
		
		//Approach--2
		for (String windIds : windowID) {
		String windowtitle = driver.switchTo().window(windIds).getTitle();
		
		if(windowtitle.equals("OrangeHRM")) {
			System.out.println(driver.getCurrentUrl());
		}
		else {
			System.out.println();
		}
		}
	}	

}
