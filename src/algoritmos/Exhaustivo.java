/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Punto;
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
        Map<Integer, Punto> nube = p.generarNube(3);
        Iterator<Entry<Integer,Punto>> it = nube.entrySet().iterator();
        Punto arrayPuntos[] = new Punto[3];
        double minPerimetro = -1;
        double auxPerimetro;
        while(it.hasNext()){
            Entry<Integer,Punto> e = it.next(); // REVISAR con nube completa de puntos
            //int value = e.getKey();
            for(int i = e.getKey(); i < nube.size(); i++){
                for(int j = i+1; j < nube.size(); j++){
                    for(int k = j+1; k < nube.size(); k++){
                        auxPerimetro = p.perimetro(nube.get(i),nube.get(j), nube.get(k));     //calculamos perimetro
                        
                        System.out.println("Punto 1: "+ "[" + nube.get(i).getx() + "," + nube.get(i).gety() + "]");
                        System.out.println("Punto 2: "+ "[" + nube.get(j).getx() + "," + nube.get(j).gety() + "]");
                        System.out.println("Punto 3: "+ "[" + nube.get(k).getx() + "," + nube.get(k).gety() + "]");
                        
                        //System.out.println("key:" + e.getKey() + " " + "[" + e.getValue().getx() + "," + e.getValue().gety()+ "]");
                                                
                        
                        System.out.println("auxperimetro: " + auxPerimetro);
                        
                        //nos quedamos con el perimetro minimo
                    }
                }
            }
        }
    }
    
  
    
    

    
    
   
    
}
