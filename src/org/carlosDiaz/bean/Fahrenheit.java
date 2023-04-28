
package org.carlosDiaz.bean;

/**
 * @author carlos diaz
 * @date  01/04/2022
 * IN5BM 
 * grupo: 1
 */
public class Fahrenheit {
    private float c;
    private float resultado;
    public Fahrenheit(float c){
        this.c=c;
    }
    public float Operacion(){
        
        resultado=(9/5*c)+32;
        return resultado;
    }
    
}
