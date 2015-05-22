
public class ForEach
	{

	public static void main(String[] args)
		{
		int total=0;
		int[] challenge1 ={51,68,24,32,16,-2};
		
		for(int cheeseballs:challenge1)
			{
				System.out.println(cheeseballs);
			}
		
		for(int DonkeyKong: challenge1)
			{
				System.out.print(DonkeyKong+" ");
			}
		int[] challenge2 ={0,-35,15,23,81,-132};
		
		for(int i=0; i<challenge2.length; i=i+2)
			{
				System.out.println(challenge2[i]);
				
			}
		for(int dragonball: challenge2)
			{
				total=total+dragonball;
			}
		System.out.println("The total is "+total);

		}

	}
