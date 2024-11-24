import java.util.Random;
//import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
       // Scanner scanner = new Scanner(System.in);

        writeNumbers();
        addPositives(0);
        
    }

    public static void writeNumbers(){

        
        Random random = new Random();
        int positiveSume = 0;
        for (int i = 0; i < 120; i++) {
            System.out.println(random.nextInt(201) - 100);
        
            positiveSume ++;
        }
    
    }

    public static void addPositives(int positiveSume){

        if ( positiveSume > 0) {
            System.out.println("La suma de los numeros es: "+positiveSume);
        }
    }

}
