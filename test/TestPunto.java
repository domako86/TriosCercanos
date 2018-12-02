/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Punto punto = new Punto();
        double distEuclidea = punto.distanciaEuclidea(2, 1, 2, 2);
        assertEquals(1, distEuclidea, DELTA);
        
        
    }
}
