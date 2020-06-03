package com.CleanCodeMasivian.model;

import org.springframework.data.annotation.Id;
/**
 *
 * @author Eduardo Ocampo
 */
public class Roulette {
    @Id
    private int id;
    private String state;    
    public Roulette (int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }   
}
