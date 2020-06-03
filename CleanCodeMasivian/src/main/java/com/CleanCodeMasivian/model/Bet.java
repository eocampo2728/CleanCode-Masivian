package com.CleanCodeMasivian.model;

import org.springframework.data.annotation.Id;
/**
 *
 * @author Eduardo Ocampo
 */
public class Bet {
    @Id
    int id;
    String type;
    String bet;
    int value;
    User user;
    Roulette roulette;
    String result;
    public Bet(int id, String type, String bet, int value, User user, Roulette roulette){
        this.id = id;
        this.type = type;
        this.bet = bet;
        this.value = value;
        this.user = user;
        this.roulette = roulette;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getBet(){
        return bet;
    }
    public void setBet(String bet){
        this.bet = bet;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public Roulette getRoulette(){
        return roulette;
    }
    public void setRoulette(Roulette roulette){
        this.roulette = roulette;
    }
    public String getResult(){
        return result;
    }
    public void setResult(String result){
        this.result = result;
    }
}
