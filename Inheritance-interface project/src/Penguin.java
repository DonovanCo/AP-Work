
public class Penguin extends Bird
	{
	@Override
	public void eats()
		{
		name="penguin";
		food="fish";
		
		System.out.println("The "+name+" is looking forward to eating some "+food+".");
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The penguin says, \"Brrr....\"");
		}
	
	@Override
	public void flies()
		{
		
		}
	
	
	}
