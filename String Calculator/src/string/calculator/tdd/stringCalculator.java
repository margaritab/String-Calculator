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
		String[] strings = str.split(",|\n");
		int num = 0;
		
		for(int i=0; i<strings.length; i++)
		{
			num+= Integer.parseInt(strings[i]);
		}
		return num;
	}
	
}

