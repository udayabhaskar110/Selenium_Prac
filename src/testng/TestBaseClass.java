package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestBaseClass extends BaseClass{
	
	WebDriver driver;
	@Test(description="Test entering first Name and Last name")
	public void testEnter() throws Exception{
		driver.findElement(By.name("firstname")).sendKeys("firstname");
		driver.findElement(By.name("lastname")).sendKeys("Bhaskar");
		Thread.sleep(3000);
	}

}
