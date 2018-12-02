
import static java.lang.Math.sqrt;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fran
 */
public class Punto {
    private double x;
    private double y;
      
    
    //Constructores
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getx (){  return this.x;  }
    public double gety (){  return this.y;  }
    public void setx (double x){ this.x = x; }
    public void sety (double y){ this.y = y; }
    
    
    public double distanciaEuclidea (double xi, double yi, double xj, double yj){
        return sqrt(Math.pow(xi-xj,2) + Math.pow(yi-yj,2));
    }
            
    public Punto rndCoordenada(){
        Punto aux = new Punto();
        
        Random rndx = new Random(System.currentTimeMillis());        // Producir nuevo int aleatorio entre 0 y 99
        aux.x = rndx.nextInt(100);                                  // Refrescar datos aleatorios 
        rndx.setSeed(System.currentTimeMillis());
        Random rndy = new Random(System.currentTimeMillis());
        aux.y = rndy.nextInt(100);
        rndy.setSeed(System.currentTimeMillis());
        
        return aux;
    }
    
    
    public void generarNube (){
    
    
    
    }
    
}
