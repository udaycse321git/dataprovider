package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class datasetupandteardown {
	@BeforeSuite
	public void datasetup() {
		System.out.println("data setup");
	}

	@AfterSuite
	public void datateardown() {
		System.out.println("datateardown setup");
	}

}
