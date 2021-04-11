/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrcion;
  import java.util.*;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Corrcion {
    static int valor=2;
static String sal="";
static double d;
static double p;
static float  matriz [][]= new float [valor][valor+1];

	public static void main(String args[]){ 
  Scanner sc = new Scanner (System.in);
    
    matriz();
    procedimiento();
    
} 

public static void matriz(){
	
	for(int i=0; i<valor; i++){
		for(int j=0; j<valor+1; j++){
		String ell="INTRODUZCA EL ELEMENTO : "+i+" "+j;	
			
		 matriz[i][j] = Float.parseFloat(JOptionPane.showInputDialog(ell));	
			
		}
	}
	
}



 static void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }
    
    static void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
    static void muestramatriz(float matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
           
                System.out.print(" " + matriz[x][y] + " |");
            }
           
            System.out.println("");
           
        }

    }
    

public static void procedimiento(){
	int pivote=0;
    
    for (int a = 0; a < valor; a++) {
            pivote(matriz, pivote, valor);

            System.out.println("Renglon " + (a + 1) + " del pivote");
            muestramatriz(matriz, valor);

            System.out.println("");

            System.out.println("Haciendo ceros");
            hacerceros(matriz, pivote, valor);

            muestramatriz(matriz, valor);
            System.out.println("");
            pivote++;
        }
        for (int x = 0; x < valor; x++) {
           
          	 System.out.println("La variable X" + (x+1)+ " es = " + matriz[x][valor]);	
        }
        
             
    
 
}

}

