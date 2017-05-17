package ClearTriptest;

import org.testng.Assert;

public class Validation {
	public static int validateTitle(String expected,String act)
	{
	
			try
			{
				Assert.assertEquals(expected, act);
				return 1;
		
	}
		catch (Exception ev)
		{
			return 0;
		}
	}
			public static int validateElement(String expected,String act)
			{
				try
				{
					Assert.assertEquals(expected, act);
					return 1;
				}
				
				catch(Exception e)
				{
					return 0;
				}
			}
}

