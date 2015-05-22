
public class Laptop extends Computer
	{
	protected int weight = 3;
	protected double size = 17.5;
	protected String Battery = "79%";
	
	public void open()
		{
		System.out.println("You open the laptop.");
		}
	
	public void close()
		{
		System.out.println("You close the laptop.");
		}
	
	public void giveBat()
		{
		System.out.println("Battery: "+Battery);
		}
	
	public void giveInfo()
		{
		System.out.println("Weight: "+weight);
		System.out.println("Size: "+size);
		}
	}
