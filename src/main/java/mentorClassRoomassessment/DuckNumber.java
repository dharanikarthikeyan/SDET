package mentorClassRoomassessment;

import org.junit.Test;

public class DuckNumber {
	
	
	/********
	 * problem statement:-
	 * Duck Number

		A positive number that contains a zero digit is called Duck Number. The important point to note is that numbers with only leading zeroes are not Duck numbers. For example, 3056, 10045, 7770 are Duck Numbers while the numbers such as 012, 0045, 01444 are not Duck numbers.

		Note: 04505 is also a Duck number as it contains a non-leading zero digit.
		
		Input as int
		output as
	 * 
	 * 
	 */
	
	@Test
	
	public void test_1()
	{
		verify_Ducknumber(845);
	}
	
	
@Test
	
	public void test_2()
	{
		verify_Ducknumber(8450);
	}

	public void verify_Ducknumber(int number)
	
	
	{
		int rem ,counter = 0;
		while(number!=0)
		{
			rem = number%10;
			if(rem==0)
				counter++;
			      number= number/10;
		}
		if (counter>0)
			
		{
			System.out.println("given number is Ducknumber");
		}
		
		else
		{
			System.out.println("given number is not an Ducknumber");
		}
	}

}
