package exercise.one;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch implements ISearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int search(int[] search, int find) {
		int start, end, midPt;
		//sort the search before search binary
		Arrays.sort(search);
		start = 0;
		end = search.length - 1;
		while (start <= end) {
			midPt = (start + end) / 2;
			if (search[midPt] == find) {
				return midPt;
			} else if (search[midPt] < find) {
				start = midPt + 1;
			} else {	
				end = midPt - 1;
			}
		}
		return -1;
	}

}
