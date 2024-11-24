import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
    
        var entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese una letra");
        char letra = entrada.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra "+letra+" es mayuscula");
        }else{
            System.out.println("Su letra "+letra+" es miniscula");
        }
        entrada.close();
    }
}
