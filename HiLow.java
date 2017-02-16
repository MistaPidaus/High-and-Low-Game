import java.util.Scanner; //Required Scanner package in order to use Scanner

public class HiLow {

	public static void main(String[] args) {
		// Starting main

		//Declare an input/scanner
		Scanner scan = new Scanner(System.in);
		
		//User replies
		String playAgain = "";
		
		do {
			
			//Random Number Function
			int thisNumber = (int)(Math.random()*100 + 1);
			
			//Guess the Number!
			int guess = 0;
			
			//Number of trying to guess
			int numberTries = 0;
			
			//Instruction for user
			System.out.println("Guess a number between 1 and 100:");
			while ( guess != thisNumber ){
				
				//Input from user
				guess = scan.nextInt();
				
				//Count number of retry
				numberTries++;
				
				//If its low?
				if (guess < thisNumber)
					System.out.println(guess + " is too low. Try again!");
				//If its high?
				else if (guess > thisNumber)
					System.out.println(guess + " is too high. Try again!");
				//if its correct?
				else
					System.out.println(guess + " is correct! Congratulations!");
			}
			System.out.println("It took you " + numberTries + " tries!\n");
			
			//Ask the user
			System.out.println("Would you like to play again? (y/n)");
			//Input by user
			playAgain = scan.next();
		} while(playAgain.equalsIgnoreCase("y")); //Ignore if user input Y. other than Y, quit.
		
		//Greets Users!
		System.out.println("Thanks for playing! Goodbye.");
		
		//We need to close our input
		scan.close();
		
	}

}
