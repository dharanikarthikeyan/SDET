package mentorClassRoomassessment;

import org.junit.Test;

public class Place_Flowers {
	/**
	 * problem statement
	 * https://leetcode.com/problems/can-place-flowers/
	 * 605. Can Place Flowers
ou have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed 
without violating the no-adjacent-flowers rule and false otherwise.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

solution statement

     1.input is an integer array
     2.input consist of 1 and 0 only. 1 means planted and 0 means not planted.
     3.planting can only done in adjacent plots apply the condition of  array[0] is planted not allow to plant array[1] 
     4.iterate the array. find the index of 1.
     5.if n is next to a index where the value is 1 then return true
     6.else part return false 
     */


	@Test
	public void Testdata_1()
	{
		boolean flowerbed= flowerbed(new int[] {1, 0, 0, 0, 1},2);
	}
	 
	 
	 boolean flowerbed(int[] flowerbed_input,int n)
	 {
	 if(n==0)
	 {
	 return true;
	 }

	 int count=0;
	 for(int i=0;i<flowerbed_input.length;i++)
	 {
	 if(flowerbed_input[i]==0 && flowerbed_input[i+1] ==0){
	 count++;
	 if(count == n)
	 {
		
		 //System.out.println(n);
	 return true;
	 }
	     i++;
	     System.out.println(i);
	 }
	 }
	 return false;

	 }
}
