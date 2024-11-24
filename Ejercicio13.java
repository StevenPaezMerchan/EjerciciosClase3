import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        arriveLate(scanner);

        scanner.close();
    }

    public static void arriveLate(Scanner scanner){

        
        System.out.println("Ingrese el numero del hermano mayor: ");
        int olderBrother = scanner.nextInt();
        System.out.println("Ingrese el numero del hermano del medio: ");
        int middleBrother = scanner.nextInt();
        System.out.println("Ingrese el numero del hermano menor: ");
        int youngerBrother = scanner.nextInt();

        int option = 0;

        switch (option) {
            case 1:
            case 2:
            System.out.println("3");
                break;
        
            case 3:
            System.out.println("Usted es el hermano que va llegar tarde");
                break;

            default:
            System.out.println("Numero invalido");
                break;
        }

    }
}