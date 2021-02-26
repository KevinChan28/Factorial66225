/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.pkg66225;

/**
 *
 * @author USER
 */
public class Factorial66225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador = 1,operacion = 1;
        
                
        while (contador<15){
            System.out.println(""+contador);
           contador=contador+1;
            operacion=operacion*contador;
        }
        System.out.println("el resultado es: "+operacion);
        System.out.println(""+contador);
        // TODO code application logic here
    }
    
}
