/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessthenumber.models.data.service;

/**
 *
 * @author Teresa
 */
public class InvalidGameIDException extends Exception {
    
    public InvalidGameIDException(String message) {
        super(message);
    }
    
    public InvalidGameIDException(String message, Throwable cause){
        super(message, cause);
    }
    
}
