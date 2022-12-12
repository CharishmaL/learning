package practiceWebDriver;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AreaDemo {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void login() throws Exception {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		// Thread.sleep(4000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//p[contains(text(),'Customers')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]")).click();
		// driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();

	}
}
