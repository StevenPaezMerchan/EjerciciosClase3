import java.util.Random;
//import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
    
       Random random = new Random();
       //Almacenar los 120 numeros a generar en un arreglo
       int [] numbers = new int [120];
       int positiveSume = 0;
       int positiveCounter = 0;
       int negativeSume = 0;
       int negativeCounter = 0;
       int ceroCounter = 0;

       for (int i = 0; i < 120; i++) {
           numbers[i] = random.nextInt(201) - 100;
           System.out.println(numbers[i]);
       }

       for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > 0) {
            positiveSume += numbers[i];
            positiveCounter++;

        }else if (numbers[i] < 0) {
            negativeSume += numbers[i];
            negativeCounter++;

        }else{
            ceroCounter++;
        }
        
       }
       System.out.println("La suma de los numeros positivos es: "+positiveSume);
       System.out.println("La suma de los numeros negativos es: "+negativeSume);
       System.out.println("La cantidad de ceros es: "+ceroCounter);
       System.out.println("Media de los numeros positivos: "+ positiveSume / positiveCounter);
       System.out.println("Media de los numeros negativos: "+ negativeSume / negativeCounter);
    } 

}
