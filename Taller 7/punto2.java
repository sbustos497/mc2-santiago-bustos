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
public class punto2 {
      public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        double x, top, e = 100, v = 0,aux;
        int exp = 0, Iter = 0;
        
           System.out.println("ingrese el X");
        x = sc.nextDouble();

        top = 0.5;
        
        do{
        aux = v;
        if (Iter % 2 == 0) {
        	v += Math.pow(x, exp) / fact(exp);
        }else {
        	v -= Math.pow(x, exp) / fact(exp);
        }
        
        e = Math.abs((v - aux) / v) * 100;
        
        Iter = Iter + 1;
        
        exp += 1;
        
        }while(e >= top);
        
        double valor = 1 / v;

       System.out.println("El valor del e ^ (" + x + ") es = " + v);
        System.out.println("Error relativo porcentual: " + e + "%");
        System.out.println("Numero de Iteraciones: " + Iter);
	}
	 public static double fact(int o){
	        double aux1 = 1;
	        for (int i = 2; i <= o; i++) {
	        aux1 *= i;
	        }
	        return aux1;
}
}
