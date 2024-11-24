import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);

        System.out.println("Por favor digite una letra");
        char letra = entrada.next().charAt(0);
        
        switch (Character.toLowerCase(letra)) {
            case 'a':
            case 'e':
            case 'i': 
            case 'o':
            case 'u':
                System.out.println("La letra '"+letra+"' es una vocal");
                break;
        
            default:
                System.out.println("La letra '"+letra+"' es una consonante");
                break;
        }

        entrada.close();

    }
}
