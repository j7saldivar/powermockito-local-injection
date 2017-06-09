package com.saldivar.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.saldivar.beans.SimplePojo;
import com.saldivar.controller.SimpleController;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SimpleController.class})
public class SimpleControllerTest {

	@Test
	public void testGetSimplePojoName() throws Exception {
		
		SimplePojo mockSimplePojo = PowerMockito.mock(SimplePojo.class);
		Mockito.when(mockSimplePojo.getName()).thenReturn("Injected mockito name");
		PowerMockito.whenNew(SimplePojo.class).withAnyArguments().thenReturn(mockSimplePojo);
		
		SimpleController s = new SimpleController();
		Assert.assertEquals("Injected mockito name",s.getSimplePojoName());
		
	}

}
