package calculateSum;

public class Calculate {
	public int calculate(String input) throws Exception {
		String[] numArray = input.split(",|\n");
		
		if(isEmpty(input))
		{
			return 0; //return 0 if input string is empty
		}
		if(input.length()==1)
		{
			return stringToInt(input); // returns the number if only one input is provided
		}
		else
		{
			return getSum(numArray);
		}
	}
	
	// to get sum of two positive number
	private int getSum(String[] number) throws Exception
	{
		invalidInput(number);
		
		return calculateValue(number);
	}
	
	// calculate the sum of inputs
	private int calculateValue(String[] number)
	{
		int sum=0;
		for(String current:number)
		{
			if(stringToInt(current)>1000)
			{
				continue;
			}
			sum +=  stringToInt(current);
		}
		return sum;
	}
	
	// throw exception for negative input
	private void invalidInput(String[] number) throws Exception
	{
		for(String current:number)
		{
			if(stringToInt(current)<0)
			{
				throw new Exception("negative number");
			}
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
