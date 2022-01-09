/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prject;

import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author PC
 */
public class StanderdRoom extends Room{
    
    private int NumberOfbeds;

    public StanderdRoom() {
        this(0,0,0);
    }

    
    public StanderdRoom(int NOB) {
     NOB=NumberOfbeds;       
    }

    public StanderdRoom(int R,double p,int NOB) {
        super(R,p);
        NOB=NumberOfbeds;
    }
    
    
    
   public void make_reservation()
    {
       DayOFReservation=Integer.parseInt( JOptionPane.showInputDialog("Enter number of days of reservation"));
        IsReserved=true;
    }
   
   public void check_is_reserved()
   {
       if(IsReserved)
       JOptionPane.showMessageDialog(null, "The room is reserved");
       else
           JOptionPane.showMessageDialog(null, "The room is not reserved");
   }
   public void check_out()
    {
        JOptionPane.showMessageDialog(null, "the price is: "+ NumberOfbeds*price*DayOFReservation);
    }
    
   public double total_price()
   {
       return NumberOfbeds*price*DayOFReservation;
   }
   public String toString()
   {
       return "room number: "+RoomNumber+"\r\n"
               +"day of reservation: "+DayOFReservation+"\r\n"
               +"number of beds: "+NumberOfbeds+"\r\n"
               +"bed price: "+price+"\r\n"
               +"is reserved "+IsReserved+"\r\n";
   }
}
