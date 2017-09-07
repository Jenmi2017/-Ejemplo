package ejemplo;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        a = leer.nextDouble();
        System.out.println("Ingrese un numero: ");
        b = leer.nextDouble();
        if(a==b){
            c = a + b;
            System.out.println("La suma de" +a+ "+" +b+ "es: "+c);
        }else{
            c = a*b;
            System.out.println("El producto de los numeros es: "+c);        
        }
    }
}
