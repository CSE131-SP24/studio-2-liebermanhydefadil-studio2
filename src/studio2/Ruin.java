package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your starting amount: ");
		int startAmount = in.nextInt();
		System.out.println("Enter your win probability : ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("How many days do you want to gamble? ");
		int totalSimulations = in.nextInt();
		for(int i = 0; i < totalSimulations; i++)
		{
		while (startAmount > 0 && startAmount < winLimit)
		{
			double randomNumber = (Math.random()*100 + 1);
		
			if  (randomNumber <= winChance)
			{
				System.out.println("Success!");
				startAmount = startAmount + 1;
				System.out.println("New balance: " + (startAmount));
				
			}
			if (randomNumber > winChance)
			{
				System.out.println("Ruin!");
				startAmount = startAmount - 1;
				System.out.println("New balance: " + (startAmount));
			}
		}
		}
	}

}
