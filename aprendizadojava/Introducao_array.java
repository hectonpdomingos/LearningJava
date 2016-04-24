/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Introducao_array {
    public static void main (String[] args){
        //quando vc coloca o nome da variavel e [] o java sabera que se trata
        // de um array, no segundo [] vc precisa indicar quantos valores
        //variaveis ele vai guardar em uma unica array.
       //uma das opções seria digitar todas as variaveis  
        //int hecton[]=new int[10];
        //hecton[0]=87;
        //hecton[1]=543;
        //hecton[9]=65;
        
        //porem vamos fazer algo diferente.
        //vamos fazer um array inicializador para ficar mais fácil
         int hecton[]={2,4,5,};
        //lembre-se que começa com 0 no array inicializer
        System.out.println(hecton[1]);
    }
    
}
