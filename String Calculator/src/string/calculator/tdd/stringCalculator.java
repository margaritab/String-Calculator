package string.calculator.tdd;

public class stringCalculator {

	public int Add(String str) 
	{
		if(str.equals(" "))
			return 0;
		if(str.contains(","))
		{
			return handleMultipalNumbers(str);
		}
		return Integer.parseInt(str);
	}

	private int handleMultipalNumbers(String str)
	{
		String[] strings = str.split(",");
		return Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
	}

}