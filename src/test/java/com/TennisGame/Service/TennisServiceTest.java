package com.TennisGame.Service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TennisServiceTest {
	@Autowired TennisService test;
	
	String result;

	@Test
	public void loveAll() {
		result = test.getScore(0, 0);
		assertEquals("Love - All",result);
	}
	
	@Test
	public void loveFifteen() {
		result = test.getScore(0, 1);
		assertEquals("Love, Fifteen",result);
	}
	
	@Test
	public void loveThirty() {
		result = test.getScore(0, 2);
		assertEquals("Love, Thirty",result);
	}
	
	@Test
	public void loveForty() {
		result = test.getScore(0, 3);
		assertEquals("Love, Forty",result);
	}
	
	@Test
	public void Invalid() {
		result = test.getScore(0, 7);
		assertEquals("invalid Score",result);
	}
	
	@Test
	public void InvalidInput() {
		result = test.getScore(0, -1);
		assertEquals("invalid Score",result);
	}
	
	
}
