/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//importe a função que permite gerar numeros aleatorios
import java.util.Random;
package aprendizadojava;

/**
 *
 * @author Hecton
 */

//Gerando numeros aleatorios
public class Gerando_Numeros_Aleatorios {
    public static void main (String [] args){
    //criando a função aleatoria "dado"   para a variavel "numero"
    Random dado = new Random();
    int numero;
    
    //mostrara 10 numeros aleatórios
    for(int counter=1; counter<=10; counter++){
    //os numeros comecam de 1 até 6
    numero = dado.nextInt(6);
    //ira mostrar numeros aleatórios de 1 a 6
    System.out.println(numero +"  ");
}
    
    
}
    
}
