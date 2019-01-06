package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTestNG {

	@Test(groups= {"smoke"})
	public void test1() {
		Assert.assertTrue(true); //passed
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);//failed
	}

	@Test
	public void test3() {
		Assert.assertFalse(true);//failed
	}

	@Test
	public void test4() {
		Assert.assertFalse(false); //passed
	}

	@Test
	public void test5() {
		Assert.assertEquals("Test", "Test");//passed
	}

	@Test
	public void test6() {
		Assert.assertEquals("Test", "hello");//failed
	}

	@Test
	public void test7() {
		Assert.assertEquals("Test", "Test");//passed
	}

	@Test
	public void test8() {
		Assert.assertNotEquals("Test", "Test"); //failed
	}

	@Test
	public void test9() {
		Assert.assertNotEquals("Test", "hello"); //passed
	}

	@Test
	public void test10() {
		Assert.assertTrue(false, "not matching the expected condition");//failed
	}
}
