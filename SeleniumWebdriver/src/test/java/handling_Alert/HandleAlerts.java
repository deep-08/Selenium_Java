package handling_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		//Switch into alert window;
//		Alert myAlert =	driver.switchTo().alert();
//		
//		myAlert.accept();
//		System.out.println(myAlert.hashCode());
	
		//Confirmation Alert with Ok & Cancel;
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Alert myAlert2=	driver.switchTo().alert();
//		myAlert2.dismiss();
		
		//Prompt Alert - Input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myAlert3=	driver.switchTo().alert();
		
		Thread.sleep(3000);
		myAlert3.sendKeys("Automated");
		myAlert3.accept();
	
	
	}
}
