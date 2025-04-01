package wordlegame;

import java.util.Scanner;

public class Wordle{
    private String secretWord;
    private int attempts;

    public Wordle(String secretWord, int attempts){
        this.secretWord = secretWord;
        this.attempts = attempts;
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);
        int currentAttempt = 0;

        while(currentAttempt < attempts){

           System.out.println("Attempt %d of %d, Enter Your Guess Word: ");
           String guessWord = scanner.nextLine().toUpperCase();

            if(guessWord.length()!=secretWord.length()){

                System.out.println("You must enter a word with " + secretWord + " characters!");
                continue;
            }
            if (guessWord.equals(secretWord)){

                System.out.println("Congratulations! You have guessed it correctly!");
                return;
            }

            String feedback = getFeedback();
            currentAttempt++;
        }
    }
    private String getFeedback(){

        return feedback
    }
}