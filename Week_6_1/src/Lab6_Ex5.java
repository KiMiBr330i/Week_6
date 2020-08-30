
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
//For the insertion sort, the for loop iterates through each index of the array starting with index value 1.
//The while loop compares the element specified by the for loop to the element at the index previous to it.
//If the difference between the current and preceding elements is less than zero, the latter element is inserted
//to the prior element's index. That forces a shift downward of the prior element to accommodate the insertion.
//In this case: for i=1: the difference between 1 and 29 is larger than zero, so 1 stays, and 29 is inserted in place.
//Array is unchanged: {1,29,14,15,94}
//For i=2: Comparison of 14 and 29 yields an insertion of 14 after 1, and a shift of 29 downward.
//New array sort: {1,14,29,15,94}
//For i=3: Comparison of 15 and 29 yields a similar result as i=2
//New array sort: {1,14,15,29,94}
//For i = 4: 94 is at the end of the array and cannot be compared to a next element. It is sorted and inserted in place.
//Final result is {1,14,15,29, 94}