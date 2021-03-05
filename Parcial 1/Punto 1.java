/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.HashSet;

/**
 *
 * @author SANTIAGO BUSTOS
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HashSet<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(9);
        conjunto1.add(15);
        conjunto1.add(31);
        conjunto1.add(46);
       

        System.out.println("conjunto A = " + conjunto1);

       
        HashSet<Integer> conjunto2 = new HashSet<>();
        
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
       
        System.out.println("conjunto B = " + conjunto2);

      
        HashSet<Integer> conjunto3 = new HashSet<>();
        conjunto3.add(0);
        conjunto3.add(3);
        conjunto3.add(6);
        conjunto3.add(9);
        conjunto3.add(12);
        conjunto3.add(15);
        conjunto3.add(18);
        conjunto3.add(21);
        conjunto3.add(24);
        conjunto3.add(27);
       

        System.out.println("conjunto C = " + conjunto3);

  
        HashSet<Integer> conjunto4 = new HashSet<>();
       
        conjunto4.add(5);
        conjunto4.add(7);
        conjunto4.add(11);
        conjunto4.add(17);
        conjunto4.add(19);
        conjunto4.add(23);
        conjunto4.add(29);
        conjunto4.add(31);
        conjunto4.add(37);
conjunto4.add(41);
        conjunto4.add(43);
        conjunto4.add(47);
        System.out.println("conjunto D = " + conjunto4);

       HashSet<Integer> interseccion = new HashSet<>();
                        conjunto2.retainAll(conjunto3);
                        interseccion = conjunto2;
			
                        
                        HashSet<Integer> ds = new HashSet<>();
			for (int elemento : conjunto1) {
				ds .add(elemento);
			}
			
			for (int elemento : conjunto4) {
				ds.add(elemento);
			}
			HashSet<Integer> simetrica = new HashSet<>();
                        conjunto4.retainAll(conjunto1);
                        simetrica = conjunto4;
            
                        HashSet<Integer> DI= new HashSet<>();
                        ds.removeAll(simetrica);
                        DI = ds;
                        HashSet<Integer> Ds = new HashSet<>();
                        Ds = ds;
                        
                        HashSet<Integer> Union = new HashSet<>();
			for (int elemento : interseccion) {
				Union.add(elemento);
			}
			
			for (int elemento : Ds) {
				Union.add(elemento);
			}
			
			System.out.println("(B n C)u (A ds D)= " + Union);
                        
                        
                        
                        
                        
                        
                          HashSet<Integer> dis = new HashSet<>();
			for (int elemento : conjunto2) {
				dis .add(elemento);
			}
			
			for (int elemento : conjunto3) {
				dis.add(elemento);
			}
			HashSet<Integer> Simetrica = new HashSet<>();
                        conjunto2.retainAll(conjunto3);
                        Simetrica = conjunto2;
            
                        HashSet<Integer> DIF= new HashSet<>();
                        dis.removeAll(Simetrica);
                        DIF = dis;
                        HashSet<Integer> Dsf = new HashSet<>();
                        Dsf = dis;
                        
                        
                          HashSet<Integer> diferencia1 = new HashSet<>();
                        conjunto2.removeAll(conjunto3);
                        diferencia1 = conjunto2;
                       
                        
                        HashSet<Integer> Union1 = new HashSet<>();
			for (int elemento : conjunto1) {
				Union1.add(elemento);
			}
			
			for (int elemento : diferencia1) {
				Union1.add(elemento);
			}
			
			
                        
                        
                           HashSet<Integer> ds15 = new HashSet<>();
			for (int elemento : Dsf) {
				ds15 .add(elemento);
			}
			
			for (int elemento : Union1) {
				ds15.add(elemento);
			}
			HashSet<Integer>    SImetrica = new HashSet<>();
                        conjunto2.retainAll(conjunto1);
                        SImetrica = conjunto2;
            
                        HashSet<Integer> DI15= new HashSet<>();
                        ds15.removeAll(SImetrica);
                        DI15 = ds15;
                        HashSet<Integer> Ds15 = new HashSet<>();
                        Ds15 = ds15;
                        System.out.println("(B Ds C)Ds(Au(B-C))= " + Ds15);
                        
                        
                        
                        
                        
        //************************************************************************
        
        HashSet<Integer> diferencia2 = new HashSet<>();
                        conjunto3.removeAll(conjunto2);
                        diferencia2 = conjunto3;
                      ;
                        
                        
                        
                        HashSet<Integer> interseccion2 = new HashSet<>();
                        conjunto4.retainAll(conjunto1);
                        interseccion2 = conjunto4;
			
			
        
                        
                         HashSet<Integer> ds2= new HashSet<>();
			for (int elemento : diferencia2) {
				ds2 .add(elemento);
			}
			
			for (int elemento : interseccion2) {
				ds2.add(elemento);
			}
			HashSet<Integer> SIMetrica = new HashSet<>();
                        interseccion2.retainAll(diferencia2);
                        SIMetrica =interseccion2 ;
            
                        HashSet<Integer> DI2= new HashSet<>();
                        ds2.removeAll(SIMetrica);
                        DI2 = ds2;
                        HashSet<Integer> Ds2 = new HashSet<>();
                        Ds2 = ds2;
                       
        
                        
                        
                        HashSet<Integer> Union2 = new HashSet<>();
			for (int elemento : conjunto1) {
				Union2.add(elemento);
			}
			
			for (int elemento : conjunto2) {
				Union2.add(elemento);
			}
			
			;
                        
                        
                        HashSet<Integer> Union3 = new HashSet<>();
			for (int elemento : Union2) {
				Union3.add(elemento);
			}
			
			for (int elemento : conjunto3) {
				Union3.add(elemento);
			}
			
			
                        
                        HashSet<Integer> interseccion3 = new HashSet<>();
                        Union3.retainAll(Ds2);
                        interseccion3 = Union3;
			
			System.out.println("((C-B)Ds(A n D) n (A U B U C)= " + interseccion3);

    }
    }
    

