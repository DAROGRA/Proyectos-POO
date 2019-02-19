/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.*;
/**
 *
 * @author daniel rojas
 */
public class palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String palabra,palabraInvertida="";
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        palabra=teclado.next();
        for (int x=palabra.length()-1;x>=0;x--)
            palabraInvertida = palabraInvertida + palabra.charAt(x);
           // System.out.println(palabraInvertida);
            if (palabra.equals(palabraInvertida))
                System.out.println("es un palindromo");
            else
                System.out.println("no es un palindromo");
            
    //    System.out.println(palabra);
        
    }
    
}
