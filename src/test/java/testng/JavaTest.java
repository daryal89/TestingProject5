package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaTest {

	@AfterSuite
	public void afSuite() {
		System.out.println("AfterSuite: Executes at the last of the project suite");
	}

	@AfterTest
	public void afTest() {
		System.out.println("AfterTest: Executes after every testfolder");
	}

	@AfterClass
	public void afClass() {
		System.out.println("AfterClass: Executes after every testClass");
	}

	@AfterMethod
	public void afMethod() {
		System.out.println("AfterMethod: Executes after every method");
	}

	@Test(groups= {"smoke", "sanity"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}

	@Test
	public void test5() {
		System.out.println("Test5");
	}

	@Test
	public void test6() {
		System.out.println("Test6");
	}

	@Test
	public void test7() {
		System.out.println("Test7");
	}

	@Test
	public void test8() {
		System.out.println("Test8");
	}

	@BeforeSuite
	public void bfSuite() {
		System.out.println("BeforeSuite: Executes at the first");
	}

	@BeforeTest
	public void bfTest() {
		System.out.println("BeforeTest: Executes before every testfolder");
	}

	@BeforeClass
	public void bfClass() {
		System.out.println("BeforeClass: Executes before every testClass");
	}

	@BeforeMethod
	public void bfMethod() {
		System.out.println("BeforeMethod: Executes before every method");
	}
}
