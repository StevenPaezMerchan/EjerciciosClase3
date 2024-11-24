import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        conversionMaK(scanner, 0);

        scanner.close();
    }

    public static void conversionMaK(Scanner scanner, double number) {

        System.out.println("Por favor seleccione la opcion que desea realizar");
        System.out.println("1. Millas a kilómetros");
        System.out.println("2. Kilómetros a millas");
        var option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Digite el numero de millas: ");
                double number1 = scanner.nextDouble();
                double operation1 = number1 * 1.60934;

                System.out.println(number1 + " millas a kilometros son: " + operation1 + " km");
                break;
            case 2:
                System.out.println("Digite el numero de kilometros: ");
                double number2 = scanner.nextDouble();
                double operation2 = number2 * 0.621371;

                System.out.println("kilometros a millas son: " + operation2 + " millas");
                break;
            default:
                System.out.println("opcion invalida.");
                break;
        }

    }
}
