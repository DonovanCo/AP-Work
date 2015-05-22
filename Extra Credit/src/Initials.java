import java.util.Scanner;


public class Initials
	{

	public static void main(String[] args)
		{
		Scanner file = new Scanner(System.in);
		System.out.println("Hello, please enter in your full name with one space between each part.");
		String str = file.nextLine();
		String [] words = str.split(" ");
		String init = "";
		for(int i = 0; i< words.length; i++)
			{
			init+=words[i].substring(0, 1);
			}
		System.out.println(init.toUpperCase());
		}

	}
