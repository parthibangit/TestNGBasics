package basicTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertBasics {
	
	/**
	 * i) Soft assert collects error during the test. It doest not throw exception if the assert get failed.
	 * ii) Controller moves to the next step.
	 * iii) If we want throw exception then we need to add assertAll() method at end of the method.
	 * iv) After thrown following steps not executed.
	 * v) Next test will continue.
	 */
	
	@Test(priority = 0)
	public void softAssert() {
		
		SoftAssert soft = new SoftAssert();
		soft.assertFalse(true);
		System.out.println("Come across the failed step");
		soft.assertAll();
		System.out.println("Error thrown");
	}
	
	@Test(priority = 1)
	public void sampleTest() {
		System.out.println("Second method started");
	}

}
