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
	public void InvalidInput() {
		result = test.getScore(0, -1);
		assertEquals("invalid Score",result);
	}
	
	@Test
	public void deuce() {
		result=test.getScore(3, 3);
		assertEquals("Deuce",result);
	}
	
	@Test
	public void fifteenAll() {
		result = test.getScore(1, 1);
		assertEquals("Fifteen - All",result);
	}
	
	@Test
	public void thirtyAll() {
		result = test.getScore(2, 2);
		assertEquals("Thirty - All",result);
	}
	
	@Test
	public void thirtyFifteen() {
		result = test.getScore(2, 1);
		assertEquals("Thirty, Fifteen",result);
	}
	
	@Test
	public void thirtyForty() {
		result = test.getScore(2, 3);
		assertEquals("Thirty, Forty",result);
	}
	
	@Test
	public void fifteenForty() {
		result = test.getScore(1, 3);
		assertEquals("Fifteen, Forty",result);
	}
	
	@Test
	public void playerOneAdvantage() {
		result = test.getScore(4,3);
		assertEquals("PlayerOne Advantage",result);
	}
	
	@Test
	public void playerTwoAdvantage() {
		result = test.getScore(3,4);
		assertEquals("PlayerTwo Advantage",result);
	}
	
	@Test
	public void playerOneWin() {
		result = test.getScore(5,3);
		assertEquals("PlayerOne Wins the Game",result);
	}	
			
	@Test
	public void playerTwoWin() {
		result = test.getScore(2,5);
		assertEquals("PlayerTwo Wins the Game",result);
	}
	
	@Test
	public void winByMorePoints() {
		result = test.getScore(15,17);
		assertEquals("PlayerTwo Wins the Game",result);
	}

}
