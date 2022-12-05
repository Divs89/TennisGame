package com.TennisGame.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.TennisGame.Service.TennisService;

@RestController
public class TennisController {
	@Autowired TennisService tennisService;
	
	@GetMapping ("/tennis/{playerOne}/{playerTwo}")
	public String tennis(@PathVariable int playerOne,@PathVariable int playerTwo) {
		return tennisService.getScore(playerOne,playerTwo);
	}

}
