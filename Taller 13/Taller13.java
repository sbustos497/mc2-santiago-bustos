/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller13;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Taller13 {

    
     public int producto(int a[], int b []){
         int menor = (a.length < b.length)? a.length : b.length;
         int resultado = 0;
         int []meno= new int[menor];
         
         for (int i = 0; i < meno.length; i++) {
             
             resultado += a[i]*b[i];
         }
                 
         return resultado;
     }
    
    
    
    public void imprimir (int a[], int b[]){
        Taller13 prueba = new   Taller13();
        System.out.println("el producto punto es : " + prueba.producto(a, b));
    }
    
    public static void main(String[] args) {
        int a[]= {1,2,3,4};
        int b[] = {4,2,3,1};
        Taller13 prueba = new Taller13 ();
        prueba.imprimir(a, b);
    }
}
