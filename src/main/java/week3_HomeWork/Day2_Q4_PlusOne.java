package week3_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Day2_Q4_PlusOne {
	
	@Test
	public void test1() {
		plusOne(new int[] {9});
	}
	@Test
	public void test2() {
		plusOne(new int[] {1,2,4,9});
	}

	public List<Character> plusOne(int[] input) {
		String concat="";
		for (int i = 0; i < input.length; i++) {
			concat=concat+input[i];
		}
		int addplusone = Integer.parseInt(concat)+1;
		String st = Integer.toString(addplusone);
		char[] ch = st.toCharArray();
		List<Character> list=new ArrayList<>();
		for (char c : ch) {
			list.add(c);
		}
		System.out.println(list);
		return list;
		
		
	}

}
