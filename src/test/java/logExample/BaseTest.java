package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

	Logger log;

	// ctrl+Shift+O ------ auto-import

	// control execution workflow

	// pre-condition ------- @Before

	// Test

	// post-condition ------ @After

	@Before

	public void launchApp() {

		log = Logger.getLogger("Amazon App Module");

		PropertyConfigurator.configure("./testData/log4j.properties");

		log.info("launching the application");

		// System.out.println("launching the application");

	}

	@After

	public void closeApp() {

		log.info("closing the application");

		// System.out.println("closing the application");

	}

}
