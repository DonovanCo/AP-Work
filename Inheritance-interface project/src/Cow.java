
public class Cow extends Mammal
	{
	@Override
	public void eats()
		{
		name="cow";
		food="grass";
		
		System.out.println("The "+name+" is looking forward to eating some "+food+".");
		}
	
	@Override
	public void makeNoise()
		{
		System.out.println("The cow says, \"Moo.\"");
		}
	
	@Override
	public void flies()
		{
		
		}
	}
