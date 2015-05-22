import java.util.ArrayList;
import java.util.Scanner;
public class classPractice
	{

	public static void main(String[] args)
		{
			
			
			Student.results.add(new Student("Colin", 1));
			Student.results.add(new Student("Cole", 100));
			Student.results.add(new Student("Travis", 98));
			Student.results.add(new Student("Spongebob", 24));
			Student.results.add(new Student("Roger", 87));
			
			for(int x =0; x<Student.results.size(); x++)
				{
					System.out.println(Student.results.get(x).getName()+" "+Student.results.get(x).getScore());
				}
			Student.addStudent();
			
			for(int x =0; x<Student.results.size(); x++)
				{
					System.out.println(Student.results.get(x).getName()+" "+Student.results.get(x).getScore());
				}
			
			for(int x =0; x<Student.results.size(); x++)
				{
					if(Student.results.get(x).getScore()<50)
						{
						Student.results.get(x).setScore(55);
							System.out.println(Student.results.get(x).getName()+" "+Student.results.get(x).getScore());
						}
				}
			
			
			
			
			
			

		}
	}
