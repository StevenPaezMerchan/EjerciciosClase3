import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero: ");
        var numero = scanner.nextDouble();
        var operacion = numero / 2;

        if (numero % 2 == 0 ) {
            System.out.println("El numero "+ numero + " es par");
            System.out.println("Resultado de la operacion: "+operacion);
            
        } else{
            System.out.println("El numero "+ numero +" es impar");
            System.out.println("Resultado de la operacion: "+operacion);
        }

        scanner.close();
        
    }
}