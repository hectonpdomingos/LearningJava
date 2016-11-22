package aprendizadojava;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author Hecton
 */
public class Operadores_matematicos {
    public static void main (String args[]){
     Scanner hecton = new Scanner(System.in);
     
     //double é para numeros decimais, o int é para integrais interge
     //nunca use int para dividir e multiplicar, se quiser numeros exatos
     //use doubles pois o int não ira mostra o resto. Use o %  e / operadores
     int meninos, meninas, pessoas;
     meninas = 6;
     meninos = 3;
     pessoas = meninas + meninos;
     System.out.println(pessoas);
     
    }
    
    
}
