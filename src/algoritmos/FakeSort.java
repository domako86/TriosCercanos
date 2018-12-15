/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Punto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author fcogu
 */
public class FakeSort {
    public List<Entry<Integer,Punto>> ordenar(Map<Integer, Punto> nube){
        //Map<Integer, Punto> ordenado;
        Set<Entry<Integer,Punto>> set = nube.entrySet();
        List<Entry<Integer,Punto>> list = new ArrayList<Entry<Integer,Punto>>(set);
        Collections.sort( list, new Comparator<Map.Entry<Integer, Punto>>() {
            @Override
            public int compare( Map.Entry<Integer, Punto> o1, Map.Entry<Integer, Punto> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<Integer,Punto> entry:list){
            System.out.println(entry.getKey()+" ==== " +"["+entry.getValue().getx()+ "," +entry.getValue().gety()+ "]");
        }
        return list;
    }
    
}

