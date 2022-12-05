package com.TennisGame.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TennisControllerTest {
	@Autowired TennisController tennis;
	
	@Test
	public void controllerTest() {
		
		assertEquals("Thirty, Forty",tennis.tennis(2, 3));
		
	}

}
