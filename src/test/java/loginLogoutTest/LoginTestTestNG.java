package loginLogoutTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestTestNG {
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

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(4000);
		driver.manage().window().setSize(new Dimension(686, 585));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".bi-caret-down-fill")).click();

		Thread.sleep(4000);

		driver.findElement(By.linkText("Logout")).click();
		//assertThat(driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).getText(), is("Forgot your password?"));
	}
}
