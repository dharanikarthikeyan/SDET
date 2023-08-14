package mentorClassRoomassessment;

import org.junit.Test;

public class Busprogramm {
	/***
	 * 
	 * problem statement
	 * Check Buzz Number in Java:
A number which either ends with 7 or divisible by 7 is called Buzz number. For example, 35 is a Buzz number as it is divisible by 7, similarly 47 is also a Buzz number as it ends with 7. In this tutorial, 
we will write java programs to check Buzz number and print Buzz numbers in a given range.
	
	 *input as int
	 *output as boolean
	 *passitve testdata as 42 and 47
	 *Negative testdata as 20
	 *apply if with mod of 10 and mod of 7 apply in if condition apply satisfied true else false
	 *
	 */

	
	@Test
	
	public void test_1()
	
	{
		verify_Buzz_no(49);
	}
	
@Test
	
	public void test_2()
	
	{
		verify_Buzz_no(47);
	}
	
	public boolean verify_Buzz_no(int number )
	{
		if(number % 10 == 7 || number % 7 ==0)
			
		{
			
			System.out.println(number);
			System.out.println("given number divisible by 7 or reminder is 7 so its buzz number");
			return true;
			
		}
		
		else
			System.out.println("given number not divisible by 7 & reminder not 7 so its not buzz number");
			return false;
	}

	
	
}
