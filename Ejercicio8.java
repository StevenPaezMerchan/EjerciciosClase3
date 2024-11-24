import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero entero ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Edad no valida");
            
        }else if (numero <= 5) {
            System.out.println("Primera infancia");
        
        }else if (numero <=11) {
            System.out.println("Infancia");
            
        }else if ( numero <=18) {
            System.out.println("Adolescencia");
            
        }else if ( numero <=26) {
            System.out.println("Juventud");
            
        }else if (numero <= 59) {
            System.out.println("Adultez");
            
        }else {
            System.out.println("Persona mayor");
        }

        entrada.close();

         /*if (numero > 0 && numero <= 5) {
            System.out.println("Primera infancia");
        
        }else if (numero >=6 && numero <=11) {
            System.out.println("Infancia");
            
        }else if (numero >=12 && numero <=18) {
            System.out.println("Adolescencia");
            
        }else if (numero >= 19 && numero <=26) {
            System.out.println("Juventud");
            
        }else if (numero >= 27 && numero <= 59) {
            System.out.println("Adultez");
            
        }else if (numero > 59) {
            System.out.println("Persona mayor");
        }else{
            System.out.println("Numero invalido");
        }*/
    }
}
