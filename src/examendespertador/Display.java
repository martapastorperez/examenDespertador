/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendespertador;

/**
 *
 * @author mpastorperez
 */
public class Display extends Hora{
    int alarma;
  
    public void setAlarma(){
       alarma=this.alarma;
       System.out.println("Elegir alarma");
    }
  
    /**
     * se muestra la alarma elegida ya en setAlarma
     */
   public void mostrarAlarma(){
       System.out.println("visualizando: "+this.alarma);
       
   }
    public void setHora(){
        hora=this.hora;
        System.out.println("Hora elegida");
        
    }
    /**
     * Se muestra la hora elegida ya en setHora
     */
    public void mostrarHora(){
        System.out.println("Visualizando: "+this.hora);
    }
}
