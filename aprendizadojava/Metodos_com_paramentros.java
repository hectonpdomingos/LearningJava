
import aprendizadojava.Metodos_com_paramentros_secundario;
import java.util.Scanner;

package aprendizadojava;

/**
 *
 * @author Hecton
 */
public class Metodos_com_paramentros {
    public static void main (String[] args){
        
      Scanner input = new Scanner(System.in);
Metodos_com_paramentros_secundario  Metodos_com_paramentros_secundarioObject = new Metodos_com_paramentros_secundario ();
        
        System.out.println("Seu nome aqui: ");
        String name = input.nextLine();
        
        Metodos_com_paramentros_secundarioObject.menssagemsimples(name);
    }
    
}
