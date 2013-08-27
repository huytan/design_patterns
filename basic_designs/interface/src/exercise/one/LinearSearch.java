package exercise.one;

public class LinearSearch implements ISearch {
	public LinearSearch() {
	}

	@Override
	public int search(int[] search, int find) {
		for (int i = 0; i < search.length; i++) {
			if (find == search[i]) {
				return i;// Found key, return index.
			}
		}
		return -1; // Failed to find key
	}



}
