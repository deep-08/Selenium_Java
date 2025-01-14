/************Conditional methods*********
 * -- Access these commands through WebElement----
 * ----------
 * 1. isDisplayed()
 * 2. isEnabled()
 * 3. isSelected()
*/

package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wDriver = new ChromeDriver();
		
		wDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		wDriver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logoElement= wDriver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logoElement.isDisplayed());
		
		//isEnabled()
		boolean fNstatus = wDriver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(fNstatus);
		
		//isSelected()
		WebElement male_rd= wDriver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd= wDriver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(female_rd.isSelected());
		
		male_rd.click();
		System.out.println(male_rd.isSelected());
		female_rd.click();
		System.out.println(female_rd.isSelected());
		
		WebElement nwsletter= wDriver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println(nwsletter.isSelected());
		
		wDriver.close();
	}

}
