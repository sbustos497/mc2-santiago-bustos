/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matec;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, top, err = 100, valor = 0, aux;
        int expo = 0;
        int iter = 0;

        System.out.println("Digite el valor del angulo (Radianes)");
        a = sc.nextDouble();

        top = 0.5;

        do {

            aux = valor;

            if (iter % 2 == 0) {
                valor += Math.pow(a, expo) / factorial(expo);
            } else {
                valor -= Math.pow(a, expo) / factorial(expo);
            }

            err = Math.abs((valor - aux) / valor) * 100;

            iter = iter + 1;

            expo += 2;

        } while (err >= top);

        System.out.println("Mostrando valores ");
        
        System.out.println("error : " + err + "%");
        
        System.out.println(" valor de cos(" + a + ") es = " + valor);
        
        System.out.println("cantidad de iteraciones: " + iter);
    }

    public static double part2(int ca) {
        double aux1 = 1;

        for (int i = 2; i <= ca; i++) {
            aux1 *= i;
        }

        return aux1;
    }
}
