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
        double a,sumast1=0;
        double multiplicarxx = 0;
        double multiplicarx2xy=0;
double multiplicarxy = 0;
double multiplicarx2y = 0;
        double cx, cy,sumaxx=0;
        double sumay = 0;
        double sumast = 0;
        double sumax = 0;
        double sumaxy = 0;
        double sumaxpory =0;
          double sumax2pory =0;
        double suma2x=0;
        double promedio2x=0;
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
double a0 = 3.388194118;
double a1 = -2.494130392;
double a2 = 1.788260784;

        double x2ysuma=0;
        double St = 0;
        double Sr = 0;
double r = 0;
         double[] x1 = {0,0,1,2,0,1,2,2};
         double[] x2 = {0,1,1,2,2,3,3,1};
         
        double[] y = {3.2,6,2.2,2.4,6.4,6.6,3.4,0.2};


    
        for (int i = 0; i < x1.length; i++) {

            sumax += x1[i];
            promediox = sumax / x1.length;

        }
     
        
      
        for (int i = 0; i < x2.length; i++) {

            suma2x += x2[i];
            promedio2x = suma2x / x2.length;

        }
       
       
      
        for (int i = 0; i < y.length; i++) {

            sumay += y[i];
            promedioy = sumay / y.length;

        }
     

      
        for (int i = 0; i < x1.length; i++) {
            xx = x1[i] * x1[i];

            sumax2 += xx;

        }
       
        for (int i = 0; i < x1.length; i++) {
            multiplicarxx=x1[i]*x2[i];

            sumaxx += multiplicarxx;

        }
        
        
        
      
        for (int i = 0; i < x2.length; i++) {
            xx4 = Math.pow(x2[i], 2);

            sumax4 += xx4;

        }
       
     
        for (int i = 0; i < y.length; i++) {

            sumaxy += x1[i] * y[i];

        }

     
        for (int i = 0; i < x1.length; i++) {
            
         multiplicarx2xy=x2[i]*y[i];

            sumax2pory += multiplicarx2xy;

        }
      
        
        

 
        for (int i = 0; i < x1.length; i++) {

            St = Math.pow(y[i] - promedioy, 2);
            sumast += St;
        }
       
        
      
   
        for (int i = 0; i < x1.length; i++) {

            Sr = Math.pow(y[i]-a0-a1*x1[i]-a2*x2[i]   , 2);
            sumasr += Sr;
        }
        

        System.out.println("--------------------------------------------------------------");
       
          Sy= Math.sqrt((sumast)/(x1.length-1));
          System.out.println("Desviacion Estandar " + Sy);
          
          System.out.println("--------------------------------------------------------------");
          sumast1= x1.length - (2+1);
          syx=Math.sqrt((sumasr)/(sumast1));
          System.out.println("Érror Estandar = " + syx);
          
           System.out.println("--------------------------------------------------------------");
          
           r=Math.sqrt((St-Sr)/(St))*100;
           System.out.println("Coeficiente de Correlacion es : " +r + "%");
        System.out.println(" Y = " + a0 + " + " + a1 + "x1" + a2+"x2");

        System.out.println("--------------------------------------------------------------");
        
    }
}
