import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < number; i++) {
            System.out.println("Fibonacci: "+fibonnaci(i));
        }
    }

    public static int fibonnaci(int number){

        if (number ==0 || number == 1) {
            return number;
            
        }else
            return fibonnaci(number-1)+fibonnaci(number-2);
    }
    
}
