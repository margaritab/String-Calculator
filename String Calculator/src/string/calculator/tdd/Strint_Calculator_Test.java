package string.calculator.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Strint_Calculator_Test {

	@Test
	public void addEmptyStringTest() {
		stringCalculator str = new stringCalculator();
		int result = str.Add(" ");
		assertEquals(0, result);
	}
	
	@Test
	public void addOneStringTest()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1");
		assertEquals(1, result);
	}
	
	@Test
	public void addTwoStringTest()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("2");
		assertEquals(2, result);
	}
	
	@Test
	public void addStringWithCommaTest()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void addStringWithCommaTest2()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("3,6");
		assertEquals(9, result);
	}
	
	
	@Test
	public void addStringWithUnknownAmountOfNumbers()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1,2,3,4");
		assertEquals(10, result);
	}
	
	
	@Test
	public void addStringWithNewLines()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void addStringWithMultipleDelimiters()
	{
		stringCalculator str = new stringCalculator();
		int result = str.Add("//;\n1;2");
		assertEquals(3, result);
	}
}
