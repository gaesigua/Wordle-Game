package wordlegame;

import java.util.Scanner;

public class Wordle{
    private String secretWord;
    private int attempts;

    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while(remainingAttempts > 0){

            System.out.println("Attempt #: " + remainingAttempts);
            System.out.println("Enter Your Guess Word: ");

            String guessWord = scanner.nextLine();

            if (guessWord.length() != secretWord.length()){
                System.out.println("Invalid Entry! The word should have " + secretWord.length() + " characters!");
                continue;
            }

            int correctPositions= 0;
            int correctChars=0;

            for (int i = 0; i < secretWord.length(); i++) {
                char character = guessWord.charAt(i);

                if (character == secretWord.charAt(i)){

                    correctPositions++;

                } else if (secretWord.indexOf(character) >= 0) {

                    correctChars++;
                }
            }
            if (correctPositions==secretWord.length()){
                System.out.println("Congrats! You have guessed the word correctly! The secret word was: " + secretWord);
                break;
            }else {
                System.out.println("Correct positions: " + correctPositions);
                System.out.println("Correct characters: " + correctChars);
                remainingAttempts--;
            }
        }

            if (remainingAttempts==0){
                System.out.println("You have run out of Attempts! come back tomorrow!");
            }
    }
}