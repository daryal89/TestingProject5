package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaMethodTest {


	//@AfterClass
	public void afClass() {
		System.out.println("AfterClass: Executes after every testClass");
	}

	@AfterMethod
	public void afMethod() {
		System.out.println("AfterMethod: Executes after every method");
	}

	@Test(groups= {"smoke", "regression"})
	public void demo1() {
		System.out.println("Test1");
	}

	@Test
	public void demo2() {
		System.out.println("demo2");
	}

	@Test
	public void demo3() {
		System.out.println("demo3");
	}

	@Test
	public void demo4() {
		System.out.println("demo4");
	}

	@Test
	public void demo5() {
		System.out.println("demo5");
	}

	@Test
	public void demo6() {
		System.out.println("demo6");
	}

	@Test
	public void demo7() {
		System.out.println("demo7");
	}

	@Test
	public void demo8() {
		System.out.println("demo8");
	}

	

	//@BeforeClass
	public void bfClass() {
		System.out.println("BeforeClass: Executes before every testClass");
	}

	@BeforeMethod
	public void bfMethod() {
		System.out.println("BeforeMethod: Executes before every method");
	}
}
