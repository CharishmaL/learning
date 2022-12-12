package practiceWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	@Test
	public void amazon() throws Exception {
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		WebDriver driver = WebDriverManager.chromedriver().create();
		// driver.get("https://www.amazon.in/");
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(4000);

		//driver.findElement(By.xpath("//h2[text()='Top picks for your home']//parent::div//following-sibling::div[@class='a-cardui-footer']//child::a[text()='See more']")).click();
	driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input[@type='checkbox']")).click();
		Thread.sleep(5000);

	}

}
