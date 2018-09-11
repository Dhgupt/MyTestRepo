package com.TestNGBasics;

import java.util.HashMap;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGConcepts {

	@BeforeMethod
	public void Precondition() {
		System.out.println("Precondition ---------->");
	}

	@Test(invocationCount = 1, groups = {"SmokeTest"})
	public void test1() {
		System.out.println("Test1");
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "test1", groups = "FunctionalTest" )
	public void test2() {
		System.out.println("Test2");
		Assert.assertEquals(true, true);
	}

	@Test(dataProvider = "getData", groups = {"FunctionalTest","SecurityTest-RoleBase"} )
	public void test3( ) {
		System.out.println("Test3");
		System.out.println();
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "test3", groups = {"FunctionalTest","SecurityTest-DataEntitlement"})
	@Parameters({"firstname", "lastname"})
	public void test4(String firstname, String lastname) {
		
		System.out.println("Test4");
		System.out.println(firstname + " "+ lastname);
		Assert.assertEquals(true, true);
	}

	@AfterMethod
	public void Postcondition() {
		System.out.println("Postcondition ---------->");
	}
	
	@DataProvider(name = "getData")
	public static Object[][] getData(){
	           
	       Object[][] data = new Object[2][2];
	       Hashtable<String,String> htable = new Hashtable<String,String>();
	       	       
	      htable.put("key1",  "data1" );
	      htable.put("key2",  "data2" );		   
	      data[0][0] = "key1";
	      data[0][1] = "key1";
	      data[1][0] = "Data1";
	      data[1][1] = "Data1";
	       return data;
	       
	}
}
