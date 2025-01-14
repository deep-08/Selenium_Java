/**********Axis Operator*********
 * ancestor::
 * descendant::
 * following::
 * preceding::
 * child::
 * parent::*
 * self::
 * 
*/

package axisOperator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class AxisSyntax {

	public static void main(String[] args) {
		
		// Set up the Chrome WebDriver
		WebDriver wDriver = new ChromeDriver();

		try {
			// Open a sample webpage
			wDriver.get("https://money.rediff.com/gainers/bse/daily/groupa");

//			wDriver.findElement(By.xpath("//a[normalize-space()='KIOCL']")).click();
//			wDriver.findElement(By.xpath("//a[normalize-space()='Crisil']")).click();
			
			wDriver.findElement(By.xpath("//a[normalize-space()='Lloyds Engineering']/parent::td")).click();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
