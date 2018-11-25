
import static java.lang.Math.sqrt;

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
    
    
    
    public double distanciaEuclidea (double xi, double yi, double xj, double yj){
        return sqrt(Math.pow(xi-xj,2) + Math.pow(yi, yj));
    }
            
    
}
