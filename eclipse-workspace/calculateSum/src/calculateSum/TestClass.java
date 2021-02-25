package calculateSum;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test
public class TestClass {
private Calculate cal;
	
	// Initialization method
	@BeforeTest
	public void init()
	{
		cal= new Calculate();
	}
	
	// method to check if string is empty
	public void emptyString() throws Exception
	{
		assertEquals(cal.calculate(""),0);
	}
	
	// method to check if string has single value
	public void singleValue() throws Exception
	{
		assertEquals(cal.calculate("1"),1);
	}
	// method to check if string has two positive int value separated by "," and returned sum is correct
		public void twoNumber() throws Exception
		{
			assertEquals(cal.calculate("1,2"),3);
		}
	// method to check if string has two positive int value separated by "\n" and returned sum is correct
		public void twoNumberNextLine() throws Exception
		{
			assertEquals(cal.calculate("2\n3"),5);
		}
}
