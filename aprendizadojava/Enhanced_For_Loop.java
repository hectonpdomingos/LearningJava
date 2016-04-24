/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Enhanced_For_Loop {
    public static void main (String [] args){
        //array nomeada de hecton
        int hecton[]={3,4,5,6,77};
        //variavel que ira guardar os valores do array
        int total=0;
        //o  x ele vai guardar o valor do array e fazer um loop
        for(int x: hecton){
            total+=x;
        }
        
        System.out.println(total);
    }
    
            
                                 
    
}
