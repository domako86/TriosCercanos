/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Punto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author fcogu
 */
public class DyV {
    public void recorrer(Map<Integer, Punto> nube){
        Set<Map.Entry<Integer,Punto>> set = nube.entrySet();
        List<Map.Entry<Integer,Punto>> list = new ArrayList<Map.Entry<Integer,Punto>>(set);
        FakeSort fake = new FakeSort();
        list = fake.ordenar(nube);
        //System.out.println("Testing DyV " + list.get(0).getValue().getx());  //obtenemos el valor x del primer elemento de la lista
        int medio = list.size()/2;
        System.out.println("Mitad del intervalo: " +list.get(medio).getKey() + "=" + "[" +list.get(medio).getValue().getx() + "," + list.get(medio).getValue().gety() + "]");
        System.out.println("Final del intervalo: " +list.get(list.size()-1).getKey() + "=" + "[" +list.get(list.size()-1).getValue().getx() + "," + list.get(list.size()-1).getValue().gety() + "]");
        
        List<Map.Entry<Integer,Punto>> sublist_dcha = new ArrayList<Map.Entry<Integer,Punto>>(list.subList(medio+1, list.size()-1));
        List<Map.Entry<Integer,Punto>> sublist_izq = new ArrayList<Map.Entry<Integer,Punto>>(list.subList(0, medio));
        sublist_izq.removeAll(list);
        sublist_dcha.removeAll(list);
        //System.out.println("Tamaño sublista izq: " + sublist_izq.size());
        
        for(Map.Entry<Integer,Punto> entry:list){
            if(entry.getValue().getx() < list.get(medio).getValue().getx()){
                System.out.println("Valor entry.getValue().getx():  " +entry.getValue().getx());
                System.out.println("Valor list.get(medio).getValue().getx(): " +list.get(medio).getValue().getx());
                System.out.println("Tamaño sublista izq: " + sublist_izq.size());
                sublist_izq.add(entry);
                System.out.println(entry.getKey()+" ==== " +"["+entry.getValue().getx()+ "," +entry.getValue().gety()+ "]");
            }
            else{
                sublist_dcha.add(entry);
            }
        }

        System.out.println("Sublist Izquierda: ");
        System.out.println("-----------------------------");
        sublist_izq.forEach((entryizq) -> {
            System.out.println(entryizq.getKey()+" ==== " +"["+entryizq.getValue().getx()+ "," +entryizq.getValue().gety()+ "]");
        });
        System.out.println("*****************************");
        System.out.println("Sublista Derecha");
        sublist_dcha.forEach((entrydcha) -> {
            System.out.println(entrydcha.getKey()+" ==== " +"["+entrydcha.getValue().getx()+ "," +entrydcha.getValue().gety()+ "]");
        });
        System.out.println("-----------------------------");
    }
    
}
