import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        findBrother(scanner);

        scanner.close();
    }

    public static void findBrother(Scanner scanner){
        int youngerBrother = 3;

        System.out.println("Ingrese el numero de los hermanos que llegan a tiempo: ");
        int olderBrother = scanner.nextInt();
        int middleBrother = scanner.nextInt();

        if (olderBrother != 1 && middleBrother != 2) {
            System.out.println("Numero invalido!");
        }else if (olderBrother == middleBrother) {
            System.out.println("Los numeros digitados son iguales");
            
        }else if (olderBrother < middleBrother && middleBrother < youngerBrother) {
            System.out.println(youngerBrother); 
        }else{
            System.out.println("Numero invalido!");
        }
    }

}