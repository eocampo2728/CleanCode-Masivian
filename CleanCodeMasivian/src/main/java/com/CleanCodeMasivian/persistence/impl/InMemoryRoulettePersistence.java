/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.persistence.impl;

import com.CleanCodeMasivian.model.Roulette;
import com.CleanCodeMasivian.persistence.ApplicationDB;
import com.CleanCodeMasivian.persistence.RoulettePersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
/**
 *
 * @author Eduardo Ocampo
 */
@Service
public class InMemoryRoulettePersistence implements RoulettePersistence{
    ApplicationDB appDB;
    private void newDB() {
        appDB = new ApplicationDB();
    }
    @Override
    public int createNewRoulette(){
        newDB();
        int rouletteID = -1;
        try {
            rouletteID = appDB.createNewRoulette();
        } catch (Exception ex) {
            Logger.getLogger(InMemoryRoulettePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rouletteID;
    }
    @Override
    public boolean openRouletteById(int id){
        newDB();
        try {
            appDB.openRouletteById(id);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(InMemoryRoulettePersistence.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    @Override
    public List<Roulette> getAllRoulettes(){
        newDB();
        return appDB.getAllRoulettes();
    }    
}
