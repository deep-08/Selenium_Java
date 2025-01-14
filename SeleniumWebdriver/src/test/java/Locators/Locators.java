/**********Locators********

 * Two type of Locators
 --Normal Locators
 * 1. id
 * 2. name
 * 3. Linktext/ PartialLinktext
 * 4. Class Name\
 * 5. Tag Name
 * 
 --Customized Locators--
 * 1. CSS Selector
 * 		-Tag & Id
 * 		-Tag & Class
 * 		-Tag & attribute
 * 		-Tag,Class and attribute
 * 
 * 2. Xpath
 * 		-Absolute XPath
 * 		-Relative XPath
 * 
 */
package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver wDriver = new ChromeDriver();
		
		wDriver.get("https://demo.opencart.com/");
		
		// #name
//		wDriver.findElement(By.name("search")).sendKeys("job");
		
		// #id
//		boolean logoDisplayedstatus=wDriver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplayedstatus);
		
		// #linktext 
//		wDriver.findElement(By.linkText("Components")).click();
		
		// #partialLinkText
//		wDriver.findElement(By.partialLinkText("Compon")).click();
		
		// #Class
		List<WebElement> HeaderLinks = wDriver.findElements(By.className("list-inline-item"));
		System.out.println("Total no.of header " + HeaderLinks.size());
		
		//#Tag Name
		List<WebElement> links = wDriver.findElements(By.tagName("a"));
		System.out.println("toal no.of taglink "+ links.size());
		
		List<WebElement> imglinks = wDriver.findElements(By.tagName("img"));
		System.out.println("Total no.of img tag " + imglinks.size());
	
		
	}
}
