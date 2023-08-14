package mentorClassRoomassessment;

import org.junit.Test;

public class Reversechararrry {
	
	



	
	/***
	 *input is  char[] s = { 'a', 'b', 'c' ,'d'};
	 *output is {'d','c','b','c'};
	 *
	 *Input as character array 
	 *Output as character array
	 *Input part length less then one its revert to 0
	 *get the size of array
	 *size-1 we need to apply
	 *
	 * 

	 */
		@Test
		public void test_1()
		{
		
			 reverse_array(new char[] {'a', 'b', 'c', 'd'});
	        //char[] input = {'a', 'b', 'c', 'd'};

	   }
	public char[] reverse_array(char[] input)
	{
		char[] input1 = {'a', 'b', 'c', 'd'};
		
		/****
		 * 
		 */
		
		char[] input2 = new char[input1.length] ;
//		char[] input3 = new char[] {1,2,3,4};
		int j=0;
		
		for(int i=input1.length-1;i>=0; i--)
		{
			input2[j]= input1[i];
			j++;
		}
			
			
	System.out.println(input2);
	return input2;

	}
		
	}




