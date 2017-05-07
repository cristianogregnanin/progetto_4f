/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.util.Random;
import java.lang.*;
import java.awt.Component;
import javax.swing.*;
import java.lang.reflect.Method;
/**
 *
 * @author andrea
 */
public class CountingSort implements ISort {
    public static void Sort(int[] A) {   
        int max=A[0];
        int min=A[0];
        int i=1;
        for(; i<A.length; i++){
            if(A[i]>max) max=A[i];
            else if(A[i]<min) min=A[i];
        }
        //Costruzione dell'array C
        int[] C=new int[max-min+1];           //crea l'array C
        for(i=0; i<C.length; i++) C[i]=0;    //inizializza a zero gli elementi di C
        for(i=0; i<A.length; i++)
            C[A[i]-min]++;                    //aumenta il numero di volte che si è incontrato il valore
        //Ordinamento in base al contenuto dell'array delle frequenze C
        int k=0;                             //indice per l'array A
        for(i=0; i<C.length; i++){
            while(C[i]>0){                     //scrive C[i] volte il valore (i+min) nell'array A
                A[k]=i+min;
                k++;
                C[i]--;
            }
        }
    }
    
}
