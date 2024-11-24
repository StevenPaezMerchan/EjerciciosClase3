import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("A continuacion, solicitamos su colaboracion ingresando 3 numeros");

        System.out.println("Ingrese el numero 1:");
        var num1 = entrada.nextFloat();
        System.out.println("Ingrese el numero 2:");
        var num2 = entrada.nextFloat();
        System.out.println("Ingrese el numero 3:");
        var num3 = entrada.nextFloat();

        // Valida la condicione que se deben cumplir para formar un triangulo
        if ((num1+num2)>num3 && (num1+num3)>num2 && (num2+num3)> num1) {
                System.out.println("Si se puede formar el triangulo");
        }else{
           System.out.println("No se puede formar el triangulo");
        }
        
        entrada.close();
    }
}
