
package org.carlosDiaz.bean;

/**
 *
 * @author carlos diaz
 * @date  01/04/2022
 * IN5BM 
 * grupo: 1
 */
public class RepartidorPizza {
    private float Km;
    private float tiempoEstimado;
    
   public  RepartidorPizza(){
    }
   public void setKm(float Km){
       this.Km=Km;
   }
   
   public float getKm(){
       return Km;
   }
   
   public float TiempoEstimado(){
       this.tiempoEstimado= Km * 45;
       return tiempoEstimado ;
   }
}
