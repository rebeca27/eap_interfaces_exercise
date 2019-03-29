/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eap_challange;

import eap_challange.entities.ListaOrdonata;
import eap_challange.entities.ListaSimpla;

/**
 *
 * @author rebeca
 */
public class EAP_Challange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elemente[] = {1, 23, 5, 4};
        
        ListaSimpla listaSimpla = new ListaSimpla(elemente);
        System.out.println("Lungime lista simpla = " + listaSimpla.lungime());
        System.out.println("Lista simpla = " + listaSimpla.toString());
        
        listaSimpla.addElement(15);
        System.out.println("Lista simpla = " + listaSimpla.toString());
        System.out.println("Lista simpla element pe pozitia 2 = " + listaSimpla.get(2));
        
        
        listaSimpla.removeElement(4);
        System.out.println("Lista simpla = " + listaSimpla.toString());
        
        listaSimpla.addElement(5);
        System.out.println("Lista simpla = " + listaSimpla.toString());
       
        System.out.println("5 a fost sters de " + listaSimpla.removeAll(5) + " din lista simpla");
        System.out.println("Lista simpla = " + listaSimpla.toString());

        System.out.println("35 a fost sters de " + listaSimpla.removeAll(35) + " din lista simpla");
        System.out.println("Lista simpla = " + listaSimpla.toString());
        
        System.out.println("\n\n\n");
//        ---------------------------------
        
        ListaOrdonata listaOrdonata = new ListaOrdonata(elemente);
        System.out.println("Lungime lista ordonata = " + listaOrdonata.lungime());
        System.out.println("Lista ordonata = " + listaOrdonata.toString());
        
        listaOrdonata.addElement(15);
        System.out.println("Lista ordonata = " + listaOrdonata.toString());
        System.out.println("Lista ordonata element pe pozitia 2 = " + listaOrdonata.get(2));
        
        
        listaOrdonata.removeElement(4);
        System.out.println("Lista ordonata = " + listaOrdonata.toString());
        
        listaOrdonata.addElement(5);
        System.out.println("Lista ordonata = " + listaOrdonata.toString());
       
        System.out.println("5 a fost sters de " + listaOrdonata.removeAll(5) + " din lista ordonata");
        System.out.println("Lista ordonata = " + listaOrdonata.toString());

        System.out.println("35 a fost sters de " + listaOrdonata.removeAll(35) + " din lista ordonata");
        System.out.println("Lista ordonata = " + listaOrdonata.toString());
    }

}
