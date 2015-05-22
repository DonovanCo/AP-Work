
public class Analyzer
	{

	public static void main(String[] args)
		{
			int total=0;
			int counter=0;
			double occur=0;
			double percentOccur;
			String buttercup;
			String transformer;
			Data.addData();
			System.out.println("There are "+Data.data.size()+" records in the database.");
			
			for(Record r: Data.data)
				{
					if(r.getLetterCode().contains("qqq"))
						{
							total=total+1;
						}
				}
			System.out.println("There are "+total+" occurrences og \"qqq\" in the data.");
			for(Record rc: Data.data)
				{
					buttercup=rc.getLetterCode();
					if(buttercup.substring(0, 1).equals("g"))
						{
							occur=occur+1;
						}
				}
			System.out.println("There are "+occur+" records that begin with \"g\".");
			percentOccur=(occur/Data.data.size())*100;
			System.out.println("That is "+(int)percentOccur+"% of the records.");
			
			for(Record rec: Data.data)
				{
					transformer=rec.getLetterCode();
					if(transformer.length()==6)
						{
							counter=counter+1;
						}
				}
			System.out.println("There are " +counter+" lettercodes of length six");
			
			

		}

	}
