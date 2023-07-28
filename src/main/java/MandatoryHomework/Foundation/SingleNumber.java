package MandatoryHomework.Foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SingleNumber {
	
	
	/**
	 * Input as int array
	 * output as int
	 * iterate with two loops 
	 * [4,1,2,1,2] check condition array[i] not !== array[j] 
	 * return arrray[i] 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		findElement(new int[] {2,2,2,1,7,1});
	}

	public int findElement(int[] arr) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i : arr) {
			if(map.containsKey(i)) {
				int n=map.get(i)+1;
				map.put(i, n);
			}
			else
				map.put(i, 1);
		
	}
	int value=0;
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		List<Integer> list=new ArrayList<>(map.keySet());
		if(entry.getValue().equals(1)){
			value= entry.getKey();
			System.out.println(value);
		
	}
		
	}
	return value;
	
	}


		
		
		
	}
	
