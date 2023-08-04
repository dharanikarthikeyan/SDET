package mentorClassRoomassessment;

import org.junit.Test;

public class maximumProductofThree {

	
	@Test
	public void Test_1()
	{
		int find_productof_given_numbr =find_productof_given_numbr(new int[] {1,2,3,4});
	}
	public int find_productof_given_numbr(int[] arr)
	{
	int temp=1;
	for(int i=0;i<=arr.length;i++)
	{
	temp= temp*arr[i];
	System.out.println(temp);
	
	}
	return temp;
	
	
	
}
}
