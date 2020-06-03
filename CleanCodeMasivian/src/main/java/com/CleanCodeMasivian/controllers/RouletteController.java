package com.CleanCodeMasivian.controllers;

import com.CleanCodeMasivian.model.*;
import com.CleanCodeMasivian.services.user.UserServices;
import com.CleanCodeMasivian.services.roulette.RouletteServices;
import com.CleanCodeMasivian.services.bet.BetServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Eduardo Ocampo
 */
@RestController
@RequestMapping(value = "/api/v1")
public class RouletteController {
    @Autowired
    RouletteServices rServices;
    @Autowired
    UserServices uServices;
    @Autowired
    BetServices bServices;
    @RequestMapping(method = RequestMethod.POST, path = "roulette")
    public ResponseEntity<?> createNewRoulette() {
        try{
            return new ResponseEntity<>("Unable to create roulette", HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex) {
            Logger.getLogger(RouletteController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Unable to create roulette", HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @RequestMapping(method = RequestMethod.PUT, path = "roulette")
    public ResponseEntity<?> openRoulette() {
        try{
            return new ResponseEntity<>("Unable to open roulette", HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex) {
            Logger.getLogger(RouletteController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Unable to open roulette", HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createNewBet(@RequestBody Bet bet) {
        try{
            return new ResponseEntity<>("Unable to create new bet", HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex) {
            Logger.getLogger(RouletteController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Unable to create new bet", HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @RequestMapping(method = RequestMethod.GET, path = "roulette/{id}")
    public ResponseEntity<?> getAllBetsByRoulette(@PathVariable("id") String roulette) {
        try{
            return new ResponseEntity<>("Unable to get bets by roulette", HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex) {
            Logger.getLogger(RouletteController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Unable to get bets by roulette", HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @RequestMapping(method = RequestMethod.GET, path = "roulette")
    public ResponseEntity<?> getAllRoulettes() {
        try{
            return new ResponseEntity<>("Unable to get all roulette", HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex) {
            Logger.getLogger(RouletteController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Unable to get all roulette", HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
}
