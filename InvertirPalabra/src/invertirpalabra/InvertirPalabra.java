
package invertirpalabra;
import java.util.*;
/**
 *
 * @author daniel rojas
 */
public class InvertirPalabra {

   
    public static void main(String[] args) {
        String palabra;
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese una frase");
        palabra=teclado.nextLine();
      //  System.out.println(palabra);
        String [] matriz=palabra.split(" ");
        for(int i=matriz.length-1;i>=0;i--){
            System.out.print(matriz[i]+" ");
        }
        
    }
    
}
