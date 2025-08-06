/*
 * Todo en el Main
 * Isaac Haro, Daniel Arcos, Martin Guerra, Mateo Lincango y Rubens Alarcon*
 */
package ecuación.cuadrática;
import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class EcuaciónCuadrática {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        double raiz1,raiz2;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Ingrese su Ecuación Cuadrática ax^2+bx+c:");
        System.out.println("Ingrese a");
        a=sc.nextInt();
        System.out.println("Ingrese b");
        b=sc.nextInt();
        System.out.println("Ingrese c");
        c=sc.nextInt();
        raiz1=Math.sqrt((Math.pow(b, 2))-(4*a*c));
        System.out.println("X1= "+((-b+raiz1)/(2*a)));
        System.out.println("X2= "+((-b-raiz1)/(2*a)));
        if(((b*b)-(4*a*c))<0||(b*b)-(4*a*c)<0){
            System.out.println("Su raíz es imaginaria, FIN DEL PROGRAMA, compile nuevamente para hacer");
            break;
        }
        }
    }
}
