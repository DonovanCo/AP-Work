import java.util.ArrayList;
import java.util.Scanner;

public class Student
	{
	
	private String name;
	private static int score;
	
	
	static ArrayList<Student> results = new ArrayList<Student>();
	public Student(String n, int s)
		{
			name=n;
			score=s;
		}

	public String getName()
		{
			return name;
		}
	public void setName(String n)
		{
			this.name=name;
		}
	public int getScore()
		{
			return score;
		}
	public void setScore(int s)
		{
			this.score=score;
		}
	public static void addStudent()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Enter a new student and their score.");
			String newName;
			int newScore;
			newName=userInput.next();
			newScore=userInput.nextInt();
			results.add(new Student(newName, newScore));
			
		}


	

	}
