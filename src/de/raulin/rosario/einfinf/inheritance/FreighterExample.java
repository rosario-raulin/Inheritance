package de.raulin.rosario.einfinf.inheritance;

import java.util.Random;

public final class FreighterExample {

	private static Random RANDGEN = new Random();
	
	private static Good getRandomGood() {
		int randNum = RANDGEN.nextInt(3);
		Good good;
		switch (randNum) {
		case 0:
			good = new Vehicle();
			break;
		case 1:
			good = new Steel();
			break;
		default:
			good = new Bananas();
			break;
		}
		return good;
	}
	
	public static void main(String[] args) {
		Freighter freighter = new Freighter(10);
		
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				Good good = getRandomGood();
				
				freighter.set(i, j, good);
			}
		}
		
		int totalWeight = freighter.getTotalWeight();
		if (totalWeight > 530) {
			System.out.printf("Your freigther is too heavy (%d tons)! Unload something!\n\n", totalWeight);
		} else {
			System.out.println("Everything's fine, your freighter can leave now.\n");
		}
		
		System.out.println(freighter.toString());
	}

}
