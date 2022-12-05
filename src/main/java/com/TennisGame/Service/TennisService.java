package com.TennisGame.Service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	
	HashMap<Integer,String> score = new HashMap<Integer,String>(){{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
	}};
	
	HashMap<String,Integer> points = new HashMap<String, Integer>(){{
		put("playerOneScore",0);
		put("playerTwoScore",0);
	}};
	
	public String getScore(int playerOne, int playerTwo) {
		if(playerOne>=points.get("playerOneScore") && playerTwo >=points.get("playerTwoScore")) {
			points.put("playerOneScore", playerOne);
			points.put("playerTwoScore", playerTwo);
			return (playerOne<=3 && playerTwo <=3)?deuce(playerOne,playerTwo):score(playerOne,playerTwo);
		}
		else
			return "invalid Score";
	}
	
	public String deuce(int playerOneScore,int playerTwoScore) {
		// TODO Auto-generated method stub
		if (playerOneScore ==3 && playerTwoScore == 3){
	        return "Deuce";
	        }

	    else {
	       return (playerOneScore == playerTwoScore)?(score.get(playerOneScore)+" - All"):
	                            (score.get(playerOneScore)+", "+score.get(playerTwoScore));
	         }
	      
	}
	
	public String score(int playerOneScore,int playerTwoScore) {
		// TODO Auto-generated method stub
	int score = playerOneScore - playerTwoScore;
	
	if (playerOneScore == playerTwoScore){
        return "Deuce";
        }

	if(Math.signum(score)==1){
	    return (score>=2)? "PlayerOne Wins the Game "+statics(playerOneScore,playerTwoScore):"PlayerOne "+"Advantage";}

	else{
	    return (score<=-2)?"PlayerTwo Wins the Game "+statics(playerOneScore,playerTwoScore):"PlayerTwo "+"Advantage";
		}

	}

	private String statics(int playerOneScore,int playerTwoScore) {
		// TODO Auto-generated method stub
	
	return (" { Statics :- PlayerOne Won : "+playerOneScore+ " Points ; PlayerTwo Won : "+ playerTwoScore+" Points }");

	}

	
	
	

}

