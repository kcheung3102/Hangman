import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int count = 0;
	 String[] wordList = new String[]{"tree","rain","bear","encourage","promise","soup","chess", "insurance","pancakes","stream"};
	 String word = wordList[(int)(Math.random() * wordList.length)];
	 Scanner input = new Scanner(System.in);
	 String wordToGuess;
	 String userInput = "";
	 String[] underScore = new String[word.length()];
		for(int i = 0; i < wordList.length;i++) {
			underScore[i] = "_";
		}
		HashSet<Character> lettersGuessed = new HashSet<>();

		do{
			System.out.println("Welcome lets play hangman!");
			System.out.println("Here is the word I am thinking of: ");
			wordToGuess = "";
			for(int i = 0; i < underScore.length;i++) {
				System.out.println(underScore[i]);
			}
			System.out.println("\nEnter your guess: ");
			userInput = input.nextLine();


			if(userInput.length() != 1) {
				System.out.println("Invalid guess " + userInput);
			} else if(lettersGuessed.contains(userInput.charAt(0))) {
				System.out.println("you already guessed this letter");
			} else if (word.contains(userInput)) {
				lettersGuessed.add(userInput.charAt(0));
				wordToGuess = "";
				for(int i = 0; i < wordToGuess.length(); i++) {
					if(wordToGuess.charAt(i) == userInput.charAt(0)) {
						underScore[i] = "" + userInput.charAt(0);
					} else if(wordToGuess.charAt(i) ) {

					}
					wordToGuess += underScore[i];
				}
			}
			if(wordToGuess.equals(word))
				break;



		 	System.out.println("");
	 } while(count < 6 && underScore.contains("_"));
    }
}
