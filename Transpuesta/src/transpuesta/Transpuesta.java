/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpuesta;
import java.util.*;

/**
 *
 * @author daniel rojas
 */
public class Transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
  // int y;
  Scanner entrada = new Scanner(System.in);
  System.out.print("digite la dimencion de la matriz");
  n = entrada.nextInt();

  int Matriz[][] = new int[n][n];

  for (int i = 0; i < Matriz.length; i++) {
   for (int j = 0; j < Matriz[0].length; j++) {
       Matriz[i][j] = (int) (Math.random()*10);
    

   }

  }
  System.out.println("Matriz Origunal");
  for (int i = 0; i < Matriz.length; i++) {
   for (int j = 0; j < Matriz[0].length; j++) {
    
    System.out.print(Matriz[i][j]);
    
   }
   
   System.out.println();

  }
  System.out.println("Matriz Transpuesta");
  for (int i = 0; i < Matriz.length; i++) {
  
   for (int j = 0; j < Matriz.length; j++) {
    
    System.out.print(Matriz[j][i]);

   }
   
   System.out.println();

  }

 }

}
    
