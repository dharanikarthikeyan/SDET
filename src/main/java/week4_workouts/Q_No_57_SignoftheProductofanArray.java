package week4_workouts;

import org.junit.Test;

import junit.framework.Assert;

public class Q_No_57_SignoftheProductofanArray {
	
	@Test
	public void test1() {
		int signoftheProductofanArray = SignoftheProductofanArray(new int[] {-1,-2,-3,-4,3,2,1});
		Assert.assertEquals(1, signoftheProductofanArray);
	}
	@Test
	public void test2() {
		int signoftheProductofanArray = SignoftheProductofanArray(new int[] {1,5,0,2,-3});
		Assert.assertEquals(0, signoftheProductofanArray);
	}
	@Test
	public void test3() {
		int signoftheProductofanArray = SignoftheProductofanArray(new int[] {-1,1,-1,1,-1});
		Assert.assertEquals(-1, signoftheProductofanArray);
	}
	
	public int SignoftheProductofanArray(int[] arr) {
		int res=1,re=0;
		for (int i = 0; i < arr.length; i++) {
			res=res*arr[i];
		}
		System.out.println(res);
		if(res==0) {
			re=0;
		}
		else if(res>0) {
			re=1;
		}
		else {
			re=-1;
		}
		System.out.println(re);
	return re;
	}

}
