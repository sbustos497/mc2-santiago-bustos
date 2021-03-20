/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Tarea {

    public double potencia ( double base, int exponente){
        double rta = 1;
        for ( int i = 0; i< exponente; i ++){
            
            rta = rta * base;
        }
        return rta;
    }
    
    public int factorial (int numero){
        int fact = 1;
        while(numero != 0)
        {
            fact = fact * numero;
            numero = numero - 1;
        }
        return fact;
    }
    
    public double exponencial (double x, int n)
    {
        double exp = 0;
        double suma = 0;
        for(int i = 0; i<n; i++)
        {
            exp = potencia(x,i)/factorial(i);
            suma = suma + exp;
            
            
        }
        return suma;
    }
    public float error(double valt, double x) {
    	float error = 100;
    	error = (float)(Math.abs((valt-x)/x))*100;
		return error;
    
    }
         public static void main(String args[]) {

        Tarea t = new Tarea ();
              Error e = new Error();
        	 System.out.println("Orden 0: " + t.exponencial(0.755,0));
        	 System.out.println("ERROR: " + ((t.error(1, 0)) - 100));
        	
        	 
        	 System.out.println("Orden 1: " + t.exponencial(0.755,1));
        	 System.out.println("ERROR: " + t.error(0.36787, 1));
        	
        	 
        	 System.out.println("Orden 2: " + t.exponencial(0.755,2));
        	 System.out.println("ERROR: " + t.error(0.13533, 2));
        	
        	 
        	 System.out.println("Orden 3: " + t.exponencial(0.755,3));
        	 System.out.println("ERROR: " + t.error(0.04978, 3));
        	
        	 
        	 System.out.println("Orden 4: " + t.exponencial(0.755,4));
        	 System.out.println("ERROR: " + t.error(0.01831, 4));
        	
        	 
        	 System.out.println("Orden 5: " + t.exponencial(0.755,5));
        	 System.out.println("ERROR: " + t.error(0.00673, 5));
        	 
        	 
        	 System.out.println("Orden 6: " + t.exponencial(0.755,6));
        	 System.out.println("ERROR: " + t.error(0.00247, 6));
        	
        	 
        	 System.out.println("Orden 7: " + t.exponencial(0.755,7));
        	 System.out.println("ERROR: " + t.error(0.00091, 7));
        	
        	 
        	 System.out.println("Orden 8: " + t.exponencial(0.755,8));
        	 System.out.println("ERROR: " + t.error(0.00033, 8));
        	
        	 
             System.out.println("Orden 9: " + t.exponencial(0.755,9));  
        	 System.out.println("ERROR: " + t.error(0.00012, 9));
        	
        	 
             System.out.println("Orden 10: " + t.exponencial(0.755,10)); 
        	 System.out.println("ERROR: " + t.error(0.00004, 10));
        	
             System.out.println("Orden 11: " + t.exponencial(0.755,11)); 
        	 System.out.println("ERROR: " + t.error(0.00001, 11));
        	 System.out.println(" ");
        	 
             System.out.println("Orden 12: " + t.exponencial(0.755,12)); 
        	 System.out.println("ERROR: " + t.error(0.00000614421, 12));
        	
        	 
             System.out.println("Orden 13: " + t.exponencial(0.755,13));
        	 System.out.println("ERROR: " + t.error(0.00000226033, 13));
        	
                 
                  System.out.println("Orden 14: " + t.exponencial(0.755,14)); 
        	 System.out.println("ERROR: " + t.error(0.0000008315289999999998, 14));
        	
        	 
             System.out.println("Orden 15: " + t.exponencial(0.755,15)); 
        	 System.out.println("ERROR: " + t.error(0.00000030590199999999996, 15));
        	
        	 

    }

    
    }
