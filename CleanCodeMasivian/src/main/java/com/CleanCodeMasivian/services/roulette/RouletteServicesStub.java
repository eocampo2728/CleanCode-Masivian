/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.services.roulette;

import com.CleanCodeMasivian.model.Roulette;
import com.CleanCodeMasivian.persistence.RoulettePersistence;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Eduardo Ocampo
 */
@Service
public class RouletteServicesStub implements RouletteServices{
    @Autowired
    RoulettePersistence rPersistence;
    @Override
    public int createNewRoulette(){
        return rPersistence.createNewRoulette();
    } 
    @Override
    public boolean openRouletteById(int id){
        return rPersistence.openRouletteById(id);
    }
    
    @Override
    public List<Roulette> getAllRoulettes(){
        return rPersistence.getAllRoulettes();
    }
}
