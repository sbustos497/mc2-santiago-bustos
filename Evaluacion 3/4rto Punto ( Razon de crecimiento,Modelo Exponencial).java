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
         Scanner sc = new Scanner(System.in);
         
         double[] x = {1,2,3,4,5,6,7,8};
        double []y = {2.1,3.3,3.8,3.9,4.2,4.4,4.5,4.7};
        double sumax1=0,sumay1=0,promediox1=0,promedioy1=0,multi1=1,sumaxy1=0,xx1,sumax21=0,a11,a01;
        double sumax2=0,sumay2=0,promediox2=0,promedioy2=0,multi2=1,sumaxy2=0,xx2,sumax22=0,a12,a02,logn2,a2;
        double sumax3=0,sumay3=0,promediox3=0,promedioy3=0,multi3=1,sumaxy3=0,xx3,sumax23=0,a13,a03,logx3,logy3,logxx3,alfa3,beta3;
        double sumax4=0,sumay4=0,promediox4=0,promedioy4=0,multi4=1,sumaxy4=0,xx4,sumax24=0,a14,a04,alfa4,beta4,x4,y4;
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("------------------------------------------------------------------");
      
         System.out.println("MODELO EXPONENCIAL");

           
                    for (int i = 0; i < x.length; i++) {

                        sumax2 += x[i];
                        promediox2 = sumax2 / x.length;

                    }
                    
                   

                 
                    for (int i = 0; i < y.length; i++) {

                        logn2 = Math.log(y[i]);
                        sumay2 += logn2;
                        promedioy2 = sumay2 / y.length;
                       

                    }
                   

                   

                    for (int i = 0; i < y.length; i++) {
                        logn2 = Math.log(y[i]);
                        multi2 = x[i] * logn2;
                    
                        sumaxy2 += multi2;

                    }
                

               

                 
                    for (int i = 0; i < x.length; i++) {
                        xx2 = Math.pow(x[i],2);
                        sumax22 += xx2;

                    }
                 

                 
                    a12 = (x.length* sumaxy2 - sumax2 * sumay2) / (x.length * sumax22 - Math.pow(sumax2, 2));

                    a02 = promedioy2 - a12 * promediox2;

                  

                
                    a2 = Math.pow(Math.E, a02);
                    System.out.println("Respuesta = " + a2 + "e^" + a12 + "x");
                      System.out.println("------------------------------------------------------------------");
                      
                      
                      
                      
                      
                       
                      
                    System.out.println("------------------------------------------------------------------");
                    
                    
                     System.out.println("RAZON DE CRECIMIENTO");
                     
                      
                    for (int i = 0; i < x.length; i++) {
                         x4=1/x[i];
                        sumax4 += x4;
                        promediox4 = sumax4 / x.length;

                    }
                    
                    
                    for (int i = 0; i < y.length; i++) {
                         y4=1/y[i];
                        sumay4 += y4;
                        promedioy4 = sumay4 / y.length;

                    }
                   
                    
                   
                     for (int i = 0; i < x.length; i++) {
                         y4=1/y[i];
                         x4=1/x[i];
                         multi4=x4*y4;
                        sumaxy4 += multi4;
                     

                    }
                   
                     
                     
                      for (int i = 0; i < x.length; i++) {
                         x4=1/x[i];
                         xx4=Math.pow(x4, 2);
                        sumax24 += xx4;
                        

                    }
                     
                      
                      a14=(x.length*sumaxy4-sumax4*sumay4)/(x.length*sumax24-Math.pow(sumax4, 2));
                      a04 = promedioy4-a14*promediox4;
                      
                      alfa4=1/a04;
                      beta4=a14/a04;
                      System.out.println("RESPUESTA = " + alfa4 + "*" + "(x/"+beta4+"+x)");
                       System.out.println("------------------------------------------------------------------");
    }
    
}
