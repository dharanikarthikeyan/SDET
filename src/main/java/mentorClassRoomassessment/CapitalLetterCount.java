package mentorClassRoomassessment;

import org.junit.Test;

public class CapitalLetterCount {
	
	/****
	 * problem statement -Write a Java Program to get the count of Capitalized Letter in a String.
	 * 
	 * Input as String
	 * Output as Count of Given String capital letters
	 * Iterate given string untill the length of Word using length-1 approach
	 * Via CharAt() each characters are verify that Asci value of Capsletter A Start with 65 And Capital Z end with 90 condition apply
	 * 
	 * 
	 */
	
	@Test()
	
	public void passitve_testdata()
	
	{
		int find_CapitalLetterCount= find_CapitalLetterCount("I Can");
	}

	public  int find_CapitalLetterCount(String Given_Word) {
		
	//	char[] char_input  = Given_Word.toCharArray();
		
		int count =0;
		
		for(int i=0; i<Given_Word.length(); i++) 	{
			
		   char  each_char = Given_Word.charAt(i);
		
		{
			if(each_char>=65 && each_char<=90 )
			{
			
			count++;
		}
		
		
		
	}
		
	}
		System.out.println(count);
		return count;
		
		
}


}
