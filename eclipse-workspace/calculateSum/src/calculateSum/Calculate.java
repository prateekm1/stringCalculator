package calculateSum;

public class Calculate {
	public int calculate(String input) throws Exception {
		
		
		if(isEmpty(input))
		{
			return 0; // returns 0 if input string is empty
		}
		else
		{
			return stringToInt(input); // returns the number if only one input is provided
		}
	}
	
	// Check if input string is empty or not
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	// if only one number is present in input string return the number
	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
}
