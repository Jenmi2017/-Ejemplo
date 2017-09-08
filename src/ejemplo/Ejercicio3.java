package ejemplo;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio3 {
          public static void main(String[] args) {
          double a;  
          double b;
          double i;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cateto o: ");
        a = leer.nextDouble();
        double ra = (double) Math.pow(a, 2);
        System.out.println("Ingrese cateto a: ");
         b = leer.nextDouble();
         double rb = (double) Math.pow(b, 2);
         i = ra + rb;
         double t = (double)  Math.sqrt(i);
         DecimalFormat forma = new DecimalFormat("##.##");
        System.out.println("La hipotenusa del triangulo es:  " +forma.format(t));
}
}
