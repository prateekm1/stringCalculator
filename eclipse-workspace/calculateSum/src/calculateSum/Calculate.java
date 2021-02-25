package calculateSum;

public class Calculate {
	public int calculate(String input) throws Exception {
		
		String[] numArray = input.split(",");
		if(isEmpty(input))
		{
			return 0; // returns 0 if input string is empty
		}
		else if(numArray.length==1)
		{
			return stringToInt(input); // returns the number if only one input is provided
		}
		else
		{
			return sumOfNum(numArray);
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
	
	// return sum of two num separated by ","
	private int sumOfNum(String[] number)
	{
		return stringToInt(number[0])+stringToInt(number[1]);
	}
}
