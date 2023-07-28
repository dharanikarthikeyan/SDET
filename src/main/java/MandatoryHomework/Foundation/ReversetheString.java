package MandatoryHomework.Foundation;

import org.junit.Test;

public class ReversetheString {
	
    void reversegivenstring(String str)
    {
    	char[] given_str = str.toCharArray();
    	
    	for(int i = given_str.length-1;i>0;i--)
    	{
    		System.out.println(given_str[i]);
    	}
    }
    
    @Test
    public void test_1()
    {
    reversegivenstring("edoctee");
    
    
}
}
