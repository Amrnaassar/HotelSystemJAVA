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
public class SweetRoom extends Room{

    public SweetRoom() {
        this(0,0);
    }
    public SweetRoom(int R,double p)
    {
       super(R,p);
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
        JOptionPane.showMessageDialog(null, "the price is: "+ price*DayOFReservation);
    }
   public double total_price()
   {
       return price*DayOFReservation;
   }
   public String toString()
   {
       return "room number: "+RoomNumber+"\r\n"
               +"day of reservation: "+DayOFReservation+"\r\n"
               +"price per night: "+price+"\r\n"
               +"is reserved "+IsReserved+"\r\n";
   }
    
}
