/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import aprendizadojava.Muitos_metodos_instancias_secundario;
//import aprendizadojava.Muitos_metodos_instancias_secundario;
import java.util.Scanner;
//package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Muitos_metodos_instancias {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Muitos_metodos_instancias_secundario Muitos_metodos_instancias_secundarioObject = new Muitos_metodos_instancias_secundario();
        System.out.println("Coloque o nome da sua namorada aqui: ");
        String temporariaMemoria = input.nextLine();
        Muitos_metodos_instancias_secundarioObject.setNome(temporariaMemoria);
        Muitos_metodos_instancias_secundarioObject.falando();
        
        
                }
    
}
