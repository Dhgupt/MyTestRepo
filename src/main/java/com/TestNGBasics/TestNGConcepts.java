package com.TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConcepts {
	
@BeforeMethod
public void a(){
	System.out.println("Before Test Method");
}

  @Test (invocationCount=3)
  public void f() {
	  System.out.println("Test");
  }
  
  @AfterMethod
  public void c(){
	  System.out.println("After the Test Method");
  }
}
