/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.persistence;

import com.CleanCodeMasivian.model.*;
import com.sun.corba.se.spi.ior.ObjectId;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Eduardo Ocampo
 */
public class ApplicationDB {
    private static final String urlDb = "localhost";
    private Connection connection;
    private User user;
    private Roulette roulette; 
    private Bet bet;
    public void getConnection() {
        try {
            connection = DriverManager.getConnection(urlDb);
        } catch (SQLException e) {
        }
    }
    public int createNewRoulette(){
        Statement stmt;
        int id = -1;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            id = getRouletteId() + 1;
            String sql = "INSERT INTO roulette (id,state) VALUES ("+ Integer.toString(id) +", false);";
            stmt.executeUpdate(sql);
            stmt.close();
            connection.commit();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public void openRouletteById(int id){
        Statement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            String sql = "UPDATE roulette SET state = true WHERE id = " + Integer.toString(id)+";"; 
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            connection.commit();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Roulette> getAllRoulettes(){
        List<Roulette> allRoulettes = new ArrayList<>();
        Statement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM roulette;")) {
                connection.close();
                while (rs.next()) {
                    roulette = new Roulette(rs.getInt("id"));
                    roulette.setState(rs.getString("state"));
                    allRoulettes.add(roulette);
                }
                stmt.close();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allRoulettes;
    }
    public void createNewBet(Bet bet) {
        Statement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            String sql = "INSERT INTO bet (id,type,bet,value,user,roulette) VALUES ("
                    + bet.getId() +",'"+ bet.getType() +"','"
                    + bet.getBet()+ "',"+bet.getValue()+","
                    + bet.getUser().getId()+ ","
                    + bet.getRoulette().getId()+");";
            stmt.executeUpdate(sql);
            stmt.close();
            connection.commit();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Bet> getBetByRoulette(int id) {
        List<Bet> allBets = new ArrayList<>();
        Statement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM bet WHERE id ="+Integer.toString(id))) {
                connection.close();
                while (rs.next()) {
                    bet = new Bet(rs.getInt("id"),rs.getString("type"),rs.getString("bet"),rs.getInt("value"));
                    allBets.add(bet);
                }
                stmt.close();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allBets;
    }    
    private int getRouletteId(){
        Statement stmt;
        int ans = -1;
        try {
            Class.forName("org.postgresql.Driver");
            getConnection();
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT MAX(id) FROM roulette")) {
                connection.close();
                stmt.close();
                ans = rs.getInt("id");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ApplicationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ans;
    }
    
}
