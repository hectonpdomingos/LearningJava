/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */

//Executa a condição antes de checar se é verdadeira
public class Do_while_loop {
    public static void main(String[] args){
        //inicia o contador em 0
    int counter = 0;
    //executando o println 
    do{
    System.out.println(counter);
    //adiciona 1
    counter++;
}
    //ele executará se a o while confirmar com o counter logo acima
    // se o counter fosse 15, ele apenas apresentaria o numero 15 e não a contagem
    //até 10
    while (counter <=10);
}
    
}
