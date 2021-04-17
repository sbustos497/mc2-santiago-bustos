/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversa;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Inversa {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i,j,k,n;
        
        System.out.println("Introduca el numero de filas y columanas de la matriz nxn");
        n=sc.nextInt();
        
        float A[][] = new float [n][n], I[][] = new float [n][n],aux,pivote;
        
        
        System.out.println("Matriz");
        for ( i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Introdusca el valor de  " + i+","+j);
                A[i][j]=sc.nextFloat();
               System.out.print("| "+A[i][j]+ "| ");
                I[i][j]=0;
                if (i==j) {
                    I[i][j]=1;
                }
                 
                System.out.println( "   ");
                        
                        
                       
            }
            
        }
        
        
        for (i = 0;  i< n; i++) {
            pivote = A[i][i];
            for (k = 0;  k< n; k++) {
                A[i][k]=A[i][k]/pivote;
                I[i][k]=I[i][k]/pivote;
            }
            
            for (j = 0;  j< n; j++) {
                if (i!=j) {
                    aux=A[j][i];
                    for (k = 0; k < n; k++) {
                        A[j][k]=A[j][k]-aux*A[i][k];
                         I[j][k]=I[j][k]-aux*I[i][k];
                    }
                }
            }
        }
   
        System.out.println("Matriz Principal");
        for ( i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("| "+A[i][j]+ " |");
               
            }
            
               System.out.println("");
                 
    }
        
        System.out.println("MATRIZ INVERSA");
         
            
            
              for ( i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
               
                System.out.print("| "+I[i][j]+ " |");
            }
                  System.out.println("");
            }
        }
    }


