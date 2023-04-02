package com.lcwd.test.services;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lcwd.test.service.CalculatorService;

import junit.framework.Assert;



public class CalculatorServiceTest {
	
	int counter=0;
	
	@BeforeClass   //Before all test cases
	public static void init() {
		System.out.println("Before all test cases");
		System.out.println("Started test : "+new Date());
	}
	
	
	@Before   //execute the method before each test case
	public void beforeEach() {
		System.out.println("Before each test case");
		counter=0;
	}

	//test method of addTwoNumbers
	@Test(timeout = 2000)
	public void addTwoNumbersTest() throws InterruptedException {
		
		for(int i=1;i<=20;i++) {
			counter+=i;
		}
		
		Thread.sleep(3000);
		
		System.out.println("test for addTwoNumbersTest");
		int result = CalculatorService.addTwoNumbers(12,45);
		int expected=57;
		System.out.println("counter int first test case : " + counter);
		Assert.assertEquals(result, expected);
	}
	
	@Test
	public void sunAnyNumberTest() {
		

		for(int i=1;i<=100;i++) {
			counter+=i;
		}
		
		System.out.println("test for sunAnyNumberTest ");
		int result = CalculatorService.sumAnyNumber(2,7,8,9);
		int expected =26;
		System.out.println("counter int second test case : " + counter);
		Assert.assertEquals(result,expected);
	}
	
	@AfterClass  //after all test cases
	public static void cleanup() {
		System.out.println("After all test cases");
		System.out.println("End test cases : " + new Date());
	}
	
	
	//Test
	//BeforeClass
	//AfterClass
	//Before
	//After
	
	
}
