/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class TestPunto {
    private static final double DELTA = 1e-6;
    @Test
    public void ConstructorDefecto() {
        Punto punto = new Punto();
        double cordx = punto.getx();
        double cordy = punto.gety();
        assertEquals(0,cordx,DELTA);
        assertEquals(0,cordy,DELTA);
       // assertEquals("Coordenada x=0",0.0, punto.getx());
    }
    
    @Test
    public void distanciaEuclidea(){
        Punto punto = new Punto(2,1);
        Punto p1 = new Punto(2,2);
        //Punto p2 = new Punto();
        double distEuclidea = punto.distanciaEuclidea(p1);
        assertEquals(1, distEuclidea, DELTA);              
    }
    
    @Test
    public void TestNube(){
        Punto punto = new Punto();
        Map<Integer,Punto> nubeaux = new HashMap<>();
        int size = 5;
        nubeaux = punto.generarNube(size);
        assertEquals(size, nubeaux.size(),DELTA);
        System.out.println("keyset:" + nubeaux.keySet());
        Iterator<Entry<Integer,Punto>> it = nubeaux.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer,Punto> e = it.next();
            System.out.println("key:" + e.getKey() + " " + "[" + e.getValue().getx() + "," + e.getValue().gety()+ "]");
        }
        
    
    }
}
