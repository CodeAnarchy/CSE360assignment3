package cse360assign3;

/** Performs basic mathematical operations and 
 *  @author Michael Saul
 *  @version Feb 22, 2016
 *  Pin Number# 804
 */

public class Calculator {

	private int total;
	
	/**
	 * Calculator - Has total set to 0
	 * 
	 * @param none
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - Returns the calculated total so far
	 * @return int This returns total
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * add - Adds the value of the parameter to total and places the appropriate characters to the string for getHistory function
	 * 
	 * @param value int to be added to total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * subtract - Subtracts the value of the parameter from total and places the appropriate characters to the string for getHistory function
	 * 
	 * @param value int to be subtracted from total
	 */
	
	public void subtract (int value) {
		
	}
	
	/**
	 * multiply - Multiplies total by the value of the parameter and places the appropriate characters to the string for getHistory function
	 * 
	 * @param value int to multiply total by
	 */
	
	public void multiply (int value) {
		
	}
	
	/**
	 * divide - Divides the total by the value of the parameter and places the appropriate characters to the string for getHistory function
	 * 
	 * @param value int to divide total by
	 */
	
	public void divide (int value) {
		
	}
	
	/**
	 * getHistory - Returns the string created by the other functions in the calculator class
	 * 
	 * @return String this returns the history string
	 */
	
	public String getHistory () {
		return "";
	}
}