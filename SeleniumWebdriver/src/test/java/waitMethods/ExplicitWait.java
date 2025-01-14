/*********Explicit wait******
 * --We should create an instance.
 * wait.unit.condition.condition expression(duration of seconds);
 * Explicit waits works only if condition is true..
 * Conditional based, it will work more effectively
 * finding the element is inclusive(for some conditions)
 * it will wait for condition to be true, then consider the time
 * we need to write multiple statements for multiple elements
*/

	/*alertIsPresent()
	elementSelectionStateToBe()
	elementToBeClickable()
	elementToBeSelected()
	visibilityOf()
	visibilityOfElementLocated()
	presenceOfElementLocated()
	textToBePresentInElement()
	textToBePresentInElementValue()
	frameToBeAvailableAndSwitchToIt()
	invisibilityOfElementLocated()
	numberOfElementsToBe()
	numberOfElementsToBeMoreThan()
	titleIs()
	titleContains()
	urlToBe()
	urlContains()
	urlMatches()
	stalenessOf()
*/

package waitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement dElement	=exWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));		
		dElement.sendKeys("Admin");
		
		WebElement elepass = exWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));	
		elepass.sendKeys("admin123");
		
		WebElement logbtn = exWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		logbtn.click();
	}
}
