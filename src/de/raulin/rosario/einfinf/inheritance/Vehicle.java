package de.raulin.rosario.einfinf.inheritance;

public class Vehicle extends Good {

	public Vehicle() {
		this.weight = 5;
	}
	
	@Override
	public String toString() {
		return "Vehicle";
	}

}
