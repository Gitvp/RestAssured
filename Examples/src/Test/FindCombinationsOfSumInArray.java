package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindCombinationsOfSumInArray {


	public static void main (String a[]){

		int numOfTestCase;

		System.out.println("Enter the number of Test cases");
		Scanner sc =new Scanner(System.in);
		numOfTestCase = sc.nextInt(); 
		int arraySize = 0, targetSum;

		for (int i=0;i<numOfTestCase;i++){
			System.out.println("Enter size of the array");
			arraySize = sc.nextInt(); 
			Integer inputNumbers[]=new Integer[arraySize];
			System.out.println("Add the numbers to the array");
			for (int j=0;j<arraySize;j++){
				inputNumbers[j] = sc.nextInt(); 
			}
			System.out.println("Enter sum to be calualted in the array");
			targetSum = sc.nextInt(); 
			System.out.println("Possible number that can make target sum are : ");

			find_sum_combinations(new ArrayList<Integer>(Arrays.asList(inputNumbers)),targetSum);
		}	
	}

	public static void sum_combinations_recursive(ArrayList<Integer> inputNumbers, int targetSum, ArrayList<Integer> partialNumbers) {

		
		int sum = 0;

		//calculate summation of partial numbers
		for (int x: partialNumbers) {
			sum += x;
		}    

		//check if sum of partial numbers is equal to sum target
		if (sum == targetSum){
			Collections.sort(partialNumbers);
			System.out.print("("+Arrays.toString(partialNumbers.toArray())+")");
		}
		//if we sum is greater than the target sum
		if (sum >= targetSum){
			return;//ends the current method invocation
		}	            

		//add the remaining numbers in the partial number list 
		for(int i=0;i<inputNumbers.size();i++) {	  
			ArrayList<Integer> remainingNumbers = new ArrayList<Integer>();

			int n = inputNumbers.get(i);	

			for (int j=i+1; j<inputNumbers.size();j++) {
				remainingNumbers.add(inputNumbers.get(j));
			}

			ArrayList<Integer> partialNumbersList = new ArrayList<Integer>(partialNumbers);
			partialNumbersList.add(n);

			//recursive call
			sum_combinations_recursive(remainingNumbers,targetSum,partialNumbersList);
		}

	}
	
	public static void find_sum_combinations(ArrayList<Integer> inputNumbers, int targetSum) {

		sum_combinations_recursive(inputNumbers,targetSum,new ArrayList<Integer>());

	}

}