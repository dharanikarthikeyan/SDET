package MandatoryHomework.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/***
 * Input as array
 * Output as array
 * sort the array
 * square the array
 * 
 */
public class SquaresofSortedArray {
	
	@Test
	public void passitve_test_dataset()
	{
       squareofsortedarray(new int[] {4,-1,0,3,10});
}

private void squareofsortedarray(int[] array_value_is) {
	// TODO Auto-generated method stub
	List<int[]> array = new ArrayList<>();//create a List which take an array of int

	int arr[] = new int[2];//create a temporary array of 2 elements

	for (int i = 0; i < array_value_is.length; i++) {
	    System.out.println( array_value_is[i] + " \tSquare: " + (int) Math.pow(array_value_is[i], 2));
	    arr[0] = array_value_is[i];//add your number to your array pos 1
	    arr[1] = (int) Math.pow(array_value_is[i], 2);//add the power to the 2ed position
	    array.add(arr);//add your array to your list
	    Arrays.sort(arr);
	    System.out.println(arr);


}
}
}
