package Test;

import java.util.Arrays;

public class test1 {
	
	
	static boolean hasArrayTwoCandidates(int A[],  
            int arr_size, int sum) 
{ 
int l, r; 

/* Sort the elements */
Arrays.sort(A); 

/* Now look for the two candidates  
in the sorted array*/
l = 0; 
r = arr_size-1;  
while (l < r) 
{ 
if(A[l] + A[r] == sum) 
 return true;  
else if(A[l] + A[r] < sum) 
 l++; 
else // A[i] + A[j] > sum 
 r--; 
}  
return false; 
} 
	
	public static void main(String args[]) 
    { 
        int A[] = {10, 1, 2, 7, 6, 1, 5}; 
        int n = 8; 
        int arr_size = A.length; 
          
        // Function calling 
        if(hasArrayTwoCandidates(A, arr_size, n)) 
            System.out.println("Array has two " +  
                               "elements with given sum"); 
        else
            System.out.println("Array doesn't have " + 
                               "two elements with given sum"); 
      
    } 

}
