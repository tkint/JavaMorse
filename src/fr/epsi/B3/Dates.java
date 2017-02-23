/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.B3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tkint
 */
public class Dates {
    
    public Calendar calendar;
    
    public static void main(String[] args) throws ParseException {
        Dates d = new Dates();
        d.calendar = Calendar.getInstance();
        
        Date today = d.calendar.getTime();
        System.out.println(d.format(today));
        
        Date weekLater = d.addSemaine(d.format(today));
        System.out.println(d.format(weekLater));
    }
    
    /**
     * Formate une date sous forme dd/MM/yyyy
     * @param date
     * @return 
     */
    public String format(Date date) {
        // Instanciation du formater
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        // On formate la date passée en paramètre selon le format défini
        return formater.format(date);
    }
    
    /**
     * Ajoute une semaine à la date passée en paramètre sous forme dd/MM/yyyy
     * @param str
     * @return
     * @throws ParseException 
     */
    public Date addSemaine(String str) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Date d = formater.parse(str);
        this.calendar.setTime(d);
        
        this.calendar.add(Calendar.DAY_OF_MONTH, 7);
        return this.calendar.getTime();
    }
}
