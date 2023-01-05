import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            // generate a random move between 0 , 1 , 2. The bound is the rps length which is 3

            String playerMove;
            // this while loop will keep going until the player enters the valid letters.
            while (true) {
                System.out.println("Please enter your move (r,p or s)");
                playerMove = scan.nextLine().toLowerCase();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move ( r or p or s)");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {    // it is a tie
                System.out.println("The game is  a tie");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("you lose");
                } else if (computerMove.equals("s")) {
                    System.out.println("you win!");
                }

            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("you win!");
                } else if (computerMove.equals("s")) {
                    System.out.println("you lose!");
                }

            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("you win!");
                } else if (computerMove.equals("r")) {
                    System.out.println("you lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scan.nextLine();

            // if they don't choose y, we assume the player don't want to play again. Therefore, break out of the loop
            if (!playAgain.equals("y")) {
                break;
            }

        }
        // at the end of the program. Close the scanner
        scan.close();
    }
}