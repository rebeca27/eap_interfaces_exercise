/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eap_challange.entities;

import eap_challange.interfaces.List;

/**
 *
 * @author rebeca
 */
public class ListaSimpla implements List {

    private int listElements[];

    public ListaSimpla(int[] listElements) {
        this.listElements = listElements;
    }

    @Override
    public void addElement(Integer element) {
        int[] newListElements = new int[this.listElements.length + 1];

        for (int i = 0; i < this.listElements.length; i++) {
            newListElements[i] = this.listElements[i];
        }

        newListElements[this.listElements.length] = element;

        this.listElements = newListElements;
    }

    @Override
    public boolean removeElement(Integer integer) {
        int pozitie = -1;

        for (int i = 0; i < this.listElements.length; i++) {
            if (this.listElements[i] == integer) {
                pozitie = i;
                break;
            }
        }

        if (pozitie == -1) {
            return false;
        }

        for (int i = pozitie; i < this.listElements.length - 1; i++) {
            this.listElements[i] = this.listElements[i + 1];
        }

        int[] newListElements = new int[this.listElements.length - 1];

        for (int i = 0; i < newListElements.length; i++) {
            newListElements[i] = this.listElements[i];
        }

        this.listElements = newListElements;

        return true;
    }

    @Override
    public int removeAll(Integer integer) {
        int times = 0;

        while (this.removeElement(integer)) {
            times++;
        }

        return times;
    }

    @Override
    public Integer get(int index) {
        return this.listElements[index - 1];
    }

    @Override
    public int lungime() {
        return listElements.length;
    }

    @Override
    public String toString() {
        String elements = "[";

        for (int i = 0; i < this.listElements.length; i++) {
            elements += this.listElements[i] + ", ";
        }
        return elements.substring(0, elements.length() - 2) + "]";
    }

}
