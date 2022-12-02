package com.TennisGame.Service;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	int playerOneScore;
	int playerTwoScore;
	
	public String getScore(int playerOne, int playerTwo) {
		this.playerOneScore = playerOne;
		this.playerTwoScore = playerTwo;
		
		if(playerOneScore==0 && playerTwoScore ==0) {
			return "Love-All";
		}
		else
			return "invalid Score";
		
	}

	

			   

}

