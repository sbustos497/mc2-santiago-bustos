package taller.pkg1;

import java.util.HashSet;
import java.util.Scanner;

public class Taller1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                
                int aux = 0, opc = 0;
                
                System.out.println("Digite 5 numeros para el conjunto A");
		HashSet<Integer> conjunto1 = new HashSet<>();
		for (int i = 1; i < 5; i++) {
			System.out.println("Numero : ");
			aux = sc.nextInt();
			conjunto1.add(aux);
		}
		System.out.println("conjunto A = " + conjunto1);
		
                System.out.println("Digite 5 numeros pra el conjunto B");
		HashSet<Integer> conjunto2 = new HashSet<>();
		for (int i = 1; i < 5; i++) {
			System.out.println("Numero :");
			aux = sc.nextInt();
			conjunto2.add(aux);
		}
		System.out.println("conjunto B = " + conjunto2);
		
                System.out.println("************************");
                System.out.println("Seleccione la operacionr:");
                System.out.println("************************");
		System.out.println(" 1. Union ");
		System.out.println(" 2. Interseccion ");
		System.out.println(" 3. Diferencia ");
                System.out.println(" 4. Diferencia Simetrica ");
                System.out.println(" 5. Saler del programa ");
                opc = sc.nextInt();
                
                switch(opc) {
		case 1:
			HashSet<Integer> Union = new HashSet<>();
			for (int elemento : conjunto1) {
				Union.add(elemento);
			}
			
			for (int elemento : conjunto2) {
				Union.add(elemento);
			}
			
			System.out.println("A U B = " + Union);
			break;
			
		case 2:
			HashSet<Integer> interseccion = new HashSet<>();
                        conjunto2.retainAll(conjunto1);
                        interseccion = conjunto2;
			
			System.out.println("A Intersección B = " + interseccion);
			break;
		
                case 3:
                        HashSet<Integer> diferencia = new HashSet<>();
                        conjunto1.removeAll(conjunto2);
                        diferencia = conjunto1;
                        System.out.println("A diferencia B = " + diferencia);
                        break;
                
                case 4:
                    HashSet<Integer> ds = new HashSet<>();
			for (int elemento : conjunto1) {
				ds .add(elemento);
			}
			
			for (int elemento : conjunto2) {
				ds.add(elemento);
			}
			HashSet<Integer> simetrica = new HashSet<>();
                        conjunto2.retainAll(conjunto1);
                        simetrica = conjunto2;
            
                        HashSet<Integer> DI= new HashSet<>();
                        ds.removeAll(simetrica);
                        DI = ds;
                        HashSet<Integer> Ds = new HashSet<>();
                        Ds = ds;
                        System.out.println("A Diferencia Simetrica B = " + Ds);
                    break;
                    
                case 5:
                         System.out.println("Saliendo del programa..");
                    break; 
		}
	}

}