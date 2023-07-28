package MandatoryHomework.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PowerofThree {
	
	@Test
	public void Test1()
	
	{
		
		boolean power3 = PowerofThree(33);
		Assert.assertEquals(false,power3);
	}
 public boolean PowerofThree(int n)
 {
	 if(n<=0)
	 {
		 return false;
	 }
	 
	 while(n%3==0)
	 {
		 n=n/3;
	 }
	 return n==1;
 }
}
