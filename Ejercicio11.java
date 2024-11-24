import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        requestNumbers(entrada);
       
        entrada.close();
    }

    public static void requestNumbers(Scanner entrada){

        System.out.println("Por favor introduzca 3 numeros");
        System.out.println("Numero 1: ");
        int num1 = entrada.nextInt();
        System.out.println("Numero 2: ");
        int num2 = entrada.nextInt();
        System.out.println("Numero 3: ");
        int num3 = entrada.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("Los numeros son iguales");
            
        }else if (num1 > num2 && num2 > num3) {
                System.out.println("Los numero son: "+num3+num2+num1);
                
        }else if (num2 > num1 && num1 > num3) {
            System.out.println("Los numeros son: "+num3+num1+num2);
            
        }else if (num3 > num1 && num1 > num2) {
            System.out.println("Los numeros son: "+num2+num1+num3);
            
        }else {
            System.out.println("Los numeros son:: "+num1+num2+num3);
        }

        }
        
    }
