import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {
        //init var
        final String[] PLAYER_OPTIONS = {"Rock", "Paper", "Scissors"};
        final String[] EXIT_OPTIONS = {"Yes","No"};
        boolean exit = false;
        do {
            //input/output player1
            System.out.println("PLAYER 1: Enter Rock/Paper/Scissors");
            String playerOneInput = validCheck(PLAYER_OPTIONS);


            //input/output player2
            System.out.println("PLAYER 2: Enter Rock/Paper/Scissors");
            String playerTwoInput = validCheck(PLAYER_OPTIONS);

            //PLAYER 1 ROCK---
            if (playerOneInput.equalsIgnoreCase("Rock")) {
                //PLAYER 1 ROCK PLAYER 2 ROCK
                if (playerTwoInput.equalsIgnoreCase("Rock")) {System.out.println("Tie!");

                //PLAYER 1 ROCK PLAYER 2 PAPER
                }else if(playerTwoInput.equalsIgnoreCase("Paper")) {System.out.println("Player 2 wins!");

                //PLAYER 1 ROCK PLAYER 2 SCISSORS
                }else if(playerTwoInput.equalsIgnoreCase("Scissors")) {System.out.println("Player 1 wins!");}


                //PLAYER 1 PAPER---
            } else if (playerOneInput.equalsIgnoreCase("Paper")) {

                //PLAYER 1 PAPER PLAYER 2 ROCK
                if (playerTwoInput.equalsIgnoreCase("Rock")) {System.out.println("Player 1 wins!");

                //PLAYER 1 PAPER PLAYER 2 PAPER
                }else if(playerTwoInput.equalsIgnoreCase("Paper")) {System.out.println("Tie!");

                //PLAYER 1 PAPER PLAYER 2 SCISSORS
                }else if(playerTwoInput.equalsIgnoreCase("Scissors")) {System.out.println("Player 2 wins!");}


                //PLAYER 1 SCISSORS---
            } else if (playerOneInput.equalsIgnoreCase("Scissors")) {

                //PLAYER 1 SCISSORS PLAYER 2 ROCK
                if (playerTwoInput.equalsIgnoreCase("Rock")) {System.out.println("Player 2 wins!");

                //PLAYER 1 SCISSORS PLAYER 2 PAPER
                }else if(playerTwoInput.equalsIgnoreCase("Paper")) {System.out.println("Player 1 wins!");

                //PLAYER 1 SCISSORS PLAYER 2 SCISSORS
                }else if(playerTwoInput.equalsIgnoreCase("Scissors")) {System.out.println("Tie!");}
            }

            System.out.println("Play again? [Y/N]");
            String option = validCheck(EXIT_OPTIONS);
            if (option.equalsIgnoreCase("No")) {
                exit = true;
            }

        }while (!exit);
    }

    public static String validCheck(final String[] OPTIONS){
        //init var
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        String input = scan.next();

        do{
            for(String i:OPTIONS){
                if(input.equalsIgnoreCase(i)){ //runs through all 3 options and sees if input is equal to them
                    //unfortunately when casting an array to an arraylist so you |EDIT: what was i trying to say here lmao this comment was literally left unfinished
                    valid = true;
                }else{
                    if (input.equalsIgnoreCase(String.valueOf(i.charAt(0)))){
                        //EX: if player inputs R, automatically correct to "Rock"
                        input = i;
                        valid = true;
                    }
                }
            }
            if(!valid){
                System.out.println("Invalid input. Try again.");
                input = scan.next();
            }
        }while(!valid);

        return input;
    }
}
