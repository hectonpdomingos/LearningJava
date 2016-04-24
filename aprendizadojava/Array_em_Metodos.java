/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Array_em_Metodos {
    public static void main (String [] args){
        //criando um array com nome de hecton
        int hecton[]={3,4,5,6,7};
        //pegamos o array hecton e colocamos no metodo change
        change(hecton);
        
        //coloque na tela
        for (int y:hecton)
      System.out.println(y);
    }
    public static void change (int x[]){
        for (int counter=0;counter<x.length;counter++)
            //pegue os valores e adicione mais 5
            x[counter]+=5;
    }
}
