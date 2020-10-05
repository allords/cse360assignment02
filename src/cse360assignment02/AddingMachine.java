package cse360assignment02;

/**
 * @author Abraham Lords
 * @version 2.0
 */

public class AddingMachine {
	
	private int total;
	private String operations;

	public AddingMachine () {
	  total = 0;  // not needed - included for clarity
	  operations = "0";
	}
	
	/**
	 * <p> gets total </p>
	 * @param none
	 * @return added total
	 */
	public int getTotal () {
	  return total;
	}
	
	/**
	 * <p> adds value to total </p>
	 * @param value integer value to be added
	 * @return void
	 */
	public void add (int value) {
		total += value;
		toString("+", value);
	}
	
	/**
	 * <p> subtracts value from total </p>
	 * @param value value to be added
	 * @return void
	 */
	public void subtract (int value) {
		total -= value;
		toString("-", value);
	}
	
	/**
	 * <p> adds operation to history </p>
	 * @param operator mathematical operator to be added to operations string
	 * @param value integer to be added to operations string
	 * @return operations history of operations in string form
	 */
	public String toString(String operator, int value) {
		operations += " ";
		operations += operator;
		operations += " ";
		operations += value;
		
		return operations;
	}
	
	/**
	 * <p> prints history </p>
	 * @param none
	 * @return void
	 */
	public void printHistory() {
		System.out.println(operations);
	}
	
	/**
	 * <p> clears operation history and reinitializes total </p>
	 * @param none
	 * @return void 
	 */
	public void clear() {
		operations = "0";
		total = 0;		
	}
}
