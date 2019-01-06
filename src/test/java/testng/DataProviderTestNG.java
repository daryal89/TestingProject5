package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	@Test(dataProvider = "testData")
	public void test1(String un, String pw) {
		System.out.println("username " + un + "  " + "password: " + pw);
	}
	
	@Test(dataProvider = "testData1")
	public void test2(int a, int b) {
		System.out.println("a: " + a+ "  " + "b: " + b);

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "username1";
		data[0][1] = "password1";

		data[1][0] = "username2";
		data[1][1] = "password2";

		data[2][0] = "username3";
		data[2][1] = "password3";

		return data;
	}
	
	@DataProvider
	public Object[][] testData1() {
		Object[][] data1 = new Object[3][2];

		data1[0][0] = 1;
		data1[0][1] = 3;

		data1[1][0] = 4;
		data1[1][1] = 6;

		data1[2][0] = 8;
		data1[2][1] = 10;

		return data1;
	}
}
