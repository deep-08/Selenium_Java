



package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		//Find Dropdown
		WebElement btdropdown = driver.findElement(By.xpath("//button[@id='menu1']"));
		//Open dropdown
		btdropdown.click();
//		driver.findElement(By.xpath("//a[normalize-space()='JavaScript']")).click();
//		driver.switchTo().defaultContent();
		
		//Capture all the options and find out size.
		List<WebElement>dropDownelem=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		
		System.out.println("No. of Options " + dropDownelem.size());
		
	/*	
		for(WebElement optionElement:dropDownelem) {
			System.out.println(optionElement.getText());
		}
	*/	
		
		for(WebElement op:dropDownelem) {
			System.out.println(op.getText());
			if (op.getText().equals("HTML")|| op.equals("CSS")|| op.equals("Javascript")) {
				op.click();
			} else {
				System.out.println("Expected option is not there");
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
