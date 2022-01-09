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
public class Java_prject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args )throws FileNotFoundException {
        
        // TODO code application logic here
     File f = new File("E:\\file.txt");
        Scanner input = new Scanner(f);
      
        int j=1, o=0, x=0,indxf=0;
 
        String [] h= new String [100];
        while(input.hasNext())
        {
          String s=input.nextLine();
          h[o++]=s;
        }
         
           
                String [] first = h[0].split(":");
                Floor[] floors=new Floor[Integer.parseInt(first[1].trim())];
                for(int i=0;i<floors.length;i++)floors[i]=new Floor();
              
                
            
       while(o>j)
        {
                 String [] ss = h[j].split("[#:,]");
               
               
               ss[4]=ss[4].trim();
               x =Integer.parseInt(ss[4].trim());
                 Room[] r=new Room[x] ;
                                 

                for(int i=j+1,indx=0; i<=j+x;i++,indx++)
                {
                        String [] s = h[i].split("[,.]");               
                    if(s[0].equals("Standard") )
                    {
                        int R=Integer.parseInt(s[1].trim()), nob=Integer.parseInt(s[2].trim());
                        double  p=Double.parseDouble(s[3].trim());
                        r[indx]=new StanderdRoom(R,p,nob);
                                           

                    }
                 else if(s[0].equals("Sweet"))
                    {
                        int R=Integer.parseInt(s[1].trim());
                        double  p=Double.parseDouble(s[2].trim());
                        r[indx]=new SweetRoom(R,p);
                    }
                  else if(s[0].equals("Conference"))
                    {
                         int R=Integer.parseInt(s[1].trim()),nos=Integer.parseInt(s[2].trim());
                        double  p=Double.parseDouble(s[3].trim());
            
                        r[indx]=new ConferenceRoom(R,p,nos);      
                    }
                }
                 
                for(int i=0;i<r.length;i++)
                    System.out.println(r[i]);
                System.out.println("----------------------");
               // floors[indxf++]=new Floor(Integer.parseInt(ss[1].trim()),x,r);
                  j+=x+1;
 
        }
       
       
      // for(int i=0;i<floors.length;i++)floors[i].print();
       
       
       
       
       
       
    } 
}
