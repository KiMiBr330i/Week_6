//-----------------------------------------------------------------------------------------
//Lab 6 Ex. 4 Kip Brower 08-15-2020
//Lab6_Ex4.java  Trace of a binary sort of an array.
//-----------------------------------------------------------------------------------------
import java.lang.Comparable;
public class Lab6_Ex4 {

	public static void main(String[] args) {
		
		/* Given the array {1, 14, 15, 24, 55, 59, 73, 90, 94, 99}, a binary search does the following to obtain a result.
		/* It first establishes initial conditions for searching the array by setting the left bound (min) and middle element (mid)
		 * to zero, the right bound (max) to the last index value (list.length-1), and a false boolean condition set to found.
		 * 
		 * A while loop is then set up to iterate while the target value is not found, and the min is less than the max.
		 * For each iteration a new mid should be found and the target value should be compared to that array element at mid.
		 * The first test mid is found by adding the initial min and max then dividing the sum by 2.
		 * In the case of this array, it is (0+9)/2 = 5.
		 * Using if-else statements the target value is compared to the mid array element value in the following ways: 
		 * If the difference between the mid element value and the target value is 0, 
		 * then the found condition is satisfied, and the mid element value is returned.
		 * Otherwise, 
		 * If the difference between the target value and the mid point value is less than zero,
		 * the index immediately to the left of the midpoint is equated to the new max,
		 * while the left bound is kept at the original min.
		 * If the difference between the target value and the mid element value is greater than zero, 
		 * the index number immediately to the right of the mid point index is set to be the new min.
		 * The process is repeated until the target value is found and returned, or all the possibilities are exhausted and the loop returns a null value.
		 * 
		 * For the first iteration of the while loop for this array, index 5 = 59, and 73 -59 > 0.
		 * The new min is set to index 6 while the max is still at list.length -1 (9).
		 * The left and right bounds are now 73 and 99, respectively.
		 * Iterating again for the new mid,  mid = (6+9)/2 = 7.  The value at index 7 = 90.
		 * 73-90 < 0, therefore the max is changed to index 6, while the min is kept at index 5.
		 * The left and right bounds are now 59 and 73.
		 * Iterating a third time with the new set of left an right bounds we find that mid = (5+6)/2=6.  the value at index 6 is 73.
		 * Since the array element value at 6 is 73 and is equal to the target variable, the found condition of the loop is satisfied.
		 * The element value at index of 6 is returned.
		 * 
		 */
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
		
			
	}

}
