/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg7;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        double x, p, e = 100, v = 0,aux;
        int exp = 0, Iter = 0;
          p = 0.5;
        System.out.println("ingrese el X");
        x = sc.nextDouble();
        
        do{
        aux = v;
        if (Iter % 2 == 0) {
        	v += Math.pow(x, exp) / fact(exp);
        }else {
        	v -= Math.pow(x, exp) / fact(exp);
        }
        
        e = Math.abs((v- aux) / v) * 100;
        
        Iter = Iter + 1;
        
        exp += 1;
        
        }while(e >= p);

      
        System.out.println("El valor del e ^ (" + x + ") es = " + v);
        System.out.println("Error relativo porcentual: " + e + "%");
        System.out.println("Numero de Iteraciones: " + Iter);
	}
	 public static double fact(int n){
	        double aux1 = 1;
	        for (int i = 2; i <= n; i++) {
	        aux1 *= i;
	        }
	        return aux1;
    }
    
}
