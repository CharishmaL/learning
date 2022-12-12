package nopComm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	// ctrl+shoift+O ------ auto import

	// pre-condition ---- @BeforeSuite---

	// Test

	// post-condition
	
	@BeforeTest

	public void launchApp() {

		System.out.println("launching app");

		driver = WebDriverManager.chromedriver().create();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

	}

	@AfterTest

	public void closeApp() throws Exception {

		Thread.sleep(5000);

		driver.close();

		System.out.println("closing app");

	}

}
