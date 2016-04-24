/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Nested_condicao {
    public static void main(String[] args){
        int idade = 100;
        if (idade < 50){
            System.out.println("Você é jovem");
        }else{
            System.out.println("você é muito velho");
            if (idade  > 75){
                System.out.println("você é realmente velho");
            }else{
                System.out.println("Não se preocupe, você não é realmente muito velho");
            }
        }
    }
    
}
