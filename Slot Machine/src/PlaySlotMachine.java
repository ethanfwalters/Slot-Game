import java.util.*;
public class PlaySlotMachine
	{
		public static int tokens, choice;
		static String name;
		static boolean gameContinues;
		public static void main(String[] args)
			{
			greetUser();
			createSlotMachine.addSymbols();
			while (gameContinues)
				{
				takeTokens();
				createSlotMachine.pullLever();
				createSlotMachine.determineProfit();
				askForContinue();
				}
			}
		private static void greetUser()
			{
			Scanner userName = new Scanner(System.in);
			System.out.println("What is your name?");
			name = userName.nextLine();
			System.out.println("\nWelcome, " + name + ", to the Incredibly Unfair Slot Machine! You have 500 tokens to spend.");
			tokens = 500;
			gameContinues = true;
			System.out.println("It costs 3 tokens to bet on the middle row, 5 tokens to bet on the outside rows, or 7 tokens to bet on all three rows AND diagonals.");
			
			}
		private static void takeTokens()
			{
			System.out.println();
			System.out.println("How much do you want to bet?");
			System.out.println("1: Bet 3 tokens.");
			System.out.println("2: Bet 5 tokens.");
			System.out.println("3: Bet 7 tokens.");
			Scanner userBet = new Scanner(System.in);
			choice = userBet.nextInt();
			System.out.println();
			if (tokens > 0)
				{
					switch (choice)
					{
						case  1:
								{
									System.out.println("Okay, you will be looking at just the middle row.");
									tokens -= 3;
									createSlotMachine.middle = true;
									break;
								}
						case 2:
								{
									System.out.println("Okay, you will be looking at the outside rows.");
									tokens -= 5;
									createSlotMachine.outside = true;
									break;
								}
						case 3:
								{
									System.out.println("Okay, you will be looking at all of the rows including diagonals.");
									tokens -=7;
									createSlotMachine.all = true;
									break;
								}
						default:
								{
									System.out.println("That isn't a valid choice. Try again.");
									takeTokens();
									break;
								}
					}
				}
			else
				{
				System.out.println("You have no tokens left to spend! You'll have to come back later for more.");
				gameContinues = false;
				}
			}
		private static void askForContinue()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("You still have " + tokens + " tokens left. Do you want to spin again?");
			System.out.println("1: Yes.");
			System.out.println("2: No.");
			choice = userInput.nextInt();
			switch (choice)
				{
					case 1:
							{
							gameContinues = true;
							break;
							}
					case 2:
							{
							System.out.println("Alright, you ended with " + tokens + ".");
							gameContinues = false;
							break;
							}
					default:
							{
								System.out.println("That isn't a valid choice. Try again.");
								askForContinue();
								break;
							}
				}
			}

	}
