public class misc {
    //allows players to type rock/paper/scissors regardless of case
    //"why not use equalsignorecase in main" BECAUSE ITS A SWITCH STATEMENT im too tired to rewrite it
    public static String rockPaperScissorsCase(String input){
        if(input.equalsIgnoreCase("Rock")){
            input = "R";
        }else if(input.equalsIgnoreCase("Paper")){
            input = "P";
        }else if(input.equalsIgnoreCase("Scissors")){
            input = "S";
        }else{
            input = "X";
        }
        return input;
    }
}
