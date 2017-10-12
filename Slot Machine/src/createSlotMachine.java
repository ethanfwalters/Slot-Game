import java.util.*;
import java.util.concurrent.TimeUnit;
public class createSlotMachine
	{
		public static String [][] blankSpace = new String [3][3];
		public static String [][] machineName = new String[3][3];
		public static int [][] machineValue = new int [3][3];
		public static int payout;
		public static ArrayList <Symbol> symbols = new ArrayList <Symbol>();
		public static boolean middle, outside, all;
		public static void main(String[] args)
			{
			all = true;
			createBlankSpace();
			addSymbols();
			pullLever();
			determineProfit();
			}

		private static void createBlankSpace()
			{
				for(int r = 0 ; r < 3 ; r++){
					for(int c = 0 ; c < 3 ; c++){
						blankSpace[r][c] = "     ";
					}
				}
				
			}

		public static void addSymbols()
			{
			
				symbols.add(new Symbol("zesty", 60, 22.5, false, 1));
				symbols.add(new Symbol("world", 25, 40.0, false, 1));
				symbols.add(new Symbol("yucky", 185, 12.0, false, 1));
				symbols.add(new Symbol("zippy", 500, 5.0, false, 1));
				symbols.add(new Symbol("wrath", 1750, 2.5, false, 1));
				symbols.add(new Symbol("frodo", 12000, 1.0, false, 1));
				symbols.add(new Symbol("youth", 25000, .5, false, 1));
				symbols.add(new Symbol("vowel", 750, 1.5, false, 1));
				symbols.add(new Symbol("urban", 125, 12.5, false, 1));
				symbols.add(new Symbol("aglet", 50000, .1, false, 1));
				symbols.add(new Symbol("vegie", 350, 2.6, false, 1));
				
			}
		
		public static void pullLever()
			{
			System.out.print("Spinning");
			for (int dot = 0; dot < 5; dot++)
				{
				try
					{
						TimeUnit.SECONDS.sleep(1);
					} 
				catch (InterruptedException e)          
					{
						e.printStackTrace();
					}
				System.out.print(". ");
				}
			System.out.println("");
			System.out.println();
			System.out.println("			Here is the slot machine: ");
			System.out.println("");
			payout = 0;
			for (int row = 0; row < 3; row++)
				{
				for (int col = 0; col < 3; col++)
					{
						double spin = (double)(Math.random()*100.0 + .1);
						if (spin < 22.5)
							{
								machineName [row][col] = symbols.get(0).getName();
								machineValue [row][col] = symbols.get(0).getValue();
							}
						else if (spin >=22.5 && spin < 62.5)
							{
								machineName [row][col] = symbols.get(1).getName();
								machineValue [row][col] = symbols.get(1).getValue();
							}
						else if (spin >= 62.5 && spin < 74.5)
							{
								machineName [row][col] = symbols.get(2).getName();
								machineValue [row][col] = symbols.get(2).getValue();
							}
						else if (spin >= 74.5 && spin < 79.5)
							{
								machineName [row][col] = symbols.get(3).getName();
								machineValue [row][col] = symbols.get(3).getValue();
							}
						else if (spin >= 79.5 && spin < 82.0)
							{
								machineName [row][col] = symbols.get(4).getName();
								machineValue [row][col] = symbols.get(4).getValue();
							}
						else if (spin >= 82.0 && spin < 83.0)
							{
								machineName [row][col] = symbols.get(5).getName();
								machineValue [row][col] = symbols.get(5).getValue();
							}
						else if (spin >= 83.0 && spin < 83.5)
							{
								machineName [row][col] = symbols.get(6).getName();
								machineValue [row][col] = symbols.get(6).getValue();
							}
						else if (spin >= 83.5 && spin < 85.0)
							{
								machineName [row][col] = symbols.get(7).getName();
								machineValue [row][col] = symbols.get(7).getValue();
							}
						else if (spin >= 85.0 && spin < 97.5)
							{
								machineName [row][col] = symbols.get(8).getName();
								machineValue [row][col] = symbols.get(8).getValue();
							}
						else if (spin >= 97.5 && spin < 97.6)
							{
								machineName [row][col] = symbols.get(9).getName();
								machineValue [row][col] = symbols.get(9).getValue();
							}
						else
							{
								machineName [row][col] = symbols.get(10).getName();
								machineValue [row][col] = symbols.get(10).getValue();
							}
					}
				}
			for (int lo = 0; lo < 25; lo++)
				{
					if(lo == 0 ){
						System.out.print("			=");
					}
					else{
						System.out.print("=");
					}
				}
			System.out.println();
		
//			for(int r = 0; r < 3 ; r++){
//				for(int c = 0 ; c < 3 ; c++){
//					if(c ==0){
//						System.out.print("			| " + blankSpace[r][c] + " | ");
//					}
//					else{
//						System.out.print(blankSpace[r][c] + " | ");
//					}
//				}
//				System.out.println();
//				for (int lo = 0; lo < 25; lo++)
//					{
//						if(lo == 0 ){
//							System.out.print("			=");
//						}
//						else{
//							System.out.print("=");
//						}
//					}
//				System.out.println();
//			}
//			
//			
//			for (int r = 0; r < 3; r++)
//			{
//			for (int c = 0; c < 3; c++)
//				{
//					blankSpace[r][c] = machineName[r][c];
//					System.out.println();
//				}
//			}
//			
//			}
		
			//for(int l = 0 ; l < 10)
			
			for (int r = 0; r < 3; r++)
				{
				for (int c = 0; c < 3; c++)
					{
						if(c == 0){
							System.out.print("			| " + machineName[r][c] + " | ");
						}
						else{
							System.out.print(machineName[r][c] + " | ");
						}
						
					}
				System.out.println("");
				for (int l = 0; l < 25; l++)
					{
						if(l == 0){
							System.out.print("			=");
						}
						else{
							System.out.print("=");
						}
					}
				System.out.println("");
				}
			}
		
		public static void determineProfit()
			{
				System.out.println();
			if(middle)
				{
				if (machineName[1][0].equals(machineName[1][1]) && machineName[1][0].equals(machineName[1][2]))
					{
					payout += machineValue[1][0];
					System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
					PlaySlotMachine.tokens += payout;
					}
				else
					{
					System.out.println("Sorry! You lose!");
					}
				}
			else if (outside)
				{
					if (machineName[0][0].equals(machineName[0][1]) && machineName[0][0].equals(machineName[0][2]))
						{
						payout += machineValue[0][0];
						System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
						PlaySlotMachine.tokens += payout;
						}
					else if (machineName[2][0].equals(machineName[2][1]) && machineName[2][0].equals(machineName[2][2]))
						{
							payout += machineValue[2][0];
							System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
							PlaySlotMachine.tokens += payout;
						}
					else
						{
						System.out.println("Sorry! You lose!");
						}
				}
			else if (all)
				{
					if (machineName[1][0].equals(machineName[1][1]) && machineName[1][0].equals(machineName[1][2]))
						{
						payout += machineValue[1][0];
						System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
						PlaySlotMachine.tokens +=payout;
						}
					else if (machineName[0][0].equals(machineName[0][1]) && machineName[0][0].equals(machineName[0][2]))
						{
						payout += machineValue[0][0];
						System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
						PlaySlotMachine.tokens += payout;
						}
					else if (machineName[2][0].equals(machineName[2][1]) && machineName[2][0].equals(machineName[2][2]))
						{
							payout += machineValue[2][0];
							System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
							PlaySlotMachine.tokens += payout;
						}
					else if (machineName[0][0].equals(machineName[1][1]) && machineName[0][0].equals(machineName[2][2]))
						{
							payout += machineValue[0][0];
							System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
							PlaySlotMachine.tokens += payout;
						}
					else if (machineName[2][0].equals(machineName[1][1]) && machineName[2][0].equals(machineName[0][2]))
						{
							payout += machineValue[2][0];
							System.out.println("Congratulations! You win! You receive " + payout + " tokens!");
							PlaySlotMachine.tokens += payout;
						}
					else
						{
						System.out.println("Sorry! You lose!");
						}
				}
			}

	}
