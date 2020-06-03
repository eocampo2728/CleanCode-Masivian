package com.CleanCodeMasivian.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Eduardo Ocampo
 */
public class User {
    @Id
    int id;
    public User(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
