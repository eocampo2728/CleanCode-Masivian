/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.persistence.impl;

import com.CleanCodeMasivian.model.Bet;
import com.CleanCodeMasivian.model.Roulette;
import com.CleanCodeMasivian.model.User;
import com.CleanCodeMasivian.persistence.ApplicationDB;
import com.CleanCodeMasivian.persistence.BetPersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eduardo Ocampo
 */
@Service
public class InMemoryBetPersistence implements BetPersistence{
    ApplicationDB appDB;
    private void newDB() {
        appDB = new ApplicationDB();
    }
    @Override
    public void createNewBet(Bet bet){
        newDB();
        try {
            appDB.createNewBet(bet);
        } catch (Exception ex) {
            Logger.getLogger(InMemoryBetPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public List<Bet> getBetByRoulette(int id){
        newDB();
        return appDB.getBetByRoulette(id);                
    }    
}
