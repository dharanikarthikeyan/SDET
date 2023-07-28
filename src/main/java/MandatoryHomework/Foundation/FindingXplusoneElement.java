package MandatoryHomework.Foundation;
/**
 * Problem
 * 4. Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input
 */

import java.util.Arrays;

import org.junit.Test;

/***pseudo code
 * 
 * Input as int array
 * output as int
 * sort the array
 * open first for loop for getting array of index value 
 * open second for loop for getting array of index value+1 
 * compare both  array of index value vs array of index value+1 
 * 
 */
public class FindingXplusoneElement {
	
@Test
public void test_dataset_1()
{
	findingXplusoneelementfromarray(new int[] {1,2,3});
}

@Test
public void test_dataset_2()
{
	findingXplusoneelementfromarray(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
}

@Test
public void test_dataset_3()
{
	findingXplusoneelementfromarray(new int[] {1, 1, 2});
}

public int findingXplusoneelementfromarray(int[] Input_arrvalues) {
	// TODO Auto-generated method stub
	     int incrementar =0;
	     Arrays.sort(Input_arrvalues);
	for (int i = 0; i < Input_arrvalues.length-2; i++) {
		
		for (int j = i+1; j < Input_arrvalues.length; j++) {
			
			if (Input_arrvalues[j]==Input_arrvalues[i]) {
				
				incrementar++;
				System.out.println(incrementar);
				
			}
			
		}
		
	}
	
	return incrementar;
	
}
}
