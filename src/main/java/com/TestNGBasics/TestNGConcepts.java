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
  public void f1() {
	  System.out.println("Test1");
  }
  
  @Test (invocationCount=1)
  public void f2() {
	  System.out.println("Test2");
  }
  
  @Test (invocationCount=3)
  public void f3() {
	  System.out.println("Test1");
  }
  
  @Test (invocationCount=4)
  public void f4() {
	  System.out.println("Test4");
  }
  
  @AfterMethod
  public void c(){
	  System.out.println("After the Test Method");
  }
}
