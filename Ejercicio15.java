import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        enterNumber(scanner);

        scanner.close();
    }

    public static void enterNumber(Scanner scanner){

        System.out.println("Por favor ingrese un numero: ");
        var number = scanner.nextDouble();

       while (number != 0) {
        
            if (number > 0) {
                System.err.println("Numero positivo");
                
            }else{
                System.out.println("Numero negativo");
            }
            System.out.println("ingrese otro numero: ");
            number = scanner.nextDouble();
       }

       System.out.println("Fin del programa");
        
    }
}
