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
public class ConferenceRoom extends Room{
    private int NumberOfSeats;

    public ConferenceRoom() {
        this(0,0,0);
    }

    public ConferenceRoom(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }
   public ConferenceRoom(int R,double p,int n)
    {
       super(R,p);
       this.NumberOfSeats=n;
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
        JOptionPane.showMessageDialog(null, "the price is: "+  price*DayOFReservation*NumberOfSeats);
    }
    
   public double total_price()
   {
       return price*DayOFReservation*NumberOfSeats;
   }
   public String toString()
   {
       return "room number: "+RoomNumber+"\r\n"
               +"day of reservation: "+DayOFReservation+"\r\n"
               +"number of seats: "+NumberOfSeats+"|\r\n"
               +"price per night: "+price+"\r\n"
               +"is reserved "+IsReserved+"\r\n";
   }
            
    
}
