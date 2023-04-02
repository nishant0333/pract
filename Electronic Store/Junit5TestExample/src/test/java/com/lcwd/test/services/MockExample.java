package com.lcwd.test.services;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockExample {

	@Mock
	List<Integer> list;
	
	@Mock
	Map<String, Integer> map;
	
	
	@Test
	public void runTest() {
		
		int listSize=5;
		int valueZerothPosition = 34;
		
		Mockito.when(list.size()).thenReturn(5);
		
		Mockito.when(map.get("first")).thenReturn(34).thenReturn(12).thenReturn(24);
		
		int size = list.size();
		
		System.out.println("list size is : "+size);
		
		//Assertions.assertEquals(listSize, list.size());
		
		Assertions.assertEquals(valueZerothPosition,map.get("first"));
		
	}
	
	
}
