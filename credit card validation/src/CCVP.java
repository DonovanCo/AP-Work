import java.util.Scanner;
public class CCVP
	{
	static long userNumb;
	public static void runCCVP()
		{
		long[] inputNumb=new long[16];
		long[] twodigits =new long[2];
		long doubler;
		long total=0;
		long cardNumb;
		Scanner CCCheck = new Scanner(System.in);
		System.out.println("Enter a 16 digit credit card number for validation check.");
		userNumb=CCCheck.nextLong();
		cardNumb=userNumb;
		for(int i = 0; i<16; i++)
			{
			inputNumb[i]=userNumb%10;
			userNumb=userNumb/10;
			}
		for(int x = 0; x<16; x++)
			{
			if(x%2==1)
				{
				doubler=inputNumb[x]*2;
				if(doubler>9)
					{
					for(int m = 0; m<2; m++)
						{
						twodigits[m]=doubler%10;
						doubler=doubler/10;
						}
					doubler=twodigits[0]+twodigits[1];
					}
				inputNumb[x]=doubler;
				}
			total=total+inputNumb[x];
			}
		if(total%10==0)
			System.out.println("The number "+cardNumb+" is a potentially valid number.");
		else
			System.out.println("The number "+cardNumb+" is not a valid number");
		}
	public static void main(String[] args)
		{
		runCCVP();
		}
	}