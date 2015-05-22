import java.util.Scanner;
public class SDChallenges
	{
	 static int[] mine=new int[8];
	private static int carkeys = 12345678;
	public static void run1()
	
		{
		int digit =7654321;
		int[] myArray = new int[7];
		for(int i =0; i<7; i++)
			{
			myArray[i]=digit%10;
			digit=digit/10;
			}
		for(int x: myArray)
			{
			System.out.println(x);
			}
		}
	public static void run2()
		{
		int counter = 0;
		for(int y = 0; y<8; y++)
			{
			mine[y]=carkeys%10;
			carkeys=carkeys/10;
			counter = counter +1;
			}
		System.out.println("The number of digits is "+counter+".");
		}
	public static void run3()
		{
		int total=0;
		for(int m = 0;m<8; m++)
			{
			if(mine[m]%2==1)
				{
				total=total+1;
				}
			}
		System.out.println(total);
		}
	public static void run4()
		{
		System.out.println(mine[0]+mine[1]+mine[2]+mine[3]+mine[4]+mine[5]+mine[6]+mine[7]);
		}
	public static void run5()
		{
		Scanner file = new Scanner(System.in);
		System.out.println("Input a number over 100");
		int userIn=file.nextInt();
		int match = userIn%10;
		int lol = 10-match;
		if(userIn%10==0)
			System.out.println(userIn);
		if(userIn%10<5)
			{
			System.out.println(userIn-match);
			}
		if(userIn%10>4.9)
			{
			System.out.println(userIn+lol);
			}
		}

	public static void main(String[] args)
		{
		run1();
		run2();
		run3();
		run4();
		run5();
		}
	}
