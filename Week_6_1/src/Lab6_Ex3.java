//-----------------------------------------------------------------------------------------
//Lab 6 Ex. 3 Kip Brower 08-15-2020
//Lab6_Ex3.java  Time complexity determination.
//-----------------------------------------------------------------------------------------
public class Lab6_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
		int bar(int N) {
			 int result = 1;
			 for (int i=1; i<N; i*=2) //loop is of O(N) time complexity
				 
			 result+=2; //body is of O(1) time complexity

			 return result;
			}
//overall time complexity is O(N).
}
