
//-----------------------------------------------------------------------------------------
//Lab 6 Ex. 5 Kip Brower 08-15-2020
//Lab6_Ex5.java  Trace of insertion and selection sorts of an array.
//-----------------------------------------------------------------------------------------
import java.lang.Comparable;

public class Lab6_Ex5 {

	public static void main(String[] args) {
		/*
		 * Instructions: Trace the execution of the insertion and selection sort
		 * algorithms when executed on the following array of integers:
		 * 
		 * Show how the array will look like after each iteration of the outer loop.
		 */

		final int[] sort_array = { 1, 29, 14, 15, 94 };
	}

	public void insertSort(Comparable[] sort_array) {

		for (int index = 1; index < sort_array.length; index++) {
			Comparable key = sort_array[index];
			int position = index;

			while (position > 0 && key.compareTo(sort_array[position - 1]) < 0) {
				sort_array[position] = sort_array[position - 1];
				position--;
			}
			sort_array[position] = key;
			//algorithm was adapted from Listing 10.9, p. 471-472 of Java Software Solutions, 9e (Lewis and Loftus, 2017)
		}
	}

}
