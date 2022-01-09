/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prject;

/**
 *
 * @author PC
 */
import java.io.*;
import javax.swing.*;
import java.util.*;
public class Floor {
    private int FloorNumber ;
    private int NumberOfRoom ;
   private Room [] list;

   public Floor()
   {
       FloorNumber=0;
       NumberOfRoom=0;   
   }
    public Floor(int FloorNumber, int NumberOfRoom, Room[] list) {
        this.FloorNumber = FloorNumber;
        this.NumberOfRoom = NumberOfRoom;
        
        this.list=list;
    }
   

    
  
    public void available_rooms()
    {
        System.out.println("The available room is ");
       for(int i=0;i<list.length;i++)
       {
           if(list[i].IsReserved)
               System.out.printf("%4d",list[i].RoomNumber);
       }
    }
    
    public double profits_in_floor()
    {
        double sum =0;
      for(int i=0;i<list.length;i++)
       {
           if (list[i] instanceof StanderdRoom) 
                sum+= ((StanderdRoom)list[i]).price;
           else if(list[i] instanceof SweetRoom)
               sum+=((SweetRoom)list[i]).price;
           else if(list[i] instanceof ConferenceRoom)
               sum+=((ConferenceRoom)list[i]).price;
         
       }
        return sum;
    }
  
    public void print()
    {
        System.out.println(FloorNumber+" "+NumberOfRoom);
        for(int i=0;i<NumberOfRoom;i++)System.out.println(list[i]);
        System.out.println("-------------------------");
    }
            
            
}
