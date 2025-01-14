package waitMethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
			
		//Fluentwait Decleration
		Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))//It will wait unit 30 second visibility of element.
				.pollingEvery(Duration.ofSeconds(2)) //It will divide the timeout & execute equalent time;
				.ignoring(NoSuchElementException.class);//It will ignore the exception every interval.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Usecase
		WebElement inpUserName = myWait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     }
		   });
		inpUserName.sendKeys("Admin");
		} catch (Exception e) {
			System.out.println("Low Performance due to preloader is heavy traffic");
		}
	}

}
