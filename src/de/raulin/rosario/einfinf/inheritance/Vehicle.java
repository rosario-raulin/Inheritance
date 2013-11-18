package de.raulin.rosario.einfinf.inheritance;

public class Vehicle extends Good {
	
	@Override
	public String toString() {
		return "Vehicle";
	}

	@Override
	public int getWeight() {
		return 5;
	}

}
