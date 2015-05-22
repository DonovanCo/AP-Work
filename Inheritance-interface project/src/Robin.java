
public class Robin extends Bird implements Flyable
	{
	@Override
	public void eats()
		{
		name="robin";
		food="worms";
		
		System.out.println("The "+name+" is looking forward to eating some "+food+".");
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The robin says, \"Chirp.\"");
		}
	
	@Override
	public void flies()
		{
		System.out.println("The robin can also fly.");
		}
	}
