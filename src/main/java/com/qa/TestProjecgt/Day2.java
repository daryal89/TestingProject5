package com.qa.TestProjecgt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void personalLoan() {
		System.out.println("personal loan");

	}

	@Test
	public void AutoLoan() {
		System.out.println("Auto loan");

	}

	@Test
	public void HomeLoan() {
		System.out.println("Home loan");
		boolean b = true;
		Assert.assertFalse(b);

	}

	@Test
	public void educationLoan() {
		System.out.println("Education loan");
		String actual = "Hello";
		Assert.assertEquals(actual, "hello");

	}

}
