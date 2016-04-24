package aprendizadojava;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
package aprendizadojava;

/**
 *
 * @author Hecton
 */

//Usando arrays como contadores
public class Array_Elementos_como_contadores {
    public static void main (String [] args){
        
        //criando a variavel para a função aleatorea
        Random rand = new Random();
        
       //criando uma array chamada frequencia, sera como dado sendo jogado
        //colocamos o numero 7 (elementos)pois vamos desconciderar o numero 0
        //por razões obvias
        int frequencia[]=new int[7];
        
        //vamos fazer o for loop para rolar o dado
        for(int roll=1;roll<1000;roll++){
      //add 1
            ++frequencia[1+rand.nextInt(6)];
        }
            
        System.out.println("Face\tFrequencia");
        for (int face=1; face<frequencia.length;face++){
            System.out.println(face+"\t"+frequencia[face]);
        
        }
        }
        
    }
    
}
