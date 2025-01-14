package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*****Test Case****
 * -------
 * Launch browser (chrome)
 * Open URL https://demo.opencart.com/
 * Validate title should be "Your Store"
 * Close browser
 * 
*/
public class FirstTestCase {
	public static void main(String[] args) {
//		ChromeDriver cDriver = new ChromeDriver(); this also ok..
		
		//1. Launch browser (chrome)
		WebDriver wDriver = new ChromeDriver(); // Here we are doing Upcasting;
		
		//2. Open URL https://demo.opencart.com/
		wDriver.get("https://demo.opencart.com/");
		
		//3.Validate title should be "Your Store"
		String title = wDriver.getTitle();
			if (title.equals("Your Store")) {
				System.out.println("Test Passed");
			}else {
				System.out.println("Test failed");
			}
			
		//4. Close Browser
			wDriver.close();
//			wDriver.quit();
		
	}
	
}
