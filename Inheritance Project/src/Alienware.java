
public class Alienware extends Desktop
	{

	String model="X51";
	
	public void giveModel()
		{
		System.out.println("Model: "+model);
		}
	
	@Override
	public void giveSysInfo()
		{
		procs="i7";
		System.out.println("Memory(Gigs): "+memory+"\nProcessor:"+procs);
		}


	}
