import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int num = entrada.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {
            System.out.printf("El numero %d es divisible por 2 y 7", num);
            
        } else if(num % 2 == 0){
            System.out.printf("El numero %d es divisble por 2", num);

        } else if (num % 7 == 0) {
            System.out.printf("El numero %d es divisble por 7", num);
        }
        else{
            System.out.printf("El numero %d NO ES DIVISIBLE por 2 y 7", num);
        }
        entrada.close();
    }
}