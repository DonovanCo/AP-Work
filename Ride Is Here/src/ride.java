import java.io.*;
import java.util.*;

public class ride {
  public static void main (String [] args) throws IOException {
  
  int totalName=1;
  int totalCode=1;
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    String a = st.nextToken();    // first integer
    String b = st.nextToken();    // second integer
    for(int i = 0; i<a.length(); i++)
    	{
    	totalName=totalName*(a.charAt(i)-64);
    	}
    for(int x = 0; x<b.length(); x++)
    	{
    	totalCode=totalCode*(b.charAt(x)-64);
    	}
    if(totalName%47==totalCode%47)
    	{
    	System.out.println("GO");
    	}
    else
    	{
    	System.out.println("STAY");
    	}
    out.close();
    System.exit(0);                               
  }
}