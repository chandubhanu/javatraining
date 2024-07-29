package Practice;

import java.util.ArrayList;
import java.util.List;

public class day1 {

	    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
	        int start = 0;
	        int current_sum = 0;
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        
	        for (int end = 0; end < n; end++) {
	            current_sum += arr[end];
	            
	            // If current_sum exceeds the sum, then remove elements from the start
	            while (current_sum > s && start < end) {
	                current_sum -= arr[start];
	                start++;
	            }
	            
	            // If current_sum is equal to sum, return the indices
	            if (current_sum == s) {
	                result.add(start + 1); // 1-based indexing
	                result.add(end + 1);   // 1-based indexing
	                return result;
	            }
	        }
	        
	        // If no subarray is found, return -1
	        result.add(-1);
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 7, 5};
	        int n1 = arr1.length;
	        int s1 = 12;
	        System.out.println(subarraySum(arr1, n1, s1)); // Expected output: [2, 4]

	        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int n2 = arr2.length;
	        int s2 = 15;
	        System.out.println(subarraySum(arr2, n2, s2)); // Expected output: [1, 5]

	        int[] arr3 = {7, 2, 1};
	        int n3 = arr3.length;
	        int s3 = 2;
	        System.out.println(subarraySum(arr3, n3, s3)); // Expected output: [2, 2]

	        int[] arr4 = {5, 3, 4};
	        int n4 = arr4.length;
	        int s4 = 2;
	        System.out.println(subarraySum(arr4, n4, s4)); // Expected output: [-1]
	    }
	}


