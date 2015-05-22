
public class Bat extends Mammal implements Flyable
	{
	@Override
	public void eats()
		{
		name="bat";
		food="insects";
		System.out.println("The "+name+" is looking forward to eating some "+food+".");
		}
	
	@Override
	public void makeNoise()
		{
		System.out.println("The bat emits an ultrasonic pulse.");
		}
	
	@Override
	public void flies()
		{
		System.out.println("The bat can also fly.");
		}
	}
