package com.awssdt;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnitRunner;

import com.amazonaws.services.s3.model.GetObjectRequest;

@RunWith(MockitoJUnitRunner.class)
public class GetDataFunctionHandlerTest {

	@Captor
	private ArgumentCaptor<GetObjectRequest> getObjectRequest;
	
	@Before
	public void setUp() throws IOException {
		
	}
	
	@Test
	public void testGetDataFunctionHandler() {
		Assert.assertEquals(new Integer(0), new Integer(0));
	}
}