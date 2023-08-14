package week4_workouts;

import org.junit.Test;

public class findfactorial {
	/***
	 * 
	 * input as int
	 * output as int
	 * input as p+ve intger
	 * initialise the factorial number with 1
	 * operate the factorial to multiply given number
	 * @return 
	 * 
	 * 
	 * 
	 */
	@Test
	
	public void void_test_1()
	
	{
		find_fact(5);
	}	
//	@Test	
//	public void void_test_2()
//	
//	{
//		find_fact(9999);
//	}		
public int find_fact(int num)
{
	int i,fact =1;
	
//	int num = 5;
	
	for(i=1;i<=num;i++)
	{
		fact= fact*i;
		
		//fact =1; i=1 1*1 =1
		//fact=1; i=2 1*2=2
		//fact=2 i=3 2*3=6;
		//fact=6 i=4 6*4=24;
		//fact =24 ;i=5 24*5=120;
	}	
	System.out.println("factorial of given number is"+fact);
	return fact;
}
}
