
public class computerRunner
	{

	public static void main(String[] args)
		{
		Computer computer = new Computer();
		Desktop desktop = new Desktop();
		Alienware alienware = new Alienware();
		Vanquish vanquish = new Vanquish();
		Laptop laptop = new Laptop();
		HP hp = new HP();
		MacBook macbook = new MacBook();
		
		
		computer.bootUp();
		computer.giveSysInfo();
		computer.bootDown();
		
		desktop.bootUp();
		desktop.giveSysInfo();
		desktop.game();
		desktop.bootDown();
		
		alienware.bootUp();
		alienware.giveSysInfo();
		alienware.giveModel();
		alienware.game();
		alienware.bootDown();
		
		vanquish.bootUp();
		vanquish.giveSysInfo();
		vanquish.game();
		vanquish.bootDown();
		
		laptop.open();
		laptop.bootUp();
		laptop.giveBat();
		laptop.giveInfo();
		laptop.giveSysInfo();
		laptop.bootDown();
		laptop.close();
		
		hp.open();
		hp.bootUp();
		hp.giveBat();
		hp.giveInfo();
		hp.giveSysInfo();
		hp.bootDown();
		hp.close();
		
		macbook.open();
		macbook.bootUp();
		macbook.giveBat();
		macbook.giveInfo();
		macbook.giveSysInfo();
		macbook.bootDown();
		macbook.close();

		}

	}
