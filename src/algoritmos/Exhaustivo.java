/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Punto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Fran
 */
public class Exhaustivo {
    public void recorrer(){
        Punto p = new Punto();
        Map<Integer, Punto> nube = p.generarNube(5);                        //MODIFICAR TAMAÑO NUBE
        Iterator<Entry<Integer,Punto>> it = nube.entrySet().iterator();
        Punto arrayPuntos[] = new Punto[3];
        double minPerimetro = 300;
        double auxPerimetro;
        DecimalFormat df = new DecimalFormat("#.00");
        while(it.hasNext()){
            Entry<Integer,Punto> e = it.next(); 
            //int value = e.getKey();
            for(int i = e.getKey(); i < nube.size(); i++){
                for(int j = i+1; j < nube.size(); j++){
                    for(int k = j+1; k < nube.size(); k++){
                        auxPerimetro = p.perimetro(nube.get(i),nube.get(j), nube.get(k));     //calculamos perimetro
                        
                        System.out.println("Punto i" +i+": " + "[" + nube.get(i).getx() + "," + nube.get(i).gety() + "]");
                        System.out.println("Punto j" +j+": " + "[" + nube.get(j).getx() + "," + nube.get(j).gety() + "]");
                        System.out.println("Punto k" +k+": " + "[" + nube.get(k).getx() + "," + nube.get(k).gety() + "]");
                        
                        //System.out.println("key:" + e.getKey() + " " + "[" + e.getValue().getx() + "," + e.getValue().gety()+ "]");
                        System.out.println("auxperimetro: " + df.format(auxPerimetro));
                        System.out.println("---------------------------------");
                        
                        if(auxPerimetro < minPerimetro){
                            minPerimetro = auxPerimetro;
                            arrayPuntos[0] = nube.get(i);
                            arrayPuntos[1] = nube.get(j);
                            arrayPuntos[2] = nube.get(k);
                        }
                        
                        //nos quedamos con el perimetro minimo
                    }
                }
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Triangulo de perimetro mínimo: " +df.format(minPerimetro));
        System.out.println("Puntos:");
        System.out.println("P1:" + "[" +arrayPuntos[0].getx()+ "," + arrayPuntos[0].gety() + "]");
        System.out.println("P2:" + "[" +arrayPuntos[1].getx()+ "," + arrayPuntos[1].gety() + "]");
        System.out.println("P3:" + "[" +arrayPuntos[2].getx()+ "," + arrayPuntos[2].gety() + "]");
        System.out.println("------------------------------------");
    }
    
  
    
    

    
    
   
    
}
