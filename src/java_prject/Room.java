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
public class Room {
    
    protected int RoomNumber;
    protected int DayOFReservation;
    protected boolean IsReserved;
    protected double price;
   
   public Room()
    {
        this(0,0);
    }
   public  Room(int R,double p)
    {
        R=RoomNumber;
        p=price;
    }
    
   public void cancel_reseervation()
   {
       IsReserved=false;
       JOptionPane.showMessageDialog(null, "Done");
   }
    
}
