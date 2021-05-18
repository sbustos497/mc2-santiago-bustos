/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talle18;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Talle18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a;

        double cx, cy;
        double sumay = 0;
        double sumast = 0;
        double sumax = 0;
        double sumaxy = 0;
        double multiplicar = 1;
        double sumax2 = 0;
        double xx = 0;
        double promedioy = 0;
        double promediox = 0;
        double Sy=0;
double sumasr=0;
        double a1 = 0;
        double a0 = 0;
double syx=0;
        double St = 0;
        double Sr = 0;
double r = 0;
        double[] x = {1,3,5,7,9,11,13};
        double[] y = {0.3,0.7,1.7,3.5,5.5,25.7,38.5};

        
        for (int i = 0; i < x.length; i++) {

            sumax += x[i];
            promediox = sumax / x.length;

        }
       

       
        for (int i = 0; i < y.length; i++) {

            sumay += y[i];
            promedioy = sumay / y.length;

        }
       
       

     
        for (int i = 0; i < y.length; i++) {

            sumaxy += x[i] * y[i];

        }

     


     
        for (int i = 0; i < x.length; i++) {
            xx = x[i] * x[i];

            sumax2 += xx;

        }
       

      
        for (int i = 0; i < x.length; i++) {

            St = Math.pow(y[i] - promedioy, 2);
            sumast += St;
        }
       
        
         a1 = (x.length * sumaxy - sumax * sumay) / (x.length * sumax2 - Math.pow(sumax, 2));

        a0 = promedioy - a1 * promediox;
       
        for (int i = 0; i < x.length; i++) {

            Sr = Math.pow(y[i]-a0-a1*x[i], 2);
            sumasr += Sr;
        }
        
        System.out.println("--------------------------------------------------------------");
       
          Sy= Math.sqrt((sumast)/(x.length-1));
          System.out.println("Desviacion Estandar = " + Sy);
          
          System.out.println("--------------------------------------------------------------");
          
          syx=Math.sqrt((sumasr)/(x.length-2));
          System.out.println("Érror Estandar = " + syx);
          
           System.out.println("--------------------------------------------------------------");
          
           r=Math.sqrt((St-Sr)/(St))*100;
           System.out.println("Coeficiente de Correlacion es = " +r + "%");
           
           System.out.println("--------------------------------------------------------------");
        System.out.println(" Y = " + a0 + " + " + a1 + "x");

        System.out.println("--------------------------------------------------------------");
        a = Math.pow(Math.E, a0);

        
    }
}
