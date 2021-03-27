/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class punto2 {
    
   
    
    public static void main (String[] args){
     Scanner sc  = new Scanner (System.in);
  Random rand = new Random();
        int n=0,m=0;
        
        System.out.println("Dijite el numero de filas");
        n=sc.nextInt();
        System.out.println("Dijite el numero de columnas");
        m=sc.nextInt();
        int matriz1 [][] = new int [n][m];
         int matriz2 [][] = new int [n][m];
        
        
        System.out.println("Matriz A");
        
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1[i].length; j++) {
                    matriz1[i][j] = rand.nextInt(9);
               
                System.out.print(" | " +matriz1[i][j] + " | ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz B");
        
        for (int i = 0; i < matriz2.length; i++) {
            
            for (int j = 0; j < matriz2[i].length; j++) {
                    matriz2[i][j] = rand.nextInt(9);
               
                System.out.print(" | " +matriz2[i][j]+ " | ");
            }
            System.out.println();
    }
        
        System.out.println("3A");
         int resultado1[][] = new int [matriz1.length][matriz1.length];
        for (int i = 0; i < resultado1.length; i++) {
            for (int j = 0; j < resultado1[i].length; j++) {
                resultado1[i][j]= 3*matriz1[i][j];
                
                 System.out.print(" | " +resultado1[i][j]+ " | ");
            }
            System.out.println("");
        }
        
        
        System.out.println("4B");
         int resultado2[][] = new int [matriz2.length][matriz2.length];
         for (int i = 0; i < resultado2.length; i++) {
            for (int j = 0; j < resultado2[i].length; j++) {
                resultado2[i][j]= 4*matriz2[i][j];
                
                 System.out.print(" | " +resultado2[i][j]+ " | ");
            }
            System.out.println("");
        
    
    }
         
         System.out.println("A+B");
         int suma [][] = new int [matriz1.length][matriz1.length];
         for (int i = 0; i < matriz1.length; i++) {
             for (int j = 0; j < matriz2[i].length; j++) {
                 suma [i][j] = matriz1[i][j]+matriz2[i][j];
                 
                 System.out.print(" | " + suma[i][j]+ " | ");
             }
             System.out.println("");
            
        }
         
         
         System.out.println("B x A");
         int[][] mul = new int[n][m];
         for (int i = 0; i < matriz1.length; i++) {
             for (int j = 0; j < matriz2.length; j++) {
                 mul [i][j] = matriz1[i][j]* matriz2[i][j];
                 
                 System.out.print(" | " + mul[i][j]+ " | ");
                 
             }
            
             System.out.println("");
        }
         
}
}

