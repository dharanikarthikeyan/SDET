package week2_homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Day2_Q5_AddDigits {

	@Test
	public void text1() {
		Assert.assertEquals(6, addNumber(789));
		
	}
	@Test
	public void text2() {
		Assert.assertEquals(7, addNumber(5641));		
	}
	@Test
	public void text3() {
		Assert.assertEquals(6, addNumber(78));
		addNumber(78);
	}

	public int addNumber(int num) {
		int n;
		 while(num>9) {
			 int sum=0;
			while(num!=0) {
				n=num%10;
				sum=sum+n;
				num=num/10;
			}
			num=sum;
		 }
		 System.out.println(num);
		return num;
		
		 
}
}