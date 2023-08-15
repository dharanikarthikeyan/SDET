package mentorClassRoomassessment;

import org.junit.Test;

public class CapitalLetterCount_Inbuild {
	/****
	 * problem statement -Write a Java Program to get the count of Capitalized Letter in a String.
	 */
	
	@Test()
	
	public void passitve_testdata()
	
	{
		int find_CapitalLetterCount= find_CapitalLetterCount("I Can");
	}

	public  int find_CapitalLetterCount(String Given_Word) {
		int count =0;
		char[] char_input = Given_Word.toCharArray();
		for (char c : char_input) {
			if(Character.isUpperCase(c))
			{
			
			count++;
		}
		
		System.out.println(count);
		
	}
		return count;
	}
}
