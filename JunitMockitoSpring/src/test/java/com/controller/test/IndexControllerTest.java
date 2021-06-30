package com.controller.test;





import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.projects.controller.IndexController;

public class IndexControllerTest {
	
	@Test
	public void welcomeTest() {
		
		IndexController indexController = new IndexController();
		
		String[] paramArray = null;
		
		String resultadoActual = "El array esta vacio";
		String resultadoReal = indexController.welcome(paramArray);
		assertEquals(resultadoActual, resultadoReal);
		

		
	}

}
