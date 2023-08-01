package week2_homework;

import org.junit.Test;
import org.testng.Assert;

public class Day2_Q10_PowerofThree {

	@Test
	public void test1() {
		boolean power3 = powerThree(33);
		Assert.assertEquals(false, power3);
	}
	@Test
	public void test2() {
		boolean powerTwo = powerThree(9);
		Assert.assertEquals(true, powerTwo);
	}
	@Test
	public void test3() {
		boolean powerTwo = powerThree(27);
		Assert.assertEquals(true, powerTwo);
	}

	public boolean powerThree(int n) {
		if(n<=0) {
			return false;
		}
		while(n%3==0) {
			n=n/3;
		}
		return n==1;
	}
}
