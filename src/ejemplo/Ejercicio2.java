package ejemplo;
 import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
          double a;  
          double b;
           
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        a = leer.nextDouble();
        System.out.println("Ingrese la la altura del rectangulo: ");
         b = leer.nextDouble();
        System.out.println("El area del rectangulo: " + (a*b));
    }
}
