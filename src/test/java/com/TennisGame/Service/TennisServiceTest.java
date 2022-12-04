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
	public void fifteenLove() {
		result = test.getScore(1, 0);
		assertEquals("Fifteen, Love",result);
	}
	
	@Test
	public void thirtyLove() {
		result = test.getScore(2, 0);
		assertEquals("Thirty, Love",result);
	}
	
	@Test
	public void fortyLove() {
		result = test.getScore(3, 0);
		assertEquals("Forty, Love",result);
	}
	
	@Test
	public void Invalid() {
		result = test.getScore(7,0);
		assertEquals("invalid Score",result);
	}
	
	@Test
	public void InvalidInput() {
		result = test.getScore(0, -1);
		assertEquals("invalid Score",result);
	}
	
	@Test
	public void deuce() {
		result=test.getScore(3, 3);
		assertEquals("Deuce",result);
	}
	
	
}
