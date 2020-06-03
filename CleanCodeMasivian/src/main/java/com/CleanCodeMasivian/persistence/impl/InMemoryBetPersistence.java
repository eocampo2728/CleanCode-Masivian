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

/**
 *
 * @author Eduardo Ocampo
 */
public class InMemoryBetPersistence implements BetPersistence{
    ApplicationDB appDB;
    @Override
    public void createNewBet(String type, String bet, int value, User user, Roulette roulette){
    }
    @Override
    public List<Bet> getBetByRoulette(int id){
        return null;
    }
    
}
