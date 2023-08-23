package mentorClassRoomassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Last_Stone_Weight {
	/**
	 * problem statement -https://leetcode.com/problems/last-stone-weight/description/
	 * 
	 * input as int array
	 * output as int 
	 * sample Input: stones = [2,7,4,1,8,1]//Output: 1
	 * sort the array and take 2 biggest number from the array x<y
	 * if x== y both stones are totally destroyed
	 * if x!==y stone weight of x is totally destroyed 
	 * stone of y have new weight y-x
	 * find the difference between 2 of the stone
	 * both are 1 return 0
	 * 
       
	 */
	@Test
	public void test_1()
	{
		Last_Stone_Weight(new int[] {2,7,4,1,8,1});
		
	}
	

	public int Last_Stone_Weight(int[] stones)
	{
		List<Integer> stonelist = new ArrayList<Integer>();
		
		for (int  n : stones) {
			
			stonelist.add(n);
			
		}
		
		Collections.sort(stonelist);
		while(!stonelist.isEmpty())
		{
			if(stonelist.size()==1)
			{
				return stonelist.get(0);
			}
			
			else
			{
				int len = stonelist.size();
				int max = stonelist.get(len-1);
				int Second_max = stonelist.get(len-2);
				
				if (max==Second_max) {
					
					stonelist.remove(len-1);
					stonelist.remove(len-2);
					
				}
				else
					
				{
					int diff= max-Second_max;
					stonelist.remove(len-1);
					stonelist.remove(len-2);
					stonelist.add(diff);
					//System.out.println(diff);
					System.out.println(stonelist);
				}
			}
		}
		System.out.println(stonelist);
		
		return 0;
	}
	
	
	

}
