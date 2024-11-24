import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        var scanner = new Scanner (System.in);

        System.out.print("Por favor ingrese un numero real: ");
        var numero = scanner.nextInt();

        if (numero < 0) {
            System.out.printf("El numero %d es negativo", numero);
            
        } else if (numero > 0) {
            System.out.printf("El numero %d es positivo", numero);
            
        } else {
            System.out.println("El numero es 0");  
        }

        scanner.close();
    
    }
}