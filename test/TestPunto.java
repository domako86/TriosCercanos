/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import datos.Punto;
import algoritmos.Exhaustivo;

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
        Punto punto = new Punto(2,2);
        Punto p1 = new Punto(2,0);
        //Punto p2 = new Punto();
        double distEuclidea = punto.distanciaEuclidea(p1);
        assertEquals(2, distEuclidea, DELTA);              
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
    
    @Test 
    public void TestPerimetro(){
        Punto aux = new Punto();
//        Punto p1 = new Punto(2,0);
//        Punto p2 = new Punto(2,1);
//        Punto p3 = new Punto(2,2);
//        assertEquals(4,aux.perimetro(p1, p2, p3),DELTA); 
        Punto p1 = new Punto(89,73);
        Punto p2 = new Punto(39,20);
        Punto p3 = new Punto(23,27);
        assertEquals(170.775,aux.perimetro(p1, p2, p3),DELTA);
    }
    
    @Test
    public void TestExhaustivo(){
        Exhaustivo ex = new Exhaustivo();
        ex.recorrer();
    
    }
}
