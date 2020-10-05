package cse360assignment02;

public class Main {

	public static void main(String[] args) {

		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		myCalculator.printHistory();
		
		myCalculator.clear();
		myCalculator.printHistory();

		myCalculator.add(5);
		myCalculator.printHistory();


	}

}
