package basicTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertBasics {

	/**
	 * i) Hard assert throw exception if assert get failed.
	 * ii) Controller moves to the next test of the suite.
	 */
	
	@BeforeTest
	public void before() {
		System.out.println("Before Test");
	}
	
	@BeforeTest
	public void before1() {
		System.out.println("Before Test");
	}
	
	@Test(priority = 0)
	public void hardAssert() {
		
		Assert.assertFalse(true);
		System.out.println("Come across the failed step");
	}
	
	@Test(priority = 1)
	public void sampleTest() {
		System.out.println("Second method started");
	}
	
}
