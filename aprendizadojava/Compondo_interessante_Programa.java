/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */

//Esse codigo pode ser usado para elaborar calculos para prever 
//quanto dinheiro vc tera no futuro, investimentos, etc
public class Compondo_interessante_Programa {
    public static void main (String[] args){
        //o calculo é   A=P(1+R)^N   MONTANTE=principal(1+rate)elevado a anos
        
        //variaveis
        double quantia;
        double valor  = 10000;
        double taxa = .01;  //1 por cento ao dia
        
        //será calculado por 20 dias a taxa de 1%
        for(int dia=1;dia<=20;dia++){
            //desc: A quantia é igual ao valor vezes 1% da taxa por dia
            quantia=valor*Math.pow(1 + taxa, dia);
            //imprima todo os valores, valores diarios
            System.out.println(dia + "     "+ quantia);
        }
        
        
     
    }
    
}
