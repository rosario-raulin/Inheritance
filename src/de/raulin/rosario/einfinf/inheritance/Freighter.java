package de.raulin.rosario.einfinf.inheritance;

public class Freighter {
	
	private Good[][] field;
	
	public Freighter(int size) {
		field = new Good[size][size];
	}

	public Good get(int x, int y) {
		return field[x][y];
	}
	
	public void set(int x, int y, Good f) {
		field[x][y] = f;
	}

	public int getTotalWeight() {
		int totalWeight = 0;
		
		for (int i = 0; i < field.length; ++i) {
			for (int j = 0 ; j < field.length; ++j) {
				totalWeight = totalWeight + field[i][j].getWeight();
			}
		}
		
		return totalWeight;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < field.length; ++i) {
			for (int j = 0; j < field.length; ++j) {
				output.append(field[i][j].toString()).append("\t");
			}
			output.append("\n");
		}
		
		return output.toString();
	}
}
