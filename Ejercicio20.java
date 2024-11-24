public class Ejercicio20 {

    public static void main(String[] args) {

        int boardSize = 8;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }

            }
            System.out.println("|");
        }

    }
}
