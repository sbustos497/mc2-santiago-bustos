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
          double a;
         
         double cx ,cy ;
           double sumay=0;
           double logn;
         double sumax =0;
        double sumaxy=0;
        double multiplicar =1;
        double sumax2=0;
        double xx=0;
         double promedioy=0;
         double promediox=0;
         double xlny;
        
        double a1 =0;
        double  a0=0;
         
         
         
         double []x = {1.2,2.4,3.6,4.8,6,7};
          double []y = {0.8,1,1.5,2,2.9,3.6};
         
          System.out.println("X");
         for (int i = 0; i <x.length; i++) {
           
             sumax+=x[i];
             promediox=sumax/x.length;
            
             
        }
          System.out.println("suma = " +sumax);
             System.out.println("Promedio  = " +promediox);
      
             System.out.println("--------------------------------");
                     
         
         System.out.println("LN(y)");
         for (int i = 0; i <y.length; i++) {
            
             logn=Math.log(y[i]);
             sumay+=logn;
             promedioy=sumay/y.length;
             System.out.println(  " Y"+ i + "= " + logn);
             
             
        }
         System.out.println("Sumatoria  = "+sumay );
         System.out.println("Promedio  = " +promedioy );
       
         System.out.println("---------------------------------------");
         
         System.out.println("X*LN(Y)");
        for (int i = 0; i <y.length; i++) {
            logn=Math.log(y[i]);
            multiplicar =  x[i]*logn;
          System.out.println(  " Y"+ i + "= " + multiplicar);
            sumaxy+=  x[i]*logn;
           
        }
        System.out.println("Sumatoria = " + sumaxy );
       
        
        
        System.out.println("----------------------------------------");
        
        System.out.println("X^2");
        for (int i = 0; i <x.length; i++) {
           xx= x[i]*x[i];
            
            System.out.println(xx);
      
            sumax2+=xx;
            
        }
        System.out.println("Sumatoria "+ sumax2);
        
          
            System.out.println("--------------------------------------------------------------");
           a1=(6*sumaxy-sumax*sumay)/(6*sumax2-Math.pow(sumax, 2));
            
            a0= promedioy-a1*promediox;
        
        System.out.println( " Y = " + a0 + " + " +a1+"x");

        System.out.println("--------------------------------------------------------------");
        a= Math.pow(Math.E, a0);
        System.out.println("Respuesta " + a+"e^" + a1+"x" );
        System.out.println("--------------------------------------------------------------");
    }
    }
    

