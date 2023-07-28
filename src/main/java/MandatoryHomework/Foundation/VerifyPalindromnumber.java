package MandatoryHomework.Foundation;

import org.junit.Test;

public class VerifyPalindromnumber {
	
	/**
	 * given int number
	 * 
	 * output as int number
	 * 
	 * 
	 */
	
	@Test
	public void test()
	
	{
		Findpolyindromenumbers(121);
	}

public void Findpolyindromenumbers(int n) {

int rev=0, reminder;
int b=n;
while (n>0)
{
	
	reminder=n%10;
	rev=rev*10+reminder;
	n=n/10;
}
	if (rev==b)
	{
		System.out.println("given number is Palindromnumber");
	}
	
	else
		
		System.out.println("given number is not a Palindromnumber()");
		


}
	
}
