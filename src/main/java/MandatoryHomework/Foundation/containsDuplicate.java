package MandatoryHomework.Foundation;

import java.util.HashSet;

import org.junit.Test;

public class containsDuplicate {
/**
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

problem solution
 input as int array
  output as boolean
   implement Hashset for find the duplicates
   loop the set values using for
   apply if for verify the number occurence via contains ()
   return true if it contanis
  
 */
	
	@Test
	
	public void test_1()
	{
//		boolean if_containsDuplicate = 
//				if_containsDuplicate(int[]  {1,2,3,1});
		
		int[] if_containsDuplicate = {1, 2, 3,3};
		 
	}
	
	
	    public boolean if_containsDuplicate(int[] nums)
	    {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for (int i = 0; i < nums.length; i ++){
	            if (set.contains(nums[i]))
	            {
	            	 System.out.println(set.add(nums[i]));
	                return true;
	                
	            }
	           
	           
	        }    
	        
	        return false;
	        
	    }
	    
	}

