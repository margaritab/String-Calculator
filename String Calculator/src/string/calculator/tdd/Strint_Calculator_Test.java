package string.calculator.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Strint_Calculator_Test {

	@Test
	public void addEmptyStringTest() throws Exception {
		stringCalculator str = new stringCalculator();
		int result = str.Add(" ");
		assertEquals(0, result);
	}
	
	@Test
	public void addOneStringTest() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1");
		assertEquals(1, result);
	}
	
	@Test
	public void addTwoStringTest() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("2");
		assertEquals(2, result);
	}
	
	@Test
	public void addStringWithCommaTest() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void addStringWithCommaTest2() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("3,6");
		assertEquals(9, result);
	}
	
	
	@Test
	public void addStringWithUnknownAmountOfNumbers() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1,2,3,4");
		assertEquals(10, result);
	}
	
	
	@Test
	public void addStringWithNewLines() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void addStringWithMultipleDelimiters() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("//;\n1;2");
		assertEquals(3, result);
	}
	
	@Test
	public void addStringWithMultipleDelimiters2() throws Exception
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("//!\n1!2!3!4!5");
		assertEquals(15, result);
	}
	
	@Test
	public void addStringException() 
	{
		stringCalculator str = new stringCalculator();
		int result = 0;
		try
		{
		result = str.Add("-1");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void addStringExceptionMultiNums() 
	{
		stringCalculator str = new stringCalculator();
		int result = 0;
		try
		{
		result = str.Add("//:\n-5:-1:-3:-2");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	

}
