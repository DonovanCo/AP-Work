import java.util.ArrayList;


public class EC3
	{

	public static void main(String[] args)
		{
		long total=0;
		int mine=0;
			for(int i = 0; i<=358000000; i++)
				{
				
				total+=i;
				if(total>358000000)
					{
					System.out.println(total);
					mine=i;
					System.out.println(i);
					break;
					}
				
				}
			
			for(int i = (mine);i<Integer.MAX_VALUE; i++ )
				{
				long num = sum(i);
				int sqrt = (int) Math.sqrt(num);
		        if(sqrt*sqrt == num) {
		        System.out.println(sqrt*sqrt);
		        break;
		        }
				}
			
				
			}
	public static long sum(int x)
		{
		int nappa=0;
		for(int i=0;i<=x;i++)
			{
			nappa+=i;
			}
		return nappa;
		}

		}

	
