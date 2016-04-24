/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Troca_estado {
    public static void main (String args[]){
        
        int idade;
        idade = 7;
        //o switch encontra o valor na variavel
        switch(idade){
            //o 1 é o valor da variavel.
            case 1:
                System.out.println("Você pode rastejar");
                //se o caso for 1, pare.
               break;
                       case 2:
                           System.out.println("Você pode falar");
                           break;
                           
                       case 3:
                           System.out.println("Você pode ficar em apuros");
                           break;
                       default:
                      System.out.println("Eu não sei qual é a sua idade");
                            break;
                           
      } 
    }
    
}
