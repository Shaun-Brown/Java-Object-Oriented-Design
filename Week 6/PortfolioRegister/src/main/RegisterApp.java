package main;

import lib.Name;
import lib.Register;


public class RegisterApp {

	public static String execute(Register reg, Name n) {

		reg.removeName(1);

		reg.addName(n);

		for (Name r: reg){
			return r.getFamilyName().toUpperCase() + ", " + r.getFirstName().toUpperCase().charAt(0) + "\n";
		}
		return reg.toString();
	}
}