
package ejemplo;

public class Ejercicio6 {
    public static void main(String[] args) {
        boolean sw;
        int contador = 0;
        System.out.println("Los Primeros 100 numeros primos: ");
        for(int i=0; i<523;i++){
            sw=true;
            for(int j =i; j>0 ;j--){
        if(i % j == 0 && j !=i && j !=1){
            sw=false;
            break;
        }
    }
        if(sw){
            System.out.println(i+",");
            contador++;
        }
    }
        System.out.println("Hay numeros primos"+contador);
}
}