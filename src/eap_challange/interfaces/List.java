/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eap_challange.interfaces;

/**
 *
 * @author rebeca
 */
public interface List {

    void addElement(Integer integer);

    boolean removeElement(Integer integer);

    int removeAll(Integer integer);

    Integer get(int index);

    int lungime();
}
