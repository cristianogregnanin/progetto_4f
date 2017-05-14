package learn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuele98
 */
public class SelectionSort implements ISort
{   //algoritmo di ordinamento
    public static void Sort(int[] vettore) 
    {        
        for(int i = 0; i < vettore.length-1; i++) 
        {
            int minimo = i; //Partenza dall'elemento i
            
            for(int j = i+1; j < vettore.length; j++) 
            {
             //quando si trova un elemento più piccolo della variabile minimo gli si fa assumere il valore dell'elemento trovato
                    if(vettore[minimo] > vettore[j])
                        minimo = j;
            }

            //scambio quando la variabile minimo è diversa dall'elemento di partenza
            if(minimo != i) 
            { 
                int k = vettore[minimo];
                vettore[minimo] = vettore[i];
                vettore[i] = k;
            }
        }
    }
}
