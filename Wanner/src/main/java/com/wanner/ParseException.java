/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanner;

/**
 * ParseException is used to identify problems in recursive descent parsing. The
 * recursive descent parser can find defects in the code it's parsing these are
 * reported via this exception.
 *
 * @author Wanner HernandezR
 */
public class ParseException extends Exception {

    public ParseException(String message) {
        super(message);
    }

    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }

}
