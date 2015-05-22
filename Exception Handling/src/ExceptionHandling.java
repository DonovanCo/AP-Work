

public class ExceptionHandling
	{
	
	public static void tryCast()
		{
		try
			{
			Object x = new Integer(0);
			System.out.println((String)x);
			}
		catch(ClassCastException exc)
			{
			System.out.println("This will not work.");
			}
		finally
			{
			System.out.println("This always works.");
			}
		
		}
	
	public static void tryNull()
		{
		try
			{
			Object o = null;
			o.toString();
			}
		catch(NullPointerException exc)
			{
			System.out.println("This cannot be null.");
			}
		finally
			{
			System.out.println("This always works.");
			}
		}
	
	public static void tryNum()
		{
		try
			{
			String str = "word";
			int x = Integer.parseInt(str);
			}
		catch(NumberFormatException exc)
			{
			System.out.println("Silly, you can't do that.");
			}
		finally
			{
			System.out.println("This always works.");
			}
		}
	


	public static void main(String[] args)
		{
		tryCast();
		tryNull();
		tryNum();
		

		}

	}
