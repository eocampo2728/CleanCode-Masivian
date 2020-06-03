/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.services.roulette;

import com.CleanCodeMasivian.model.Roulette;
import java.util.List;
/**
 *
 * @author Eduardo Ocampo
 */
public interface RouletteServices {
    public int createNewRoulette();
    public boolean openRouletteById(int id);
    public List<Roulette> getAllRoulettes();
}
