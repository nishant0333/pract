package com.lcwd.test.services;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {

	// Assertion -> validating actual result with expected result
	//
	
	@Test
	public void test1() {
		
//		int actual=12;
//		int expected=12;
		
		//Assertions.assertEquals(expected, actual);
		
//		int []actualIntArray= {1,2,3,4,5};
//		int []expectedIntArray= {1,2,3,4,5};
//		
//		Assertions.assertArrayEquals(expectedIntArray, actualIntArray);
	
		//String name=new String("rahul");
		//String expectedname=new String("rahul");
		
		//Assertions.assertSame(expectedname, name);//comparing refrence
		
		//Assertions.assertEquals(expectedname, name);//comparing containte
		
		//String name="rahul";
		//String expectedName="rahul";
		
		//Assertions.assertSame(expectedName, name);
		
		//Assertions.assertNull(expectedName);
		//Assertions.assertNotNull(expectedName);
		
//		boolean value=true;
//		Assertions.assertTrue(value);
		
//		List<Integer> list1=Arrays.asList(1,2,3,4,5);
//		List<Integer> list2=Arrays.asList(1,2,3,4,5);
//		
//		Assertions.assertIterableEquals(list2, list1);
		
		Assertions.assertThrows(RuntimeException.class, () -> {throw new RuntimeException(""); });
		
		
	}
	
	
}
