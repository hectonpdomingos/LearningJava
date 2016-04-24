/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Somando_Elementos_Array {
    public static void main (String [] args){
        int hecton[]={21,23,26,67,78};
        int sum=0;
        
        for(int counter=0;counter<hecton.length;counter++){
            sum+=hecton[counter];
            
        }
            System.out.println("A soma desses numeros são: " +sum);
    }
    
}
