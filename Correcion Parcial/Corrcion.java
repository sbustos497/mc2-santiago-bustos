/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrcion;

import java.util.HashSet;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Corrcion {

    public static HashSet<Integer> union (HashSet<Integer> ConjuntoA ,HashSet<Integer> ConjuntoB){
HashSet<Integer> union = new HashSet <Integer> ();
 for (int elemento : ConjuntoA) {
            union.add(elemento);
        }
          for (int elemento : ConjuntoB) {
            union.add(elemento);  
        }
return union;
}
public static HashSet<Integer> interseccion (HashSet<Integer> ConjuntoA ,HashSet<Integer> ConjuntoB){
    

HashSet<Integer>interseccion = new HashSet<>(); 
        for (int elemento : ConjuntoA) {
     
        
          for (int elemento1 : ConjuntoB) {
            
            if (elemento == elemento1){
                interseccion.add(elemento);
          }
            
          }
        }
        return interseccion;
}
public static HashSet<Integer> diferencia(HashSet<Integer> ConjuntoA ,HashSet<Integer> ConjuntoB){
HashSet<Integer>diferencia = new HashSet<>();
     
     diferencia = (HashSet)ConjuntoA.clone();
      diferencia.removeAll(ConjuntoB);
      return diferencia;
}
 public static HashSet<Integer> difA(HashSet<Integer> ConjuntoA ,HashSet<Integer> ConjuntoB){
 HashSet<Integer>difA = new HashSet<>();
     difA = diferencia(union(ConjuntoA,ConjuntoB),interseccion(ConjuntoA,ConjuntoB));
     
     
     return difA;
}
 
    public static void main(String[] args) {
        
        HashSet<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(4);
        conjunto1.add(8);
        conjunto1.add(15);
        conjunto1.add(31);
        conjunto1.add(46);
        
           HashSet<Integer> conjunto2 = new HashSet<Integer>();
        conjunto2.add(6);
        conjunto2.add(7);
        conjunto2.add(8);
        conjunto2.add(10);
        conjunto2.add(11);
        conjunto2.add(12);
        conjunto2.add(13);
        conjunto2.add(14);
        conjunto2.add(15);
        conjunto2.add(16);
        conjunto2.add(17);
        conjunto2.add(18);
        conjunto2.add(19);
        conjunto2.add(20);
        conjunto2.add(21);
        conjunto2.add(22);
        conjunto2.add(23);
        conjunto2.add(24);
       
        
         HashSet<Integer> conjunto3 = new HashSet<Integer>();
        
         conjunto3.add(0);
        conjunto3.add(-3);
        conjunto3.add(18);
        conjunto3.add(3);
        conjunto3.add(21);
        conjunto3.add(6);
        conjunto3.add(24);
        conjunto3.add(9);
        conjunto3.add(27);
        conjunto3.add(12);
        conjunto3.add(30);
        conjunto3.add(15);
        
       
        HashSet<Integer> conjunto4 = new HashSet<Integer>();
        conjunto4.add(7);
        conjunto4.add(11);
        conjunto4.add(13);
        conjunto4.add(17);
        conjunto4.add(19);
        conjunto4.add(23);
        conjunto4.add(29);
         conjunto4.add(31);
        conjunto4.add(37);
        conjunto4.add(41);
        conjunto4.add(43);
       
        
        System.out.println("Connunto A");
        System.out.println(conjunto1);
         System.out.println("-----------------");
         System.out.println("Connunto B");
        System.out.println(conjunto2);
         System.out.println("------------------");
         System.out.println("Connunto C");
        System.out.println(conjunto3);
         System.out.println("-------------------");
         System.out.println("Connunto D");
        System.out.println(conjunto4);
        System.out.println("-----------------");
        
        
        HashSet<Integer> respuesta1 = new HashSet<Integer>();
        
        
        respuesta1 = union(interseccion(conjunto2,conjunto3),difA(conjunto1,conjunto4));
        
             HashSet<Integer> respuesta2 = new HashSet<Integer>();
        respuesta2 = difA(difA(conjunto2,conjunto3),union(conjunto1,diferencia(conjunto2,conjunto3)));
        
             HashSet<Integer> respuesta3 = new HashSet<Integer>();
             
        respuesta3 = interseccion(union(union(conjunto1,conjunto2),conjunto3),difA(diferencia(conjunto3,conjunto2),interseccion(conjunto1,conjunto4)));
        
       
       System.out.println("Resultado 1 "+ respuesta1);
       
       
     System.out.println("Resultado 2 "+ respuesta2);
     
       System.out.println("Resultado 2 "+ respuesta3);
   
    
}}
