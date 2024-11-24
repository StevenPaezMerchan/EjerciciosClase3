import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero de camisas: ");
        var ncamisas = entrada.nextInt();

        if (ncamisas < 0) {
            System.out.println("Numero invalido");
            
        } else if (ncamisas <= 50) {
            System.out.printf("El precio de %d camisas por unidad es de $50.000 ", ncamisas);
            
        } else if (ncamisas <=100) {
            System.out.printf("El precio de %d camisas por unidad es de $45.000", ncamisas);
            
        } else if (ncamisas <= 150) {
            System.out.printf("El precio de %d camisas por unidad es de $40.000", ncamisas);

        } else if (ncamisas <= 200) {
            System.out.printf("El precio de %d camisas por unidad es de $35.000", ncamisas);

        } else{
            System.out.printf("El precio de %d camisas por unidad es de $25.000", ncamisas);
            
        }

        entrada.close();

    }
}
