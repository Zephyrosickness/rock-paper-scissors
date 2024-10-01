import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {

        //input/output player1
        System.out.println("PLAYER 1: Enter Rock/Paper/Scissors");
        String playerOneInput = validCheck();


        //input/output player2
        System.out.println("PLAYER 2: Enter Rock/Paper/Scissors");
        String playerTwoInput = validCheck();

        //PLAYER 1 ROCK
        if (playerOneInput.equalsIgnoreCase("Rock")) {

            if (playerTwoInput.equalsIgnoreCase("Rock")) {
                //PLAYER 1 ROCK PLAYER 2 ROCK
                System.out.println("Tie!");
            } else if (playerTwoInput.equalsIgnoreCase("Paper")) {
                //PLAYER 1 ROCK PLAYER 2 PAPER
                System.out.println("Player 2 wins!");
            } else if (playerTwoInput.equalsIgnoreCase("Scissors")) {
                //PLAYER 1 ROCK PLAYER 2 SCISSORS
                System.out.println("Player 1 wins!");
            }

            //PLAYER 1 PAPER
        } else if (playerOneInput.equalsIgnoreCase("Paper")) {

            if (playerTwoInput.equalsIgnoreCase("Rock")) {
                //PLAYER 1 PAPER PLAYER 2 ROCK
                System.out.println("Player 1 wins!");
            } else if (playerTwoInput.equalsIgnoreCase("Paper")) {
                //PLAYER 1 PAPER PLAYER 2 PAPER
                System.out.println("Tie!");
            } else if (playerTwoInput.equalsIgnoreCase("Scissors")) {
                //PLAYER 1 PAPER PLAYER 2 SCISSORS
                System.out.println("Player 2 wins!");
            }

            //PLAYER 1 SCISSORS
        } else if (playerOneInput.equalsIgnoreCase("Scissors")) {

            if (playerTwoInput.equalsIgnoreCase("Rock")) {
                //PLAYER 1 SCISSORS PLAYER 2 ROCK
                System.out.println("Player 2 wins!");
            } else if (playerTwoInput.equalsIgnoreCase("Paper")) {
                //PLAYER 1 SCISSORS PLAYER 2 PAPER
                System.out.println("Player 1 wins!");
            } else if (playerTwoInput.equalsIgnoreCase("Scissors")) {
                //PLAYER 1 SCISSORS PLAYER 2 SCISSORS
                System.out.println("Tie!");
            }
        }
    }

    public static String validCheck(){
        //init var
        String[] OPTIONS = {"Rock", "Paper", "Scissors"};
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        String input;

        do{
            input = scan.next();
            for(String i:OPTIONS){
                if(input.equalsIgnoreCase(i)){
                    valid = true;
                }
            }
            if(!valid){
                System.out.println("Invalid input. Try again.");
            }
        }while(!valid);

        return input;
    }
}
