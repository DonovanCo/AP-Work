
public class Computer
	{
	protected int memory=750;
	protected String procs="i5";

	public void bootUp()
		{
		System.out.println("The computer boots up.");
		}
	
	public void giveSysInfo()
		{
		System.out.println("Memory(Gigs): "+memory+"\nProcessor:"+procs);
		}
	
	public void bootDown()
		{
		System.out.println("The computer turns off.");
		}

	}
