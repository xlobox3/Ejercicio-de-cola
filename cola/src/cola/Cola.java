
package cola;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cola {

 int MAX;
    String[] COLA;
    
     int FRENTE;
    int FIN;
Scanner lector=new Scanner(System.in);
    public Cola()
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FIN = 0;
        this.COLA = new String[this.MAX+1];
    }

    public Cola(int MAX)
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FIN = 0;  
        this.COLA = new String[this.MAX+1];
    }  
    
    public boolean IsColaLlena()
    {
        if(this.FIN == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean IsColaVacia()
    {
        if(this.FRENTE == this.FIN)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void InsertarCola() {
        
        if(this.IsColaLlena())
        {
            System.out.println("la cola esta llena");
        }
        else
        {                     
            int i;
            for(i=0;i<MAX;i++){
           System.out.println("ingrese el nombre de usuario");           
            String NOMBRE;
            NOMBRE= lector.nextLine();           
            this.FIN++;
               this.COLA[FIN]=NOMBRE;  
            }
        }
    }
    public void EliminarCola()
    {
        System.out.println("\n\n  ELIMINAR DATO ");
           if(FRENTE==-1) {
               System.out.println("Cola vacia !!!");
               return;
           }
           System.out.println("Dato eliminado = "+COLA[FRENTE]);
           if(FRENTE==FIN) {
               FRENTE=-1; FIN=-1;
               return;
           }
           if(FRENTE==MAX) FRENTE=0; else FRENTE++;
       }
   
public void MostrarCola()
{int i=0;
            System.out.println("\n\n MOSTRAR COLA  ");
            if(FRENTE==-1) {
                System.out.println("\n La Cola vacia esta !!!");
            }
            else {
                i=FRENTE;
                do {
                    System.out.println("posicion de cola["+i+"]=" +COLA[i]);
                    i++;
                    if(i==MAX && FRENTE>FIN) ; 
               }while(i!=FIN+1);
           }
           System.out.println("frente="+FRENTE);
           System.out.println("fin="+FIN);
           System.out.println("max="+MAX);
       }
         
  public  static  Cola Cola;
    public static void main(String[] args) {
        System.out.println("Bienvenido a la cola de XLOBOX3");
        int MAX;

        MAX = (int) Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));   
     Cola = new Cola(MAX);
        
        MenuCola();
    }   
    public static void MenuCola()
    {   
        int opcion;
       do {            
            System.out.println("1.- Insertar");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Salir");

            System.out.print("Opcion es --> ");
            Scanner lector=new Scanner(System.in);
            opcion = lector.nextInt();
            switch(opcion)
            {
                case 1: Cola.InsertarCola();break;
                case 2: Cola.EliminarCola();break;
                case 3: Cola.MostrarCola();break;
                case 4: System.exit(0);break;
                default: System.out.println("digite una opcion valida");
            }
        }
        while(opcion !=4); 
    }    
}
