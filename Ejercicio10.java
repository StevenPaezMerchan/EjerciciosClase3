import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        requestNumber(scanner);
        
        scanner.close();
    }

    public static void requestNumber (Scanner scanner){

        System.out.println("ingrese un numero entero entre el 1 - 12: ");
        int number = scanner.nextInt();

            switch (number) {
                case 1 : 
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :        
                    System.out.println(": 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(": 30");
                    break;
                case 2:
                    System.out.println(": 28");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            } 
        }

    }