package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {

	@Parameters({ "data", "url" })
	@Test
	public void test(@Optional("Default") String un, @Optional("Default") String urlname) {
		System.out.println("parameter is: " + un);
		System.out.println("parameter is: " + urlname);

	}

}
