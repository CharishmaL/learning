package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
@Test
public void SearchTest() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Iphone14" +Keys.ENTER);
//	driver.findElement(By.xpath())
}
}
