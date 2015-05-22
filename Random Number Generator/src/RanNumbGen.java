import java.util.Scanner;
public class RanNumbGen
	{
	public static void rollDice()
		{
		int dieOne = (int) (Math.random() * 6) + 1;
		int dieTwo = (int) (Math.random() * 6) + 1;
		System.out.println(dieOne + dieTwo);
		}

	public static void flipCoin()
		{
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < 1000; i++)
			{
			int results = (int) (Math.random() * 2) + 1;
			if (results == 1)
				{
				heads = heads + 1;
				} else
				{
				tails = tails + 1;
				}
			}
		System.out.println("There were " + heads + " heads and " + tails
				+ " tails.");
		}

	public static void choosePolo()
		{
		String[] polo =
			{ "Dark Blue", "Light Blue", "Yellow", "White", "Gray" };
		int helpChoose = (int) (Math.random() * 4);
		System.out.println(polo[helpChoose]);
		switch (helpChoose)
			{
			case 0:
				System.out.println("Good Color.");
				break;
			case 1:
				System.out.println("Good Color.");
				break;
			case 2:
				System.out.println("It's soooo bland though.");
				break;
			case 3:
				System.out.println("It's soooo bland though.");
				break;
			case 4:
				System.out.println("It's soooo bland though.");
				break;
			}
		}

	public static void checkGreaterThan()
		{
		int numbGen = 0;
		int myCounter = 0;
		while (numbGen < 90)
			{
			numbGen = (int) (Math.random() * 100) + 1;
			myCounter = myCounter + 1;
			}
		if (myCounter == 1)
			{
			System.out.println("It took " + myCounter + " try");
			} else
			{
			System.out.println("It took " + myCounter + " tries");
			}
		}

	public static void askContinue()
		{
			Scanner keyboard=new Scanner(System.in);
			String choose ="";
			do
				{
				System.out.println("Do you wish to a.) continue or b.) not continue.");
				choose=keyboard.nextLine();
				int ranContinue=(int)(Math.random()*100000);
				System.out.println(ranContinue);
				}
			while(choose.equals("a"));
			if(choose.equals("b"))
				{
					System.exit(0);
				}
		}

	public static void main(String[] args)
		{
		rollDice();
		flipCoin();
		choosePolo();
		checkGreaterThan();
		askContinue();

		}

	}
