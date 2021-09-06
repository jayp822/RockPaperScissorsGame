package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random num = new Random();
		int start = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want to play rock paper scissors? ");
		int numberOfPlays = input.nextInt();

		do {
			int n2 = num.nextInt(3);
			System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor: ");
			int i = input.nextInt();

			if (n2 == i) {
				System.out.println("It's a tie");
			} else if (n2 == 0 && i == 1 || n2 == 2 && i == 0 || n2 == 1 && i == 2) {
				System.out.println("You win!!!");
			} else if (n2 == 1 && i == 0 || n2 == 0 && i == 2 || n2 == 2 && i == 1) {
				System.out.println("You lose :(");
			}
			start++;
		} while (start < numberOfPlays);
		input.close();
	}
}
