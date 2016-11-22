package aprendizadojava;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//importando a lib para colocar dados no programa o Scanner
import java.util.Scanner;


/**
 *
 * @author Hecton
 */
public class Programa_Simples_Media {
   
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         //variaveis que o programa usara
         int total = 0;
         int nota;
         int media;
         //o contador ira começar com o numero 0
         int counter = 0;
         //esse while loop irá quardar 10 numeros que o user digitar
         while (counter < 10){
         //cada numero que o user digitar, ira guardar na variavel nota.
         nota = input.nextInt();
         total = total + nota;
         counter++;
}
      //o calculo da variavel
      media = total/10;
      //exibindo o valor na tela.
      System.out.println("Sua média é: " + media);
    
    
}
}