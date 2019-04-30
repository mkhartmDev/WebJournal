/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journals;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Matt
 */
public class Entry {
    
     private String User;
    private Timestamp ts;
    private String entry;

    /**
     * @return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * @return the ts
     */
    public Timestamp getTs() {
        return ts;
    }

    /**
     * @param ts the ts to set
     */
    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    /**
     * @return the entry
     */
    public String getEntry() {
        return entry;
    }

    /**
     * @param entry the entry to set
     */
    public void setEntry(String entry) {
        this.entry = entry;
    }
    
    
}
