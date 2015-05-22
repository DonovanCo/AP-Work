import java.util.ArrayList;
public class ArrayListIntro
	{

	public static void main(String[] args)
		{
			ArrayList myArrayList =new ArrayList();
			double sum=0;
			double total=0;
			
			myArrayList.add(1.3);
			myArrayList.add(6.9);
			myArrayList.add(7.6);
			myArrayList.add(29.3);
			myArrayList.add(0.2);
			
			System.out.println(myArrayList);
			
			for(int i=0; i<myArrayList.size(); i++)
				{
				 sum=sum+(double)myArrayList.get(i);
				}
			System.out.println(sum);
			
			myArrayList.remove(1.3);
			myArrayList.add(5.5);
			myArrayList.add(1.1);
			
			for(int x=0; x<myArrayList.size(); x++)
				{
					total=total+(double)myArrayList.get(x);
				}
			System.out.println(total/myArrayList.size());
			

		}

	}
