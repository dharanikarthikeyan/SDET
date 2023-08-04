package mentorClassRoomassessment;

import org.junit.Test;

public class FindduplicateFromArrayWithoutInbuild {
	
	
	@Test
	public void test1()
	
	{
		boolean find_duplicate = find_duplicate(new int[] {5,1,5,6});
//		System.out.println(find_duplicate);
		
	}
	
	
	public boolean find_duplicate(int[] arr_values)
	
	{
		int increase_me = 0;
		
		for(int i =0; i<arr_values.length;i++)
		{
		for(int j=i+1; j<arr_values.length;j++)
		{
			if(arr_values[i]==arr_values[j])
			{
				System.out.println(arr_values[i]);
				increase_me++;				
			}
		}
		
	}
		//System.out.println(increase_me);
		return false;	
		
}	
}
