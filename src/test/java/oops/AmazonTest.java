package oops;


import org.junit.Test;

public class AmazonTest {

	@Test

	public void verifyAppTitle() {

		String actualTitle = "iphone 14: amazon";

		String expectedTitle = "iphone 14 pro: amazon";

		// //create an object

		// Assert a = new Assert();

		//a.AssertEqual(actualTitle, expectedTitle);

		AssertExample.AssertEqual(actualTitle, expectedTitle);

	}

}
