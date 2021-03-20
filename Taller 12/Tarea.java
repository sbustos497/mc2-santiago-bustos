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
    
    
         public static void main(String args[]) {

        Tarea t = new Tarea ();
             System.out.println(t.exponencial( 0.755,15));  

    }

    
    }
