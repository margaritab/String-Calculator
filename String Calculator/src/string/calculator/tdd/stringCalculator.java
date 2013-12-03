package string.calculator.tdd;

public class stringCalculator {

	public int Add(String str) 
	{
		if(str.equals(" "))
			return 0;
		else if(str.equals("1"))
			return 1;
		return -1;
	}

}
