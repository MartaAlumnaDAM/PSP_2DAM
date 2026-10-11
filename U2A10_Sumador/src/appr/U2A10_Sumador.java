/*
 3. Clase psp.actividades.U2A10_Sumador
Realiza un programa en Java que lea dos números desde la entrada estándar (stdin) y muestre por pantalla el resultado de la suma.

Controla que lo introducido por teclado sean dos números.
 */
package appr;

import java.util.Scanner;

/**
 *
 * @author marta
 */
public class U2A10_Sumador {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       double num1 = 0;
       double num2 = 0;
       double resultado;
       int contador = 0;
       
       
       while(contador < 2){
           
           try{
                //System.out.println("Introduce el numero " + (contador + 1) + ": ");
           
                if(contador == 0){
                    
                    num1 = Double.parseDouble(entrada.nextLine());
                    
                }else{
                    num2 = Double.parseDouble(entrada.nextLine());
                }
                
                contador++;
           
       }catch(Exception e){
           System.out.println("Error: Introduce un numero valido.");
           
       }
           
       }
       
            resultado = num1 + num2;
            System.out.println("El resultado de sumar " + num1 + " + " + num2 + " resulta " + resultado);
      
    }  
    
    
}
