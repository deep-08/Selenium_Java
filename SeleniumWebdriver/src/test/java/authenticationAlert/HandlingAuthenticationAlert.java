/**************HandlingAuthenticationAlert***********

 * By Passing through url:
 * 	--Take an Example url: https://the-internet.herokuapp.com/basic_auth
 * Passing through url like this
 * 		//https:admin:admin@the-internet.herokuapp.com/basic_auth
 * syntax:		
 * 		--https://username:password@the-internet.herokuapp.com/basic_auth
 * 				
*/




package authenticationAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
