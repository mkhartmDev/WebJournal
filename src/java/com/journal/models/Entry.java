/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author Matt
 */
public class Entry {
    
     private String User;
    private Timestamp ts;
    private String entry;
    private String title;
    private int Entryid;
    

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

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public String getDateFormatted() {
        Timestamp ts1 = this.getTs();
        Date date = new Date(ts1.getTime());
        String p = "MM/dd/YYYY";
        SimpleDateFormat sd = new SimpleDateFormat(p);
        String sdate = sd.format(date);
        
        
        return sdate;
    }

    /**
     * @return the Entryid
     */
    public int getEntryid() {
        return Entryid;
    }

    /**
     * @param Entryid the Entryid to set
     */
    public void setEntryid(int Entryid) {
        this.Entryid = Entryid;
    }
    
    
}
