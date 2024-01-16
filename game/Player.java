/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author rezel
 */
public class Player {
  //definisi atribut
    String name;
    int Speed,healtPoint,damage,defend,ulti;
    
//method
 void run(){   
     System.out.println(name+" IS RUNNING....");   
     System.out.println(" Speed "+Speed);
    
 }

 
boolean isDead(){
    if(healtPoint <=1)return true;
        return false;
       
}
        void attack(){
    System.out.println(name+" Attacking....");
    System.out.println(" Damage "+damage);

}
      void defend(){
          System.out.println(name+" ARMOR....");
          System.out.println(" defending armor "+defend);
          
      
      }
      void ultimate(){
          System.out.println(name+"Ultimate power....");
          System.out.println("Damage ultimate" +ulti);
      }
      

}


