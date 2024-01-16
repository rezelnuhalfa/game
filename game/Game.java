 /*
 * Click +nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;
import java.util.Scanner;
/**
 *
 * @author rezel
 */
public class Game {

    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in);

       
        Player hero = new Player();

       
        System.out.println("Enter player name: ");
        hero.name = scanner.nextLine();

        System.out.println("Enter player speed: ");
        hero.Speed = scanner.nextInt();

        System.out.println("Enter player health points: ");
        hero.healtPoint = scanner.nextInt();

        System.out.println("Enter player damage: ");
        hero.damage = scanner.nextInt();

        System.out.println("Enter player defense: ");
        hero.defend = scanner.nextInt();
        
        System.out.println("Enter ultimatepower: ");
        hero.ulti = scanner.nextInt();
         
        System.out.println("-----------------------------------------------");
        
        hero.run();
        hero.attack();
        hero.defend();
        hero.ultimate();
        
        if (hero.isDead())
            System.out.println(hero.name+" you lose:(");
       
            else 
            System.out.println(hero.name+" won the game");
        
            
         
     
    }
}
    

