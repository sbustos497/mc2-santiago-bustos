/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int cx ,cy ;
           int sumay =0;
         int sumax =0;
        int sumaxy=0;
        int multiplicar =1;
        int sumax2=0;
        int xx=0;
         int promedioy=0;
         int promediox=0;
        
        int a1 =0;
        int a0=0;
         
         System.out.println("escriba las cantidad de x");
         cx=sc.nextInt();
         System.out.println("Escriba la cantidad de Y");
         cy=sc.nextInt();
         
         int []x = new int [cx];
          int []y = new int [cy];
         
         for (int i = 0; i < cx; i++) {
             System.out.println("Escriba la cantidad de x"+i);
             x[i]=sc.nextInt();
             sumax+=x[i];
             promediox=sumax/x.length;
             System.out.println("suma actual = " +sumax);
             System.out.println("Promedio actual = " +promediox);
             
        }
         System.out.println("");
         for (int i = 0; i < cy; i++) {
            System.out.println("Escriba la cantidad de y"+i);
             y[i]=sc.nextInt();
             sumay+=y[i];
             promedioy=sumay/y.length;
             System.out.println("suma actual = " + sumay);
             System.out.println("Promedio actual = " + promedioy);
        }
         
         System.out.println("X*Y");
        for (int i = 0; i < cx; i++) {
            multiplicar =  x[i]*y[i];
           System.out.println(multiplicar);
           sumaxy = sumaxy +  x[i]*y[i];
           
        }
        System.out.println("Suma total X*Y = " + sumaxy);
        
        
        System.out.println("___________________________");
        
        System.out.println("X^2");
        for (int i = 0; i < cx; i++) {
           xx= (int) Math.pow(x[i], 2);
            
            System.out.println(xx);
      
            sumax2=(int) (sumax2+ Math.pow(x[i], 2));
            
        }
        System.out.println("SUMA total X^2 = " + sumax2);
        
          
            
            a1=(int) ((cx*sumaxy-sumax*sumay)/((cx*sumaxy)- Math.pow(sumax, 2)));
            
            a0= promedioy-a1*promediox;
        
        System.out.println("La respuesta es Y = " + a0 + " + " +a1+"x");

         
    }
    }
    

