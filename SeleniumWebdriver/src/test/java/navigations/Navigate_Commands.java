/******Navigational Commands********
 * ----
 * 1. navigate().to(url)//We can pass the url through object format also.
 * 2. navigate().back()
 * 3. navigate().forward()
 * 4. navigate().refresh()
*/

package navigations;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Commands {
	public static void main(String[] args) throws MalformedURLException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/"); //Accepts only in string format.

		//Object URL Declaration
		URL myUrl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myUrl);

		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
	}
}
