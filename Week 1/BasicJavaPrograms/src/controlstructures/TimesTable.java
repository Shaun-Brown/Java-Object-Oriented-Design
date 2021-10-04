package controlstructures;


public class TimesTable {

	public static void main(String[] args) {
		//declare a variable of type int and assign 5

		int i, y = 1;
		//iterate from 1 to 12, note how i can be declared 
		//directly within for loop if it is not needed elsewhere
		for (i = 1; i <= 12; i++) {
			//print result, note use of print instead of println
			//the print method does not add a new line after its output
			for (y = 1; y <= 12; y++)
			System.out.print(i*y + "\t");
		}

	}

}
