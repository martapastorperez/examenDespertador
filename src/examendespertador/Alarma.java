
package examendespertador;


public class Alarma {
    
int alarma;
boolean on,off;

/**
 * Los dos primeros metodos nos valen para activar la alarma para los dias que queramos
 */
   public void activar(){
       on=true;
       System.out.println("Alarma activada");
   }
   public void desactivar(){
       off=false;
       System.out.println("Alarma desactivada");
   }
  /**
   * Una vez activada la alarma suena 
   * @param sonido 
   */
   public void sonar(boolean sonido){
       if(on){
          sonido=on;
       }else
           sonido=off;
       
   }
     /**
     * Apagar la alarma activada y el sonido
     */
    public void apagar(){
       System.out.println("Alarma agagada");
       
   }
  
 
}
