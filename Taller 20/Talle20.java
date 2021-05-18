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
double multiplicarxy = 0;
double multiplicarx2y = 0;
        double cx, cy;
        double sumay = 0;
        double sumast = 0;
        double sumax = 0;
        double sumaxy = 0;
        double sumaxpory =0;
          double sumax2pory =0;
        
        double multiplicar = 1;
        double sumax2 = 0;
        double xx = 0;
        double promedioy = 0;
        double promediox = 0;
        double Sy=0;
        double  sumax3=0;
        double   sumax4=0;
        double Xy=0; 
        double x2y=0;
double sumasr=0;
       
double syx=0;
double xx2=0;
double xx3=0;
double xx4=0;
double Gauss=0;
double a0 = 0.1616071429;
double a1 = 0.04404761905;
double a2 = 0.05386904762;

        double x2ysuma=0;
        double St = 0;
        double Sr = 0;
double r = 0;
         double[] x = {1,3,5,7,9,11,13};
        double[] y = {0.3,0.7,1.8,3,5,7.2,9.8};


        System.out.println("X");
        for (int i = 0; i < x.length; i++) {

            sumax += x[i];
            promediox = sumax / x.length;

        }
        System.out.println("suma = " + sumax);
        System.out.println("Promedio  = " + promediox);

        System.out.println("--------------------------------");

        System.out.println("y");
        for (int i = 0; i < y.length; i++) {

            sumay += y[i];
            promedioy = sumay / y.length;

        }
        System.out.println("Sumatoria  = " + sumay);
        System.out.println("Promedio  = " + promedioy);

        System.out.println("---------------------------------------");

        

        System.out.println("----------------------------------------");

        System.out.println("X^2");
        for (int i = 0; i < x.length; i++) {
            xx = x[i] * x[i];

            sumax2 += xx;

        }
        System.out.println("Sumatoria " + sumax2);
        
         System.out.println("X^3");
        for (int i = 0; i < x.length; i++) {
            xx3 = Math.pow(x[i], 3);

            sumax3 += xx3;

        }
        System.out.println("X^3 = " + sumax3);
        
        
        System.out.println("X^4");
        for (int i = 0; i < x.length; i++) {
            xx4 = Math.pow(x[i], 4);

            sumax4 += xx4;

        }
        System.out.println("X^4 = " + sumax4);
        
        
         System.out.println("X*Y");
        for (int i = 0; i < y.length; i++) {

            sumaxy += x[i] * y[i];

        }

        System.out.println("Sumatoria = " + sumaxy);
        
         System.out.println("X^2*y");
        for (int i = 0; i < x.length; i++) {
            
            multiplicarx2y = (Math.pow(x[i], 2)*y[i]);

            sumax2pory += multiplicarx2y;

        }
        System.out.println("X^2*y = " + sumax2pory);
         
        
        

        System.out.println("St");
        for (int i = 0; i < x.length; i++) {

            St = Math.pow(y[i] - promedioy, 2);
            sumast += St;
        }
        System.out.println("St = " + St);
        System.out.println("Suma St = " + sumast);

        
      
        System.out.println("Sr");
        for (int i = 0; i < x.length; i++) {

            Sr = Math.pow(y[i]-a0-a1*x[i]-a2*Math.pow(x[i], 2)   , 2);
            sumasr += Sr;
        }
        System.out.println("Sr = " + Sr);
        System.out.println("Suma Sr = " + sumasr);

        System.out.println("--------------------------------------------------------------");
       
          Sy= Math.sqrt((sumast)/(x.length-1));
          System.out.println("Desviacion Estandar " + Sy);
          
          System.out.println("--------------------------------------------------------------");
          
          syx=Math.sqrt((sumasr)/(x.length-2));
          System.out.println("Érror Estandar = " + syx);
          
           System.out.println("--------------------------------------------------------------");
          
           r=Math.sqrt((St-Sr)/(St))*100;
           System.out.println("Coeficiente de Correlacion es : " +r + "%");
        System.out.println(" Y = " + a0 + " + " + a1 + "x" + a2+"x^2");

        System.out.println("--------------------------------------------------------------");
        
    }
}
