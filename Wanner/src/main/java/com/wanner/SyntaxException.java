/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanner;

/**
 * SyntaxException is used to identify lexical parsing problems. When ever there
 * is a problem identifying a token, this exception is raised.
 *
 * @author Wanner HernandezR
 */
public class SyntaxException extends Exception {

    public SyntaxException(String message) {
        super(message);
    }

}
