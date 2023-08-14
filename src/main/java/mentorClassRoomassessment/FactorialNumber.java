package mentorClassRoomassessment;

import org.junit.Test;

public class FactorialNumber {
	
	@Test
	public void Test_1()
	{
		find_factorial_number(5);
	}
	
	public int find_factorial_number(int n)
	{
		
		int fact=1;
		
		for(int i= 1; i<=n ; i++)
		{
			fact = fact*i;
			
		}
		System.out.println(fact);
		return fact;
		
	}
	
}
