package string.calculator.tdd;

public class stringCalculator {

	public int Add(String str) 
	{
		if(str.equals(" "))
			return 0;
		if(str.contains(","))
		{
			String[] strings = str.split(",");
			return Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
		}
		return Integer.parseInt(str);
	}

}
