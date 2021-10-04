package main;

import lib.Name;

public class NameDemo {

	public static void main(String[] args) {
		/* 
		 * See below evidence of how arrays can store elements of a custom reference
		 * type that you create (Name in this case), as well as both existing
		 * reference types (e.g. String) or primitive types (e.g. int), that you have
		 * previously worked with.
		 */
		
		//declare array to hold four Name objects
		Name[] friends = new Name[5];

		//create Name object and assign reference into array
		Name joe = new Name("Joe", "Bloggs");
		friends[0] = joe;

		//create Name objects and assign reference directly into array
		friends[1] = new Name("Fred", "Perry");
		friends[2] = new Name("Diti", "Hammond");
		friends[3] = new Name("Bulsar", "Raymond");
		friends[4] = new Name("John", "Smith");

		//loop through each element
		for (Name friend : friends) {
			//use accessor method to output full name of each
			System.out.println(friend.getFullName());
		}

		//declare boolean used as a flag
		boolean exists = false;

		//loop through each Name object using a for-each loop (you will see more on this when we cover ArrayLists)
		for (Name nm : friends) {
			//check family name
			if (nm.getFamilyName().equals("Smith")) {
				exists = true;
				break;
			}
		}

		//output result of search
		if (exists) {
			System.out.println("There is a person with family name of Smith");
		} else {
			System.out.println("There is not a person with family name of Smith");
		}
		
		//Checking output of toString
		System.out.println("\n" + joe.toString());

	}

}
