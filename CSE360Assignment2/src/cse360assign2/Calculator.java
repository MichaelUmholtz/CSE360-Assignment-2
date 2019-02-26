/** 	Assignment #: 1
 *		@author Michael Umholtz
 *		StudentID: 	1212997706
 *		ClassID:	570
 *		Lecture: 	Wednesday 3:05 - 4:20
 *		Description:	This class is designed to perform basic arithmetic calculations
 *						in order of request on a single value. The value can be output,
 *						or the history of operations can be requested as a String output.	
 *
 *		Github Repository URL:	*/

package cse360assign2;

public class Calculator {
	/**	Integer used to store sum of all arithmetic operations.	*/
	private int total;
	
	/**	Basic constructor initializing total value to be 0.	*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**	Returns current total value when requested.
	 * 
	 * @return Current value of all operations performed.	*/
	public int getTotal () {
		return total;
	}
	
	/**	Performs additive operation on value given and current total, such that
	 * 	total + value = total.	
	 * 
	 * @param value Input value to be added (+) to total.*/
	public void add (int value) {
		total = value + total;
	}
	
	/**	Performs subtracting operation on current total by the given value, such that
	 * total - value = total.
	 * 
	 * @param value Input value to be subtracted (-) from total.	*/
	public void subtract (int value) {
		total = total - value;
	}
	
	/**	Performs a multiplicative operation on current total by the given value, such that
	 * total * value = total.
	 * 
	 * @param value Input value to be multiplied (*) with total.	*/
	public void multiply (int value) {
		total = total * value;
	}
	
	/**	Performs division operation on total by the given value, such that
	 * total / value = total.
	 * 
	 *  @param value Input value that total is divided (/) by.	*/
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}else {
			total = total / value;
		}
	}
	
	/**	Returns a string of all operations performed on the total in order of occurrence.
	 * 
	 * @return String with list of all operations performed.	*/
	public String getHistory () {
		return "";
	}
}