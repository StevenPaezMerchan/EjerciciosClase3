import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       numberCubed(scanner);

        scanner.close();
    }

    public static void numberCubed(Scanner scanner){

        System.out.println("por favor ingrese un numero: ");
        var number = scanner.nextDouble();

        while (number > 0) {

            var cubo = number * number * number;
            System.out.println(cubo);
            System.out.println("introduzca otro numero");
            number = scanner.nextDouble();
            
        }
        System.out.println("Fin del programa");
    }

}