
public class deadfish
	{

	public static void main(String[] args)
		{
		int total=0;
		String[] mine = {"i","i","i","s","d","d","d","s","d","d","d","d","d","d","d","d","d","d","d","d","d","d","d","d","s","d","d","d","d"};
		for(int i = 0; i<mine.length; i++)
			{
			if(mine[i].equals("i"))
				{
				total++;
				}
			else if(mine[i].equals("s"))
				{
				total=total*total;
				}
			else if(mine[i].equals("d"))
				{
				total--;
				}
			}
		System.out.println(total);
		}

	}
