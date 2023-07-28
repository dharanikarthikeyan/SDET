package MandatoryHomework.Foundation;

import org.junit.Test;

public class CountofMatches {
	
	
	//*int matches =0;
//** 1 input as int 
	//** 2 output as int
	
	//** if team is 1 return as 1
	//** if team%2 == 0
	//**  Matches = matches +team/2 then team=Matches
	
	//** else part if
	//*matches = matches+( n-1 )/2 //3
	//* team = ( n-1 )/2 +1//4
	
	//**
	
	
	
	@Test
	public void test1()
	{
		CountofMatches(7);
	}
	
	
	public int CountofMatches(int team)
	{
	
	int matches =0;
	
	if (team==1)
	{
		return 1;
	}
	while(team>1)
		
		if (team%2==0)
		{
			matches=matches+team/2;
			team=team/2;
		}
		else
		{
			matches= matches+(team-1)/2;
			team=(team-1)/2+1;
		}
	
	System.out.println(matches);
	return matches;
	}
}
