
package examendespertador;

import javax.swing.JOptionPane;


public class ExamenDespertador {

    
    public static void main(String[] args) {
       Alarma alarm=new Alarma();
       alarm.activar();
       alarm.sonar(true);
       alarm.desactivar();
       alarm.apagar();
  
       
       Hora hor=new Hora();
       hor.incrementarHoras();
       hor.incrementarMinutos();
       
       
       Display visualizar=new Display();
  
        visualizar.mostrarAlarma();
        visualizar.setAlarma();
        visualizar.setHora();
        visualizar.mostrarHora();
        
         int op;
      
    
    do{
       try{
        op= Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Activar alarma \n2. sonido de la alarma \n3. elegir alarma\n4. Mostrar alarma \n5. Apagar \n7. Salir")); 
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            op=0;
        }
       
        
        switch(op){
        case 1: alarm.activar();
            break;
        case 2: alarm.sonar(true);
            break;
        case 3: visualizar.setAlarma();
            break;
        case 4: visualizar.mostrarAlarma();
            break;
        case 5: alarm.apagar();
            break;
 
        case 6: 
            System.exit(0);
    
    }
    
    }while(op<6);
}
}
    
    

