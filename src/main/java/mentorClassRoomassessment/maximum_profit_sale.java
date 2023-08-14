 package mentorClassRoomassessment;

import org.junit.Test;

/***
 * prices = [7,1,5,3,6,4]
 * purchase at 1 sales at 6 get profit
 * Input as Array of int
 * count start as 0
 *
 * create if for compare arr[i] with arr[i] if arr[i]>arr[i]+1 diff for arr[i]-1-arr[i] then return
 * 
 * 
 * 
 * 
 * 
 */
public class maximum_profit_sale

{

	@Test
	public void test_data1()
	{
		find_max_profit(new int[] {7,1,5,3,6,4} );
	}
	
	
 public int find_max_profit(int price_value[])
 
 {
	 int maxprofit=0;
		int buy=price_value[0];
		for (int i = 0; i < price_value.length; i++) {
			if(buy>price_value[i]) {
				buy=price_value[i];
			}
			else if(price_value[i]-buy>maxprofit){//5-1>0
				maxprofit=price_value[i]-buy;//4
			}
		}
		System.out.println(maxprofit);
		return maxprofit;
	 
 }
 
}
