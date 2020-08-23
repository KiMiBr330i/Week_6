//-----------------------------------------------------------------------------------------
//Lab 6 Ex. 2 Kip Brower 08-15-2020
//Lab6_Ex2.java  Time complexity determination.
//-----------------------------------------------------------------------------------------
public class Lab6_Ex2 {

	public static void main(String[] args) {
		
	}
		int foo(int N) {
			 int result = 0;
			 for (int i=0; i<N; i++)
			 result++; // outer loop is of O(N) complexity.
			 for (int j=0; j<1000000; j++)
			 result+=j; //inner loop is of O(1) complexity because N is not used.

			 return result;
			}
	}
//  Time complexity for this nested loop operation is O(N) * O(1) = O(N).

