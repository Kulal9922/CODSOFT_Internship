import java.util.Random;

import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int firstNo = 1;
		int lastNo = 100;
		boolean PlayAgain=true;
		int Score=0;
		
		while(PlayAgain) {
			int randomno = r.nextInt((lastNo - firstNo + 1) + firstNo);
			System.out.println(randomno);

			int attempts = 0;
			boolean Guesscorrect=false;
			
			System.out.println("*****************Welcome the Guess Number Game!*******************");
			System.out.println("Plz Enter the Guess Number between 1 to 100.");
			
			while (attempts < 3) {
				System.out.println("Enter your guess for the generated number");
				int a = sc.nextInt();

				attempts++;

				if (randomno > a) {
					System.out.println("Too low! Try again.");
				} else if (randomno < a) {
					System.out.println("Too high! Try again.");
				} else if(randomno==a){
					System.out.println(
							"Congratulations! You guessed the number are Correct in attempts: " + attempts);
					Guesscorrect=true;
					break;
				}
		}
			
			if(Guesscorrect) {
				Score++;
			}
			if(Score==0) {
				System.out.println("You Cross the maximaum attempts limit!");
				
			}
			System.out.println("Your Max Score is:"+Score);
			System.out.println("Do you want to play again? : ");
			System.out.println("if Yes than Enter 1");
			System.out.println("if No than Enter 0");
	        int PlayerResponse = sc.nextInt();
	        
	        if(PlayerResponse==0) {
	        	PlayAgain=false;
	        	System.out.println("Thanks for playing!");
	        }
		
	}
}
}