/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class constructors_second {
    
     private String nomeGarota;
     
     public constructors_second (String nome){
         nomeGarota=nome;
     }
     
    public void setNome (String nome){
        nomeGarota=nome;
        
    }
    //metodo que ira acessar o nome
    public String getNome(){
        return nomeGarota;
    }
    
    //nesse metodo ele ira pelar o input anterior.
    public void falando(){
        System.out.printf("Sua primeira namorada foi %s    ", getNome());
    }
    
}

    

