package _05_for_loops._2_badgers;

public class badgers {

	public static void main(String[] args) {
		for (int duplicate = 1; duplicate < 3; duplicate++) {
			for (int Badger = 1; Badger < 13; Badger++) {
				System.out.print(" Badger ");
			}
			System.out.println();
			for (int Mushroom = 1; Mushroom < 3; Mushroom++) {
				System.out.print(" Mushroom ");
			}

			System.out.println();

			if (duplicate == 2) {
				for (int Snake = 1; Snake < 2; Snake++) {
					System.out.print(" A Snake ");
				}
				System.out.println();
			}

		}

	}
}