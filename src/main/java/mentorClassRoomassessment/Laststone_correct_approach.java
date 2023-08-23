package mentorClassRoomassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Laststone_correct_approach {
	
	@Test
	public void test_1()
	{
		Last_Stone_Weight(new int[] {2,7,4,1,8,1});
		
	}
	
	@Test
	public void test_2()
	{
		Last_Stone_Weight(new int[] {1,0,0});
		
	}
	@Test
	public void test_3()
	{
		Last_Stone_Weight(new int[] {1,1,1,2});
		
	}

	public int Last_Stone_Weight(int[] stones) {
		List<Integer> stonelist = new ArrayList<>();
		for(int n:stones)stonelist .add(n);
		while(stonelist.size()>1)
		{
		Collections.sort(stonelist);
		int biggeststone= stonelist.get(stonelist.size()-1);
		int secondstone = stonelist.get(stonelist.size()-2);

		stonelist.remove(stonelist.size()-1);
		stonelist.remove(stonelist.size()-1);

		if(biggeststone!=secondstone )stonelist.add(biggeststone-secondstone);

		}
		if(stonelist.isEmpty())return 0;
		else return stonelist.get(0);
		}
		}

	



