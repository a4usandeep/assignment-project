package com.assignment.project;

public class LongestIncreasingSubsequence{
	static int max_ref; 

	static int _LongestIncreasingSubsequence(int arr[], int n)
	{

		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		
		for (int i = 1; i < n; i++) {
			res = _LongestIncreasingSubsequence(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		
		return max_ending_here;
	}

	
	static int LongestIncreasingSubsequence(int arr[], int n)
	{
		
		max_ref = 1;

		
		_LongestIncreasingSubsequence(arr, n);

		
		return max_ref;
	}

	
	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of LongestIncreasingSubsequence is " + LongestIncreasingSubsequence(arr, n)
						+ "\n");
	}
}

