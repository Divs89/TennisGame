package com.TennisGame.Service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TennisServiceTest {
	@Autowired TennisService test;
	
	String result;
	
	/* This Test case is to check both players score 0  */

	@Test
	public void loveAll() {
		result = test.getScore(0, 0);
		assertEquals("Love - All",result);
	}
	
	/* These Test cases is to check player two scores points with player one score 0  */
	
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
	
	/* These Test cases is to check player one scores points with player two score 0  */
	
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
	
	/* This Test case is to check invalid input   */
	
	@Test
	public void InvalidInput() {
		result = test.getScore(0, -1);
		assertEquals("invalid Score",result);
	}
	
	/* This Test case is to check deuce i.e both players score 40-40 */
	
	@Test
	public void deuce() {
		result=test.getScore(3, 3);
		assertEquals("Deuce",result);
	}
	
	/* This Test case is to check both players score 1 point each */
	
	@Test
	public void fifteenAll() {
		result = test.getScore(1, 1);
		assertEquals("Fifteen - All",result);
	}
	
	/* This Test case is to check both players score 2 points each  */
	
	@Test
	public void thirtyAll() {
		result = test.getScore(2, 2);
		assertEquals("Thirty - All",result);
	}
	
	/* These Test cases is to check both players scores point  */
	
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
	
	/* This Test case is to check player one score a point after deuce */
	
	@Test
	public void playerOneAdvantage() {
		result = test.getScore(4,3);
		assertEquals("PlayerOne Advantage",result);
	}
	
	/* This Test case is to check player two score a point after deuce */
	
	@Test
	public void playerTwoAdvantage() {
		result = test.getScore(3,4);
		assertEquals("PlayerTwo Advantage",result);
	}
	
	/* This Test case is to check player one score 2 point after deuce to win game */
	@Test
	public void playerOneWin() {
		result = test.getScore(5,2);
		assertEquals("PlayerOne Wins the Game \n {Statics :\nPlayerOne Won : 5 Points ;\nPlayerTwo Won : 2 Points }"
				,result);
	}
	
	/* This Test case is for players scores continuously (duece and adv) & player two wins the game */
	
	@Test
	public void playerTwoWin() {
		result = test.getScore(15,17);
		assertEquals("PlayerTwo Wins the Game \n {Statics :\nPlayerOne Won : 15 Points ;\nPlayerTwo Won : 17 Points }"
				,result);
	}

}
