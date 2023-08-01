package week3_HomeWork;

import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class Day1_Q2_MergeStringsAlternately {
	
	@Test
	public void test1() {
		String mergeAlternateStrings = MergeAlternateStrings("abc","pqr");
		Assert.assertEquals("apbqcr", mergeAlternateStrings);
	}
	@Test
	public void test2() {
		String mergeAlternateStrings = MergeAlternateStrings("ab","pqrs");
		Assert.assertEquals("apbqrs", mergeAlternateStrings);
	}
	@Test
	public void test3() {
		String mergeAlternateStrings = MergeAlternateStrings("abcd","pq");
		Assert.assertEquals("apbqcd", mergeAlternateStrings);
	}

  public String MergeAlternateStrings(String s1, String s2) {
	String result="";
	if(s1.length()==s2.length()) {
	for (int i = 0; i < s2.length(); i++) {
		result=result+s1.charAt(i)+s2.charAt(i);
		}
		return result;
	}
	else if(s1.length()>s2.length()) {
		for (int i = 0; i < s2.length(); i++) {
			result=result+s1.charAt(i)+s2.charAt(i);
			}
		result=result+s1.substring(s2.length());
		return result;
	}
	else if(s1.length()<s2.length()) {
		for (int i = 0; i < s1.length(); i++) {
			result=result+s1.charAt(i)+s2.charAt(i);
			}
		result=result+s2.substring(s1.length());
		return result;
	}
	 return "";
	}
	}
	

	

	

