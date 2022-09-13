/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessthenumber.controllers;

import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Round;
import com.sg.guessthenumber.models.data.service.GameServiceLayer;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Teresa
 */

@RestController
@RequestMapping ("/api")
public class GameController {
    
    @Autowired
    GameServiceLayer service;
    
    @PostMapping("/begin")
    @ResponseStatus(HttpStatus.CREATED)
    public int beginGame(){
        return this.service.beginGame();
    }
    
    @PostMapping("/guess")
    public Round makeGuess(@RequestBody Round round){
        return this.service.makeGuess(round);
    }
    
    @GetMapping("/game")
    public List<Game> getAllGames() {
        return this.service.getAllGames();
    }
    
    @RequestMapping(value = "/game/{gameid}", method = RequestMethod.GET)
    public Game getGameByID(@PathVariable("gameid") int gameID) {
        return this.service.getGameByID(gameID);
    }
    
    @RequestMapping(value = "/rounds/{gameid}", method = RequestMethod.GET)
    public List<Round> getRoundsByID(@PathVariable ("gameid") int gameID){
        return this.service.getAllRoundsByID(gameID);
    }
    
}
