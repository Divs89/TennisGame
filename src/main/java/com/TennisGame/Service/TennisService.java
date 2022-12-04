package com.TennisGame.Service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	int playerOneScore;
	int playerTwoScore;
	
HashMap<Integer,String> score = new HashMap<Integer,String>(){{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
}};
	
public String getScore(int playerOne, int playerTwo) {
		this.playerOneScore = playerOne;
		this.playerTwoScore = playerTwo;
	
		if(playerOneScore>=0 && playerTwoScore >=0) {
			if(playerOneScore==0 && playerTwoScore ==0) {
			return "Love - All";
			}
			else  {
			return (playerOneScore<=3 && playerTwoScore <=3)?score.get(playerOneScore)+", "+score.get(playerTwoScore):"invalid Score";
			}
		}
		else
			return "invalid Score";
}

}


