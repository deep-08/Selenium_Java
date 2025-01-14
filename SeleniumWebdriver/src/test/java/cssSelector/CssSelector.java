/*************Css Selectors*********
 * -Tag & Id    	--> tag#id
 * -Tag & Class		--> tag.className
 * -Tag & attribute	--> tag[attribute='value']
 * -Tag,Class&attribute-->tag.classname[attribute="value"]
 * 
*/

package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver wDriver= new ChromeDriver();
		wDriver.get("https://demo.nopcommerce.com/");
		wDriver.manage().window().maximize(); //maximize the window.
		
		//#id
//		wDriver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		//tag#id
//		wDriver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		
		//tag.Class
//		wDriver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirts");
		//.className
//		wDriver.findElement(By.cssSelector(".search-box-text")).sendKeys("shirts");
		
		//tag attribute tag[attribute ='value']
//		wDriver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("ado");
//		wDriver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("ado");
		
		wDriver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("alth");

		
	}

}
