package exercise.one;

import java.util.Scanner;

public class MainSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,212, 1219, 781, 26, 124, 441, 127, 12,21,4117};
		int searchValue = 0, index;
		ISearch searchEmp = null;
		Scanner input = new Scanner(System.in);
		searchEmp = new BinarySearch();
		System.out.println("Enter a number to search for binary:");
		searchValue = input.nextInt();
		index = searchEmp.search(arr, searchValue);
		if (index != -1) {
			System.out.println("Found at index: " + index);
		} else {
			System.out.println("Not Found");
		}

		searchEmp = new LinearSearch();
		System.out.println("Enter a number to search for linear:");
		searchValue = input.nextInt();
		index = searchEmp.search(arr, searchValue);
		if (index != -1) {
			System.out.println("Found at index: " + index);
		} else {
			System.out.println("Not Found");
		}
	}

}
