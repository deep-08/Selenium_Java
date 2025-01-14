package handling_CheckBox;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select Specific checkBox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// Select All CheckBox
		List<WebElement> checkboxes = driver
			.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		 for (WebElement listcheckBx : checkboxes) {
//			listcheckBx.click();
//		}

		// UnSelect last three checkBox
		/*
		 * Totally i have 7 checkbox last three i have to start to select 7-3 = 4 is
		 * index of element to start
		 */
		for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2000);
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}

		// Select the fir four check box
		for (int i = 0; i < checkboxes.size() - 3; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		// Unselect the selected check box;
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}

	}

}
