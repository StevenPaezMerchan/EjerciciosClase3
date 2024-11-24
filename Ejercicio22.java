import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer;
        System.out.println("Bienvenido al juego de PIEDRA, PAPEL o TIJERA");
        do {

            play(scanner);
            
            System.out.println("¿Quieres jugar otra ronda?, (S para si, 0 terminar juego)");
            answer = scanner.nextLine().toUpperCase();

        } while (answer.equals("S"));

        System.out.println("Fin del juego!");
        scanner.close();

    }

    public static void play(Scanner scanner){

        String player1 = playerSelection (1,scanner);
        String player2= playerSelection ( 2, scanner);

        winner(player1, player2);

    }

    public static String playerSelection(int playerNumber, Scanner scanner){

        System.out.println("Jugador "+ playerNumber + " Para seleccionar piedra ingrese -> P\nPara seleccionar papel ingrese -> L \nPara seleccionar tijera ingrese -> T");
        return scanner.nextLine().toUpperCase();
    }

    public static void winner(String player1, String player2) {

        if (player1.equals(player2)) {
            System.out.println("Empate");
            return;
        }

        switch (player1) {
            case "P":
                if (player2.equals("L")) {
                    System.out.println("jugador 2 gana (Papel cubre piedra)");
                } else if (player2.equals("T")) {
                    System.out.println("Jugador 1 gana (Piedra rompe tijera)");
                }
                break;
            case "L":
                if (player2.equals("P")) {
                    System.out.println("El jugador 1 gana, (papel cubre piedra)");

                } else if (player2.equals("T")) {
                    System.out.println("Jugador 2 gana (tijeras corta papel)");
                }
            case "T":
                if (player2.equals("P")) {
                    System.out.println("Jugador 2 gana");

                } else if (player2.equals("L")) {
                    System.out.println("jugador 1 gana");
                }

                break;
            default:
                System.out.println("Opacion no valida");
                break;
        }
    }

}
