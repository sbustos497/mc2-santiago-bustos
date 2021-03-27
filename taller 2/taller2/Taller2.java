/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.HashSet;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          HashSet<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(6);
        conjunto1.add(7);
        conjunto1.add(8);
        conjunto1.add(9);
        conjunto1.add(10);
        conjunto1.add(11);
        conjunto1.add(12);
        conjunto1.add(13);
        conjunto1.add(14);
        conjunto1.add(15);
        conjunto1.add(16);
        conjunto1.add(17);
        conjunto1.add(18);
        conjunto1.add(19);
        conjunto1.add(20);
        conjunto1.add(21);
        conjunto1.add(22);
        conjunto1.add(23);
        conjunto1.add(24);

        System.out.println("conjunto A = " + conjunto1);

       
        HashSet<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(1);
        conjunto2.add(5);
        conjunto2.add(7);
        conjunto2.add(9);
        conjunto2.add(11);
        conjunto2.add(13);
        conjunto2.add(15);
        conjunto2.add(17);
        conjunto2.add(19);
        conjunto2.add(21);
        conjunto2.add(23);
        conjunto2.add(25);
        conjunto2.add(27);
        conjunto2.add(29);

        System.out.println("conjunto B = " + conjunto2);

      
        HashSet<Integer> conjunto3 = new HashSet<>();
        conjunto3.add(0);
        conjunto3.add(3);
        conjunto3.add(6);
        conjunto3.add(9);
        conjunto3.add(11);
        conjunto3.add(15);
        conjunto3.add(18);
        conjunto3.add(20);

        System.out.println("conjunto C = " + conjunto3);

  
        HashSet<Integer> conjunto4 = new HashSet<>();
        conjunto4.add(2);
        conjunto4.add(3);
        conjunto4.add(5);
        conjunto4.add(7);
        conjunto4.add(11);
        conjunto4.add(17);
        conjunto4.add(19);
        conjunto4.add(23);
        conjunto4.add(29);
        conjunto4.add(31);
        conjunto4.add(37);

        System.out.println("conjunto D = " + conjunto4);

        HashSet<Integer> ds1 = new HashSet<>();
        for (int elemento1 : conjunto1) {
            ds1.add(elemento1);
        }

        for (int elemento1 : conjunto2) {
            ds1.add(elemento1);
        }
        HashSet<Integer> simetrica1 = new HashSet<>();
        conjunto1.retainAll(conjunto2);
        simetrica1 = conjunto1;

        HashSet<Integer> DI1 = new HashSet<>();
        ds1.removeAll(simetrica1);
        DI1 = ds1;
        HashSet<Integer> Ds1 = new HashSet<>();
        Ds1 = ds1;

        HashSet<Integer> interseccion1 = new HashSet<>();
        ds1.retainAll(conjunto3);
        interseccion1 = ds1;

        System.out.println("R1 " + interseccion1);
        
        
        
        
        
        

        HashSet<Integer> diferencia2 = new HashSet<>();
        conjunto1.removeAll(conjunto3);
        diferencia2 = conjunto1;

        HashSet<Integer> Union2 = new HashSet<>();
        for (int elemento2 : diferencia2) {
            Union2.add(elemento2);
        }

        for (int elemento2 : conjunto2) {
            Union2.add(elemento2);
        }
        System.out.println("R2 = " + Union2);
        
        
        
        
        
        

        HashSet<Integer> Union3 = new HashSet<>();
        for (int elemento3 : conjunto3) {
            Union3.add(elemento3);
        }

        for (int elemento3 : conjunto4) {
            Union3.add(elemento3);
        }
        HashSet<Integer> ds3 = new HashSet<>();
        for (int elemento3 : Union3) {
            ds3.add(elemento3);
        }

        for (int elemento3 : conjunto1) {
            ds3.add(elemento3);
        }
        HashSet<Integer> simetrica3 = new HashSet<>();
        Union3.retainAll(conjunto1);
        simetrica3 = Union3;

        HashSet<Integer> DI3 = new HashSet<>();
        ds3.removeAll(simetrica3);
        DI3 = ds3;
        HashSet<Integer> Ds3 = new HashSet<>();
        Ds3 = ds3;
        System.out.println("R3 = " + Ds3);
        
        
        
        

        HashSet<Integer> diferencia4 = new HashSet<>();
        conjunto3.removeAll(conjunto1);
        diferencia4 = conjunto3;

        HashSet<Integer> interseccion4 = new HashSet<>();
        conjunto2.retainAll(conjunto4);
        interseccion4 = conjunto2;

        HashSet<Integer> ds4 = new HashSet<>();
        for (int elemento4 : diferencia4) {
            ds4.add(elemento4);
        }

        for (int elemento4 : interseccion4) {
            ds4.add(elemento4);
        }
        HashSet<Integer> simetrica4 = new HashSet<>();
       interseccion4.retainAll(diferencia4);
        simetrica4 = interseccion4;

        HashSet<Integer> DI4 = new HashSet<>();
        ds4.removeAll(simetrica4);
        DI4 = ds4;
        HashSet<Integer> Ds4 = new HashSet<>();
        Ds4 = ds4;
        System.out.println("R4 = " + Ds4);

    }
    
}
