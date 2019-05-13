/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.tags;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Matt
 */
public class datetag extends TagSupport {
    
    //custom tag
   
    @Override
    public int doStartTag() throws JspException {
        Date date = new Date();
        String p = "MM/dd/YYYY";
        SimpleDateFormat sd = new SimpleDateFormat(p);
        String sdate = sd.format(date);
       
        try {
            JspWriter out = pageContext.getOut();
            out.print(sdate);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
    
   
    
}
