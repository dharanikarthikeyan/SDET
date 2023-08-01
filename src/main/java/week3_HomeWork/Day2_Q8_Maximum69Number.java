package week3_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Day2_Q8_Maximum69Number {
	
	/**
	 * 1) convert the int to string
	 * 2) store it in char[]
	 * 3) iterate with for loop
	 * 
	 */
	@Test
	public void test1() {
		int maximum69Number = maximum69Number(9669);
		Assert.assertEquals(9969, maximum69Number);
	}
	@Test
	public void test2() {
		int maximum69Number = maximum69Number(9996);
		Assert.assertEquals(9999, maximum69Number);
	}
	@Test
	public void test3() {
		int maximum69Number = maximum69Number(9999);
		Assert.assertEquals(9999, maximum69Number);
	}

	public int maximum69Number(int num) {
		int lastIndex=0;
		String st = Integer.toString(num);
		char[] ch = st.toCharArray();
		List<String> strlist = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {
			ch=st.toCharArray();
			if(ch[i]=='6') {
				ch[i]='9';
			}
			else if(ch[i]=='9'){
				ch[i]='6';
			}
			
			strlist.add(new String(ch));
		}
		Collections.sort(strlist);
		System.out.println(strlist);
		lastIndex = strlist.size() - 1;
		return Integer.parseInt(strlist.get(lastIndex));
		
		
	}
}
