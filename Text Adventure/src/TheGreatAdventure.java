import java.util.Scanner;

public class TheGreatAdventure
	{

	public static void main(String[] args)
		{
		Scanner game = new Scanner(System.in);

		int begin;
		int door;
		int leave;

		System.out
				.println("Welcome to The Great Adventure! \n You Awaken in a bed in a dark room. \n Do you 1.) Go back to sleep 2.) Look for a light source");
		begin = game.nextInt();
		if (begin == 1)
			{
			System.out.println("You never wake up. Restart");
			}
		if (begin == 2)
			{
			System.out
					.println("You reach your hand out and find a lamp. \n The room is empty except for a door and a bed. You can 1.)Go through the door 2.) Stay here.");
			leave = game.nextInt();
			if (leave == 1)
				{
				System.out
						.println("You walk through and a hairy beast mangles you to death. Demo of \"The Geat Adventure\" complete!");
				} else
				{
				System.out.println("There is nothing else to do in the room.");
				}

			} else
			{
			System.out.println("That is not an option. Enter 1 or 2.");
			}

		}

	}
