package mentorClassRoomassessment;

import org.junit.Test;

public class AnotherApproach_to_ReverseArr {
	
	/*
	 * input as char array
	 * output expect as reversed char array
	 * divide the array in two parts left and right 
	 * left side assign as '0' in temp variable
	 * array iterate from end through lenth-1 approach
	 * lenth -1 apply to right side due to array start from last
	 * temp varible 0 assign to left
	 * apply swap left var assign  to rigth side   this loop apply until left side grater then right side
	 * 
	 * 
	 * 
	 * 
	 *  
	 */
	
	
	
	
	
	
	@Test
	public void Testdata()
	{
		char[]reverse_array_chr = reverse_array_chr (new char[] {'a','b','c','d','e'});
	}
	
	
	
	private char[] reverse_array_chr(char[] arr_value) {
		// TODO Auto-generated method stub
		int leftarr = 0;
		int Rightarr = arr_value.length-1;
		char temp = 0;
		
		while(leftarr < Rightarr) // 0<4
		{
			 temp = arr_value[leftarr];
			 
			 arr_value[leftarr] = arr_value[ Rightarr];
			 
			 arr_value[Rightarr] = temp;
			 
			 leftarr++;
			 
			 Rightarr--;
			 System.out.println(arr_value);	
			
		}
		
		
		return arr_value;
	}



	

}
