package mentorClassRoomassessment;

import java.util.Arrays;

import org.junit.Test;

public class Find2LargestfromArray_approach1 {
	
	/**
	 * input as array
	 * output as int
	 * sort the array
	 * open for loop to traverse the array
	 * take second largest element
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test_1()
	{
		int find2largest = find2largest(new int[] {1,2,3,4});
	}
	
	@Test
	public void test_2()
	{
		int find2largest = find2largest(new int[] {1,2});
	}
	
	
	public int find2largest(int[] arr)
	{
		
		Arrays.sort(arr);
		int second_largest = arr.length-2;
		
		for(int i =0; i<arr.length; i++)
		{
		
		
	if(arr.length<2)
		{
			System.out.println("no second elmt is available");
			
			return 0;
		}
			
	}
		System.out.println(second_largest);
		return second_largest;
	

}}
