/**********Xpath*******
 * - An address of an element
 * - It preserved DOM
 * - When DOM fully loaded..after it'll execute..
 * Two types:
 * 1. Relative Xpath - //*[@id="search"]/input
 * 					   //tagname[@attribute = 'value']	
 * 2. Absolute Xpath -/html/body/header/div/div/div[2]/div/input
*/

package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
		public static void main(String[] args) {
			WebDriver wDriver = new ChromeDriver();
			wDriver.manage().window().maximize();
			
			wDriver.get("https://demo.opencart.com/");
			try {
				
			//Relative XPath
			wDriver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sad");
			
			//Xpath with 'and' operator
			wDriver.findElement(By.xpath("//input[@placeholder='Search' and @placeholder='Search']")).sendKeys("achieve");
			wDriver.findElement(By.xpath("//input[@placeholder='Search' or @placeholder='xdkf']")).sendKeys("achieve");
			
			//Xpath with inner text - text
//				-- a[text()='Desktop']
			
			wDriver.findElement(By.xpath("//*[text()='MacBook']")).click();
			boolean featuredisplayed = wDriver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
			System.out.println(featuredisplayed);
			
			//getvalue method;
			String valueString = wDriver.findElement(By.xpath("//h3[text()='Featured']")).getText();
			System.out.println(valueString);
			
			//Xpath with contains()
			wDriver.findElement(By.xpath("//input[contains(@placeholder,'rch')]")).sendKeys("Mic");
			
			//Xpath in start-with()
			wDriver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mic");
			
			//Handling dynamic attributes
			wDriver.findElement(By.xpath("//*[@id='Star' or @id='Stop']"));
			wDriver.findElement(By.xpath("//*[contains(@id,'st']"));
			wDriver.findElement(By.xpath("//*[starts-with(@id,'st']"));
			
			
			//Chained Xpath -- Without attributes of elements
			boolean	imgstatus=	wDriver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
			System.out.println(imgstatus);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				wDriver.quit();
			}			
		}
}
