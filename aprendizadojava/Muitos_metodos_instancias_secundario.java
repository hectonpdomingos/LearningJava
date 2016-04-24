/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Muitos_metodos_instancias_secundario {
    // criando uma variavel privada, na privada apenas o metodo nessa classe pode 
    //manipular essa variavel
    private String nomeGarota;
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
