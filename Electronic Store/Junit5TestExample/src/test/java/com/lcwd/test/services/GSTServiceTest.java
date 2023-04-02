package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.lcwd.test.service.GSTService;
import com.lcwd.test.service.GstProvider;


@ExtendWith(MockitoExtension.class)
public class GSTServiceTest {
	
	@Mock
	private GstProvider mockProvider;
	
	@InjectMocks
	private GSTService gstService;
	
	
//	@BeforeEach
//	public  void init() {
//		
//		MockitoAnnotations.initMocks(this);
//	}
	
	
	@Test
	public void  gstCalculaterTest() {
		
		
		
		
		//GstProvider provider = new GSTProviderImpl();
		
//		GstProvider mockProvider = Mockito.mock(GstProvider.class);
//		
//		GSTService gstService= new GSTService(mockProvider);
		
		//important line
		Mockito.when(mockProvider.getGSTDetail()).thenReturn(18);
		
		
		//Test logic of calculate GST
		int actualResult = gstService.calculateGST();
		
		Assertions.assertEquals(18, actualResult);
		
		
		
	}
	
}


//class GSTProviderImpl implements GstProvider{
//
//	@Override
//	public int getGSTDetail() {
//		
//		return 18;
//	}
//	
//}
