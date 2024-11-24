import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        var num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres numeros ingresados son iguales");   
            }else if (num1 > num2 && num1 > num3){
            System.out.println("El primer numero ingresado " + num1 + " es el numero mayor");
            }else if (num2 > num3){ 
            System.out.println("El segundo numero ingresado " + num2 + " es el numero mayor");
            }else{ 
            System.out.println("El tercer numero ingresado " + num3 + " es el numero mayor");
        }
        scanner.close();
    }
}
