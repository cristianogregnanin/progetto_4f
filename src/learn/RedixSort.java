/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author alex99
 */
class RedixSort implements Interfaccia
{
     public int[] sort(int[] old) {
    // Loop for every bit in the integers
    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
        int[] tmp = new int[old.length];
        int j = 0;
        for (int i = 0; i < old.length; i++) {
            boolean move = old[i] << shift >= 0;
            if (shift == 0 ? !move : move) {
                tmp[j] = old[i];
                j++;
            } else {
                old[i - j] = old[i];
            }
        }
        for (int i = j; i < tmp.length; i++) {
            tmp[i] = old[i - j];
        }
        old = tmp;
    }
    return old;
    }

    
}
    

