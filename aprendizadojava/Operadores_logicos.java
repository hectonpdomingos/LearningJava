/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Operadores_logicos {
    public static void main(String args[]){
        int menino, menina;
        menino = 18;
        menina = 68;
        
        //se o menino tiver mais de 10 anos, ok.
    // use  && para fazer uma dupla checagem. 
     //Exemplo.  menino > 10 && menina < 60
       //Use  || para OU  menino ....  OU menina....
        if (menino > 10){
            System.out.println("Você pode entrar.");
        }else{
            System.out.println("Você é muito jovem.");
        }
        
    }
    
}
