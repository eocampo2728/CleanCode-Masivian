/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.persistence;

import com.CleanCodeMasivian.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Eduardo Ocampo
 */
public class ApplicationDB {
    private static final String urlDb = "localhost";
    private Connection connection;
    private User user;
    private Roulette roulette;    
    public void getConnection() {
        try {
            connection = DriverManager.getConnection(urlDb);
        } catch (SQLException e) {
        }
    }
    
}
