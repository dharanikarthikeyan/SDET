package mentorClassRoomassessment;

import java.util.Arrays;

import org.junit.Test;

public class Find2ndlargestUsingSwap {
	
	private int first_highest;


	@Test
	public void test_1()
	{
		int find2largest = find2largest(new int[] {4,1,3,100,110,85,2});
	}

	
	public int find2largest(int[] arr)
	{
		
//		Arrays.sort(arr);
		int result = 0;
		int temp = arr[0];
		int temp1= arr[0];
		for(int i =0; i<arr.length;i++)
			
			
		{
			if(arr[i]>temp)
			{
				temp1 =temp;
				temp = arr[i];
				
				
			}
		
			else if(arr[i]>temp1)//temp1=4 temp=100
			{
				result = arr[i];
			}
		}
		
	
		System.out.println(result);
		return result;
}
}

