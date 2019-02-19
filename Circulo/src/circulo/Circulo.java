package circulo;
import java.util.*;
/**
 *
 * @author daniel rojas
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x1, x2, y1, y2, r1, r2, sumarad;
        double distancia;
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("ingrese las cordenadas de x1:");
        x1 = teclado.nextInt();
        System.out.println("ingrese las cordenadas de y1:");
        y1 = teclado.nextInt();
        System.out.println("ingrese el radio del primer circulo:");
        r1 = teclado.nextInt();
        System.out.println("ingrese las cordenadas de x2:");
        x2 = teclado.nextInt();
        System.out.println("ingrese las cordenadas de y2:");
        y2 = teclado.nextInt();
        System.out.println("ingrese el radio del segundo circulo:");
        r2 = teclado.nextInt();
        
        distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
        sumarad = r1 + r2;
        
        if (distancia <= sumarad){
            System.out.println("hay una intersecccion en los circulos");
        }
        else{
            System.out.println("no hay interseccion en los circulos");
        }
        
    }
}
    

