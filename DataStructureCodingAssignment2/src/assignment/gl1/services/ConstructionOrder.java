package assignment.gl1.services;

public class ConstructionOrder {

	public void ConstOrder(int[] floorValues, int size) {
		System.out.println("The order of construction is as follows:");
		boolean[] bool = new boolean[size + 1];
		int max = size;
		for (int i = 0; i < size; i++) {
			System.out.printf("Day %d:\n", (i + 1));
			bool[floorValues[i]] = true;
			if (bool[max]) {
				while (bool[max]) {
					System.out.print(max + " ");
					max--;
				}
			}
			System.out.println();
		}
	}
}
