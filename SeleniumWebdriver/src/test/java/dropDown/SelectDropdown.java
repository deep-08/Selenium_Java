/******SelectDropdown******
 * 1. SelectByVisibleText()
 * 2. SelectByContainsVisibleText()
 * 3. SelectByvalue()
 * 4. SelectByIndex()	
*/


package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement	dd=	driver.findElement(By.xpath("//select[@id='country']"));
		
		Select dropOpt = new Select(dd);
		dropOpt.selectByVisibleText("Germany");
		dropOpt.selectByValue("france");
//		dropOpt.selectByIndex(10);
		
		//Capture the options frome the dropdown
			List<WebElement> opts = dropOpt.getOptions();
			
			//How many options is ther in DD.
			System.out.println("Number of opts in dropdown" + opts.size());
			
		//Print the specific options
			for (int i = 0; i < opts.size(); i++) {
			System.out.println(	opts.get(3).getText());
			break;	
		 }
			
	}

}
