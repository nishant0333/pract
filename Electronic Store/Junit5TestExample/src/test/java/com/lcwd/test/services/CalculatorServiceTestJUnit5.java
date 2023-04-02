package com.lcwd.test.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.lcwd.test.service.CalculatorService;



public class CalculatorServiceTestJUnit5 {
	
	@BeforeAll
	public static void init() {
	System.out.println("This is single time logic");	
		
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("After all test case logic");
		
	}
	
	
	@BeforeEach
	public void eachTestCase() {
		System.out.println("Before each");
	}
	
	
	@AfterEach
	public void afterTestCase() {
		System.out.println("After each");
	}
	
	

	@Test
	@DisplayName("this is custom name")  //to display specific name
	public void addTwoNumbersTest() {
		
		System.out.println("first test case");
		
	int actualResult = CalculatorService.addTwoNumbers(12, 12);
	
	int expectedResult =24;
	
	Assertions.assertEquals(expectedResult, actualResult,"Test fail");
		
	}
	
	@Test
	@Disabled   //to disable a test
	public void addAnnyNumbersTest() {
		
		System.out.println("second test case");
		
		int result = CalculatorService.sumAnyNumber(12,1,2,3);
		int expextedResult= 18;
		Assertions.assertEquals(expextedResult, result);
		
		
	}
	
	    //JUnit4          JUnit5
	    //---------------------------
	    //@Test         -> @Test
		//@BeforeClass  -> @BeforeAll
		//@AfterClass   -> @AfterAll
		//@Before       -> @BeforeEach
		//@After        -> @AfterEach
	                     //@Tag
	                     //@Nested
	                     //@TestFactory
	                     //@DisplayName
	                     //@Disabled
}
