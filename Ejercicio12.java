import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        splitWatermelon(scanner);

        scanner.close();
    }
    
    public static void splitWatermelon(Scanner scanner){

        System.out.println("Ingrese el peso de la sandia en Kilogramos: ");
        double weight = scanner.nextDouble();

        if (weight % 2 == 0) {
            System.out.println("SI ");
            
        } else{
            System.out.println("NO");
        }
    }
}
