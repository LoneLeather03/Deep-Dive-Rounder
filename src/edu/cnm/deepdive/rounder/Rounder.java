/**
 * 
 */
package edu.cnm.deepdive.rounder;

/**
 * @author David Martinez
 *
 */
public class Rounder {
	
	public static long round(double value) {
		return Math.round(value);
	}

	
	public static int round(float value) {
		return Math.round(value);
		
	}
	
	public static int round(int value, int increment) {
		int sign = Math.round(Math.signum(value));
		value = Math.abs(value);
		increment = Math.abs(increment);
		int truncated = value / increment;
		int remainder = increment % value;
		int rounded = truncated * increment;
		int adjustment = (2 * remainder >= increment) ? increment : 0;
		return rounded + adjustment;
	}
	/**
	public static  {
		
	}

	public static  {
		
	}
	
	public static  {
		
	}
	
	*/
}
