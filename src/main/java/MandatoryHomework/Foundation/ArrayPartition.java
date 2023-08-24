package MandatoryHomework.Foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class ArrayPartition {
	
	/**Problem statement :- 
	 * 561. Array Partition
        https://leetcode.com/problems/array-partition/
        Test data sample :Input: nums = [1,4,3,2]  after sort -> [1,2,3,4]
        (1, 2), (3, 4) -> remove max value from each pare 2&4 from each pair max value = 1 + 3 = 4
        max of sum is ->4
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void testdata_1()
	
	{
		arrpartion(new int[] {1,4,3,2});
	}
	
	public int arrpartion(int[] arr_values)
	{
		int counter =0;
		Arrays.sort(arr_values); //given array input values are sorted //1,2,3,4
		for(int i=0; i<arr_values.length; i++)
			
		{
			if(i%2==0)
				
			{
				counter = counter+arr_values[i];
				System.out.println(counter);
			}
		}
		
		//System.out.println(counter);
		return counter;
		
	}

}
