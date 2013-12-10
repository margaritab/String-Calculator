package string.calculator.tdd;

public class stringCalculator {

	public int Add(String str) 
	{
		if(str.equals(" "))
			return 0;
		if(str.contains(",")||str.contains("\n"))
		{
			return handleMultipalNumbers(str);
		}
		return Integer.parseInt(str);
	}

	private int handleMultipalNumbers(String str)
	{
		/*String delimiter = ",|\n";
		
		String[] strings = str.split(delimiter);
		int num = 0;
		
		for(int i=0; i<strings.length; i++)
		{
			num+= Integer.parseInt(strings[i]);
		}
		return num;*/
		
		String delimiter = ",|\n";
		
		String[] strings = str.split(delimiter);
		char[] arr;
		
		int num = 0;
		
		if(strings[0].contains("//"))
		{
			arr = strings[0].toCharArray();
			delimiter += "|" + arr[2];

			for(int i=1; i<strings.length; i++)
			{
				String[] stringDeli = strings[i].split(delimiter);
				
				for(int j=0; j<stringDeli.length;j++)
					num+= Integer.parseInt(stringDeli[j]);
			}
		}
		else
		{
			for(int i=0; i<strings.length; i++)
			{
				num+= Integer.parseInt(strings[i]);
			}
		}
		
		return num;
	}
	
	
	
	
}