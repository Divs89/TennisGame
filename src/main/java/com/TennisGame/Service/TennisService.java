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
			return (playerOneScore<=3 && playerTwoScore <=3)?deuce():score();
		}
		else
			return "invalid Score";
	}
	
	private String deuce() {
		// TODO Auto-generated method stub
		if (playerOneScore ==3 && playerTwoScore == 3){
	        return "Deuce";
	        }

	    else {
	       return (playerOneScore == playerTwoScore)?(score.get(playerOneScore)+" - All"):
	                            (score.get(playerOneScore)+", "+score.get(playerTwoScore));
	         }
	      
	}
	
	private String score() {
		// TODO Auto-generated method stub
	int score = playerOneScore - playerTwoScore;

	if(Math.signum(score)==1){
	    return (score>=2)? "PlayerOne Wins the Game":"PlayerOne "+"Advantage";}

	else{
	    return (score<=-2)?"PlayerTwo Wins the Game":"PlayerTwo "+"Advantage";
	}

	}

}

