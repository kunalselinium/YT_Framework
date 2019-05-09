package org.testing.Assertions;

import org.testing.Utilities.Logs;

public class Assertt {
	
	public static void ResultCompare(String actual,String expected) {
		
		if(actual.equals(expected)) {
			Logs.takeLogs("", "Assertion passed as Actual Result: '"+actual+"' is equal to Expected Result: '"+expected+"'" );
		}
		else {
			Logs.takeLogs("", "Assertion failed as Actual Result: '"+actual+"' is not equal to Expected Result: '"+expected+"'" );
		}
	}
		public static boolean ResultCompare1(String actual,String expected) {
			
			if(actual.equals(expected)) {
				Logs.takeLogs("", "Assertion1 passed as Actual Result: '"+actual+"' is equal to Expected Result: '"+expected+"'" );
				return true;
			}
			else {
				Logs.takeLogs("", "Assertion1 failed as Actual Result: '"+actual+"' is not equal to Expected Result: '"+expected+"'" );
				return false;
			}
			
		
	
	}

}
