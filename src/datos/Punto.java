
package datos;

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
    
    
    public Map<Integer,Punto> generarNube (int size){       //Tamaño de la nube de puntos.
        Map<Integer,Punto> nube = new HashMap<>();
        int rango = 100;                                    //Rango de generación de numeros aleatorios.
        for (int i = 0; i < size; i++){
             nube.put(i,rndCoordenada(rango));
        }
        return nube;
    }
    
    public double perimetro(Punto p1, Punto p2, Punto p3){
        double perimetro = 0;
        Punto aux;
        aux = p1;
        perimetro += aux.distanciaEuclidea(p2);
        perimetro += aux.distanciaEuclidea(p3);
        aux = p2;
        perimetro += aux.distanciaEuclidea(p3);
        return perimetro;
    }

    public int compareTo(Punto value) {
        if(this.x >= value.getx()){
            return 1;
        }else{
            return -1;
        }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

