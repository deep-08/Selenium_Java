/*********SwitchFrames****
 * Three ways to switch to frames:
 * 1.driver.switchTo().frame(name)
 * 2.driver.switchTo().frame(id)
 * 4.driver.switchTo().frame(index)
 * 3.driver.switchTo().frame(webElement)
*/


package framesHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.AllArguments;

public class Handling_frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Find the frame1:
		WebElement frame1 =	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		//Switch to that focusing frame
		driver.switchTo().frame(frame1);//pass frame as webelement;
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("fuck you");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		//Find Frame2:
		WebElement frame2=  driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("suck U");
		
		driver.switchTo().defaultContent();
		
		//Find Frame3:
		WebElement frame3=	driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Mothafuck");
		
		//inner iframe - part of frame 3
		driver.switchTo().frame(0); //Switching element using index
		
		WebElement rdbtm = driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
		
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		
			jsExecutor.executeScript("arguments[0].click()",rdbtm);
			
		driver.switchTo().defaultContent();
		
	}

}
