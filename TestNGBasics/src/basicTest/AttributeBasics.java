package basicTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AttributeBasics {
	
	
	@BeforeTest
	public void before() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void after() {
		System.out.println("After Test");
	}

	@Test(groups = {"FunctionalTest"}, priority = 0)
	public void test1() {
		System.out.println("Test 1 started");
		Assert.assertFalse(true);
		Assert.fail();
	}
	
	@Test(groups = {"SmokeTest"},  dependsOnMethods = {"test1"}, alwaysRun = true, priority = 1 )
	public void test2() {
		System.out.println("Test 2 started");
	}
	
	@Test(groups = {"SmokeTest"}, enabled = false, priority = 2 )
	public void test3() {
		System.out.println("Test 3 started");
	}

}
