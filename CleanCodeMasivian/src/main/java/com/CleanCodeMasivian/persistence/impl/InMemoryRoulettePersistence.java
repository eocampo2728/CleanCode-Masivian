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
/**
 *
 * @author Eduardo Ocampo
 */
public class InMemoryRoulettePersistence implements RoulettePersistence{
    ApplicationDB appDB;
    @Override
    public int createNewRoulette(){
        return 0;
    }
    @Override
    public boolean openRouletteById(int id){
        return false;
    }
    @Override
    public List<Roulette> getAllRoulettes(){
        return null;
    }
    
}
