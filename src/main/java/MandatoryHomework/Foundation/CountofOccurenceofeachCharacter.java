package MandatoryHomework.Foundation;

import java.util.HashMap;
import java.util.Map;

public class CountofOccurenceofeachCharacter {
/***
 * Input as array of char char[]
 * output as char
 * @return 
 * 
 */
	public static void main (String[] args)
	
	{
		
		String str = "need some peace";
		char[] chararr = str.toCharArray();
		System.out.println(chararr);
		
		Map<Character,Integer> map = new HashMap<Character,Integer> ();
		
		for (char c : chararr) {
			
			if (map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			
			else {
				map.put(c, 1);
			}
			System.out.println(map);
		}
	}
	
}
