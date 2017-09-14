/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
 import java.util.Scanner;
public class pruea {
    public static void main(String[] args) {
        
    Scanner numero= new Scanner(System.in);
        double base = 0;
        double altura=0;
        double area;
        int aux;
    
   do { 
          try{
              aux=0;
              System.out.println("Ingrese la base del rectangulo");
              base = numero.nextInt();
          }catch(Exception e){
              
           System.out.println("Letras no son validas");
           aux=1;
           numero.nextLine();
          
          }
   } while (aux!=0 || base<=0);
    
    do { 
          try{
              aux=0;
              System.out.println("Ingrese la altura del rectangulo");
              altura = numero.nextInt();
          }catch(Exception e){
              
           System.out.println("Letras no son validas");
           aux=1;
           numero.nextLine();
          
          }
   } while (aux!=0 || altura<=0);
              
         

         area=base*altura;
         System.out.println("La area de el rectangulo es: "+area);
      }
}

