package MandatoryHomework.Foundation;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroAtLastwithoutsort {
	/***
	 * declare input as array
	 * out put as array
	 * get the length of array
	 * sort the array
	 * for loop should apply the condition : iterate from last
	 *                                     : i value should be greater then 0
	 *                                     :
	 * 
	 */
	@Test
	public void pve_Dataset()
	{
		moveZeroatlastpostion(new int[] {128, 0, 99, 67, 50, 0, 29, 7, 0});
	}
  
	
	@Test
	public void Nve_Dataset()
	{
		moveZeroatlastpostion(new int[] {0,0,0});
	}
  
	
	private int moveZeroatlastpostion(int[] arr_values) {
		// TODO Auto-generated method stub
		
		int n = arr_values.length;
		Arrays.sort(arr_values);
		for (int i = n-1; i>0; i--) {
			
			System.out.println(arr_values[i]);
		}
		
		return n;
		
	}
	

}
