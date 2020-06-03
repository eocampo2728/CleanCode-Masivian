/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.services.bet;

import com.CleanCodeMasivian.model.Bet;
import com.CleanCodeMasivian.model.Roulette;
import com.CleanCodeMasivian.model.User;
import com.CleanCodeMasivian.persistence.BetPersistence;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Eduardo Ocampo
 */
@Service
public class BetServicesStub implements BetServices{
    @Autowired
    BetPersistence bPersistence;
    @Override
    public void createNewBet(Bet bet) {        
        bPersistence.createNewBet(bet);
    }
    @Override
    public List<Bet> getBetByRoulette(int id){
        return bPersistence.getBetByRoulette(id);
    }    
}
