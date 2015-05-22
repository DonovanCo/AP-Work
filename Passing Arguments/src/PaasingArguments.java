import java.util.Scanner;
public class PaasingArguments
	{
	static Scanner file = new Scanner(System.in);

	public static void main(String[] args)
		{
		int heightInFeet = feetInput();
		double heightInInches = inchesInput();
		System.out.println("Your height is "+heightInFeet+"'"+heightInInches);
		double totalInches = convertToInches(heightInFeet, heightInInches);
		double heightInCentimeters = convertInchesToCentimeters(totalInches);
		double heightInMeters = convertCentimetersToMeters(heightInCentimeters);
		double metersToFeet = convertMetersToFeet(heightInMeters);
		double feetToInches = convertFeetToInches(metersToFeet);
		checkVariation(totalInches, feetToInches);

		}
	 
	public static int feetInput()
		{
		System.out.println("Enter your height in feet and inches seperately.\nWhat is your height in feet?");
		return file.nextInt();
		}
	public static double inchesInput()
		{
		System.out.println("What is your height in inches?");
		return file.nextDouble();
		}
	public static double convertToInches(int x, double y)
		{
		System.out.println("Your total height in inches is "+((x*12)+y)+" inches.");
		return (x*12)+y;
		}
	public static double convertInchesToCentimeters(double a)
		{
		System.out.println("Your height in centimeters is "+(a*2.54)+".");
		return a*2.54;
		}
	public static double convertCentimetersToMeters(double z)
		{
		System.out.println("Your height in meters is "+(z*.01)+".");
		return z*.01;
		}
    public static double convertMetersToFeet(double b)
    	{
    	System.out.println("Your height in feet is "+(b*3.28084)+".");
    	return b*3.28084;
    	}
    public static double convertFeetToInches(double c)
    	{
    	System.out.println("Your total height in inches is "+(c*12)+" inches.");
    	return c*12;
    	}
    public static void checkVariation(double d, double e)
    	{
    	double check =(Math.abs(d-e)/d);
    	double vary = check*100;
    	System.out.println("The variation is "+vary+"%.");
    	}
	

	}
