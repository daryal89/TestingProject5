package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {

	@Test(groups= {"smoke", "regression"})
	public void test1() {
		Assert.assertTrue(true); // passed
	}

	@Test(dependsOnMethods = "test1")
	public void test4() {
		Assert.assertFalse(false); // passed
	}

	@Test
	public void test5() {
		Assert.assertEquals("Test", "Test");// passed
	}

	@Test
	public void test6() {
		Assert.assertEquals("Test", "hello");// failed
	}

	@Test(dependsOnMethods = "test6")
	public void test7() {
		Assert.assertEquals("Test", "Test");// passed
	}

	@Test(dependsOnMethods = "test7")
	public void test9() {
		Assert.assertNotEquals("Test", "hello"); // passed
	}

}
