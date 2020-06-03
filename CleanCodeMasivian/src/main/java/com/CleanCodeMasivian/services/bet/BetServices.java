/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.services.bet;

import com.CleanCodeMasivian.model.Bet;
import com.CleanCodeMasivian.model.Roulette;
import com.CleanCodeMasivian.model.User;
import java.util.List;
/**
 *
 * @author Eduardo Ocampo
 */
public interface BetServices {
    /**
     * 
     * @param bet
     */
    public void createNewBet(Bet bet);
    /**
     * 
     * @param id
     * @return 
     */
    public List<Bet> getBetByRoulette(int id);
}
