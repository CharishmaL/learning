package nopComm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest1 {

	@Test

	public void verifyLogin() throws Exception {

		WebElement txt_Email = driver.findElement(By.xpath("//input[@id='Email']"));

		txt_Email.clear();

		txt_Email.sendKeys("admin@yourstore.com");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");

		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();

		System.out.println("login test case'");

		Thread.sleep(4000);

		// validation step

		String actualTitle = driver.getTitle();

		System.out.println("Application Title after login: " + actualTitle);

		Thread.sleep(4000);

		// click on Logout

		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();

	}

}
