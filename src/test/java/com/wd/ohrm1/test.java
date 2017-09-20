package com.wd.ohrm1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test {

	@Test
public void test1() {
	System.out.println("this is begginingof test");
	System.out.println("");
}

	@Test(dependsOnMethods="test1")
public void test2() {
	System.out.println("end of test");
	
}

}
