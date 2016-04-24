//Primeiramente precisamos importar a lib  java.util.Scanner que fará o papel 
//scanner o que o usuario está digitando.
import java.util.Scanner;

        
//Vamos já usar o metodo de input de dados do java, o System.in
public class calculador_basico {
    public static void main (String args[]){ ;
    Scanner hecton = new Scanner (System.in);
    
//Vamos trabalhar agora com algumas variaveis.
    
    double primeiro_numero, segundo_numero, resposta;
    
    System.out.println("Digite o primeiro numero: ");
    primeiro_numero = hecton.nextDouble();
    System.out.println("Digite o Segundo numero: ");
    segundo_numero = hecton.nextDouble();
    resposta = primeiro_numero + segundo_numero;
    System.out.println(resposta);
    
}
    
}
