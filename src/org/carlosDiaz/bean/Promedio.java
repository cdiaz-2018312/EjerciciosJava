
package org.carlosDiaz.bean;

/**
 *
 * @author carlos diaz
 * @date  01/04/2022
 * IN5BM 
 * grupo: 1
 */
public class Promedio {
    private float nota1;
    private float nota2;
    private float nota3;
    private float promedio;
    
    public Promedio(float nota1, float nota2, float nota3){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }   
    public float operacionPromedio(){
     promedio= (nota1 +  nota3 + nota2)/3;
        return promedio;
    }

}
