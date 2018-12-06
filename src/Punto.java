
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
    
    
    public double distanciaEuclidea (Punto p){
        return sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }
            
    public Punto rndCoordenada(int rango){
        Punto aux = new Punto();
        aux.x = new Random().nextInt(rango);
        aux.y = new Random().nextInt(rango);
        return aux;
    }
    
    
    public Map<Integer,Punto> generarNube (int size){
        Map<Integer,Punto> nube = new HashMap<>();
        int rango = 100;
        for (int i = 0; i < size; i++){
             nube.put(i,rndCoordenada(rango));
        }
        return nube;
    }
    
    
    
}
