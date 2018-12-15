/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Punto;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Fran
 */
public class HeapSort {
public void sort(Map<Integer, Punto> nube){
//     Iterator<Map.Entry<Integer,Punto>> it = nube.entrySet().iterator();
//     Map.Entry<Integer,Punto> e = it.next();
//     int aux[] = (int)nube.values().toArray();
     
     int n = nube.size();

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(nube, n, i);

    // One by one extract an element from heap
    for (int i=n-1; i>=0; --i)
    {
        // Move current root to end
        int ini = 0;
        int temp = (int) nube.get(ini).getx();
        //int temp = (int) nube.values().toArray()[0];
        nube.get(ini).setx(i);
        nube.get(i).setx(temp);
        //nube.values().toArray()[0] = nube.values().toArray()[i];
        //nube.values().toArray()[i] = temp;
        //arr[0] = arr[i];
        //arr[i] = temp;

        // call max heapify on the reduced heap
        heapify(nube, i, 0);
    }
    
    
}

// To heapify a subtree rooted with node i which is
// an index in arr[]. n is size of heap
void heapify(Map<Integer, Punto> nube, int n, int i)
{
    int largest = i;  // Initialize largest as root
    int l = 2*i + 1;  // left = 2*i + 1
    int r = 2*i + 2;  // right = 2*i + 2

    // If left child is larger than root
    if (l < n && (nube.get(l).getx() > nube.get(largest).getx()))
    //if (l < n && arr[l] > arr[largest])
        largest = l;

    // If right child is larger than largest so far
    if (r < n && (nube.get(r).getx() > nube.get(largest).getx()))
    //if (r < n && arr[r] > arr[largest])
        largest = r;

    // If largest is not root
    if (largest != i)
    {
        int swap = (int)nube.get(i).getx();
        nube.get(i).setx(largest);
        nube.get(largest).setx(swap);
        //nube.values().toArray()[i] = nube.values().toArray()[largest];
        //nube.values().toArray()[largest] = swap;
        //arr[i] = arr[largest];
        //arr[largest] = swap;

        // Recursively heapify the affected sub-tree
        heapify(nube, n, largest);
    }
}

/* A utility function to print array of size n */
    public void printMap(Map<Integer, Punto> nube){
    Iterator<Map.Entry<Integer,Punto>> it = nube.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry<Integer,Punto> e = it.next();
        System.out.println("key:" + e.getKey() + " " + "[" + e.getValue().getx() + "," + e.getValue().gety()+ "]");
    }    
    
}   
    
}
