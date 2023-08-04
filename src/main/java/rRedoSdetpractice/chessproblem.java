//package rRedoSdetpractice;
//
//import org.junit.Test;
//import org.testng.Assert;
//
//public class chessproblem {
//	
//	
//	@Test
//	
//	public void test_1()
//	
//	{
//		boolean cordinates = cordinates ("a1");
//		Assert.assertEquals(true, cordinates);
//	}
//	
//	
//@Test
//	
//	public void test_1()
//	
//	{
//		boolean cordinates = cordinates ("b1");
//		Assert.assertEquals(false, cordinates);
//	}
//	
//	public boolean cordinates(String str)
//	{
//		boolean square = true;
//		char[] ch = str.toCharArray();
//		for(int i =0; i<str.length()-1;i++)
//		{
//			if(ch[i]%2==0 && ch[i+1]%2==0|| ch[i]%2!=0&& ch[i+1]%2==0)
//				
//				square= false;
//			break;
//		}
//		
//		return square;
//	}
//	
//
//}
