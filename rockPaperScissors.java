import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //input/output player1
        System.out.println("PLAYER 1: Enter Rock/Paper/Scissors");
        String playerOneInput = scan.next();

        //error check
        while (playerOneInput.equals("X")){
            System.out.println("Sorry, that isn't a valid input. Try again.");
            playerOneInput = scan.next();
            playerOneInput = misc.rockPaperScissorsCase(playerOneInput); //TODO: bruh just use equalsignorecase instead of this dumb method bs
        }

        //input/output player2
        System.out.println("PLAYER 2: Enter Rock/Paper/Scissors");
        String playerTwoInput = scan.next();
        playerTwoInput = misc.rockPaperScissorsCase(playerTwoInput);

        //error check
        while (playerTwoInput.equals("X")){
            System.out.println("Sorry, that isn't a valid input. Try again.");
            playerTwoInput = scan.next();
            playerTwoInput = misc.rockPaperScissorsCase(playerTwoInput);
        }


        switch(playerOneInput){
            //PLAYER 1 ROCK
            case "R":
                switch (playerTwoInput) {
                    case "R":
                        //PLAYER 1 ROCK PLAYER 2 ROCK
                        System.out.println("Tie!");
                        break;
                    case "P":
                        //PLAYER 1 ROCK PLAYER 2 PAPER
                        System.out.println("Player 2 wins!");
                        break;
                    case "S":
                        //PLAYER 1 ROCK PLAYER 2 SCISSORS
                        System.out.println("Player 1 wins!");
                        break;
                }
                break;
            //PLAYER 1 PAPER
            case "P":
                switch (playerTwoInput) {
                    case "R":
                        //PLAYER 1 PAPER PLAYER 2 ROCK
                        System.out.println("Player 1 wins!");
                        break;
                    case "P":
                        //PLAYER 1 PAPER PLAYER 2 PAPER
                        System.out.println("Tie!");
                        break;
                    case "S":
                        //PLAYER 1 PAPER PLAYER 2 SCISSORS
                        System.out.println("Player 2 wins!");
                        break;
                }
                break;
            //PLAYER 1 SCISSORS
            case "S":
                switch (playerTwoInput) {
                    case "R":
                        //PLAYER 1 SCISSORS PLAYER 2 ROCK
                        System.out.println("Player 2 wins!");
                        break;
                    case "P":
                        //PLAYER 1 SCISSORS PLAYER 2 PAPER
                        System.out.println("Player 1 wins!");
                        break;
                    case "S":
                        //PLAYER 1 SCISSORS PLAYER 2 SCISSORS
                        System.out.println("Tie!");
                        break;
                }
                break;
        }
    }
}
