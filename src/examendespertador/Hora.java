
package examendespertador;


public class Hora {
    int hora; 
    int minutos,horas;
    
    /**
     * Incrementamos las horas de una en una
     */
    public void incrementarHoras(){
        for(horas=0;horas<12;horas++){
            hora=horas+1;
             System.out.println("Hora incrementada");
            break;
            
        }
        
    }
    /**
     * incrementamos los minutos de uno en uno
     */
    public void incrementarMinutos(){
            for(minutos=0;minutos<12;minutos++){
            hora=minutos+1;
             System.out.println("minutos incrementados");
            break;
        }
          
    }
   
}
