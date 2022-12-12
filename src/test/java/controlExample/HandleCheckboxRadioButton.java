package controlExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class HandleCheckboxRadioButton extends BaseTest {

	@Test
	public void handleCheckbox() {
		System.out.println("handleCheckbox");
		
	driver.findElement(By.xpath("//input[@value='Boat']")).click();
		
		
	}
	
	@Test
	public void handleradiobutton() {
		
		System.out.println("handleRadioButton");
			driver.findElement(By.xpath("//input[contains(@value,'female')]")).click();
		
		
		
		
		
		
		
}
}