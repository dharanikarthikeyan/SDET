package MandatoryHomework.Foundation;

import org.junit.Test;

/**
 * input as array
 * output as int
 * 
 * eatCandies=1; 
1) Compare the first number with second number
    if the number not equal to next number the
        eatcandies++; ==>3
    if(eatcandies<=n/2)
    {return candies;
 * 
 */

public class FindingNumbers {
	
	
	@Test
	
	public void test_1()
	{
		findinguniquenumber(new int[] {1,1,2,2,3,3});
//		findinguniquenumber(new int[] {1,1,2,3});
//		findinguniquenumber(new int[] {6,6,6,6});
		//n/2=2
		

	}

	public int findinguniquenumber(int[] arr) {
		// TODO Auto-generated method stub
		int eatCandies=1;
		int n = arr.length/2;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=arr[i+1]) {
				eatCandies=eatCandies+1; 
			}
			
		}
		if(eatCandies>n/2)
		{
			return n;
		
		
	}
		else
		{
		
			return eatCandies;
		
	}
	}
}
	

	
	

