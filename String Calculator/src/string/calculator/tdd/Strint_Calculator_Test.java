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
}
