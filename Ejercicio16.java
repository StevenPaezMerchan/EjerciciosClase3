import java.util.Scanner;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        enterNumber(scanner);
        scanner.close();

        }

        private static void enterNumber (Scanner scanner){

            System.out.println("Ingrese un numero negativo: ");
            double number = scanner.nextDouble();
            int counter = 0;
            while (number < 0) {
                
                System.out.println("Escriba otro numero negativo: ");
                number = scanner.nextDouble();

                counter ++;
            }
            System.out.println("cantidad numeros negativos ingresados: "+counter);
        }
}
