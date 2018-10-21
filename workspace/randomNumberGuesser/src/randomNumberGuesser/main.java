package randomNumberGuesser;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int guess;
		int minRange = 0;
		int maxRange = 10000;
		int number = (int)(Math.random() * maxRange);
		int counter = 0;
		boolean gotIt = false;
		
		while(gotIt == false){
			counter++;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a guess between " + minRange + " and " + maxRange);
			guess = input.nextInt();
			if (guess == number){
				System.out.println("You WIN. It took you " + counter + " guesses.");
				gotIt = true;
			}
			else if(guess < number & guess >= minRange){
				System.out.println("HIGHER");
				minRange = guess;
			}
			else if(guess > number & guess <= maxRange){
				System.out.println("LOWER");
				maxRange = guess;
			}
			else{
				System.out.println("input not in range!");
			}
		}
	}
}
