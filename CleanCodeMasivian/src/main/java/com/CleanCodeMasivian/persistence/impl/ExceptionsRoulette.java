/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CleanCodeMasivian.persistence.impl;

/**
 *
 * @author Eduardo Ocampo
 */
public class ExceptionsRoulette extends Exception {

    /**
     * Creates a new instance of <code>ExceptionsRoulette</code> without detail
     * message.
     */
    public ExceptionsRoulette() {
    }

    /**
     * Constructs an instance of <code>ExceptionsRoulette</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionsRoulette(String msg) {
        super(msg);
    }
}
