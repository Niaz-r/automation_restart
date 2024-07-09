package com.niaz.testing_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNgExample {

	
	@BeforeSuite
	public void beforesuit() {
		
		
		System.out.println("this is beforesuit");
	}
	
	@BeforeTest
	public void beforetest() {
		
		
		System.out.println("this is befortest");
	}
	
	@AfterTest
	public void aftertest() {
		
		
		System.out.println("this is Aftertest");
	}
	
	@Test(priority = 0)
	public  void TestNgExample()
	{
		
		System.out.println("this is first");
	}
	
	@AfterSuite
	public void aftersuite() {
		
		System.out.println("this is aftersuite");
		
	}
	
	@BeforeClass
	public void beforeclass() {
		
		
		System.out.println("this is beforclass");
	}
	
	
	@AfterClass
	public void afterclass() {
		
		
		System.out.println("this is afterclass");
	}
	
	@Test(priority = 1)
	public void secondtest() {
		
		
		System.out.println("this is second");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		
		System.out.println("this is beforemethod");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		
		System.out.println("this is Aftermethod");
	}
}
