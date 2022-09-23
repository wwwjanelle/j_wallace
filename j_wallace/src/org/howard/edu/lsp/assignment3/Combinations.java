package org.howard.edu.lsp.assignment3;

import java.util.Arrays;
public class Combinations {

	public void compute(int[] input, int sum) {
		int[] path = new int[0];
		int[] visited = new int[input.length];
		int count;
		count = 0;
		int comboExists = 0;
		System.out.println("Input: "+ Arrays.toString(input) + " Sum: " + sum);
		System.out.println("Combinations:");
		comboExists = findCombo(input, sum, path, visited, count, comboExists);
		if(comboExists == 0) {
			int[] empty = new int[0];
			System.out.println(Arrays.toString(empty));
		}
		

	}
	public static int findCombo(int[] input, int sum, int[] path, int[] visited, int count, int exists) {
		if (sum < 0) {
	         return -1;
	    }
	    if (sum == 0) {
	    	System.out.println(Arrays.toString(path));
	    	exists = 1;
	    	return exists;
	    }
	    
	    for (int i = count; i < input.length; i++) {
	    	if (numFound(visited, input[i])) {
	    		continue;
	    	}
	    	path = addElement(path, i);
	    	visited = addElement(visited, input[i]);
	        findCombo(input, sum - input[i], path, visited, i, exists);
	        path = popElement(path);
	        visited = popElement(visited);
	      }
	  
	   return exists;
	    
	}
	
	public static int[] addElement (int[] arr, int value) {
		int newArr[] = new int[arr.length + 1];
        int i;
        for(i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[i] = value;
        return newArr;
	}
	
	public static int[] popElement (int[] arr) {
		int[] newArr = new int[arr.length - 1];
        for(int i = 0, j = 0; i < arr.length; i++) {
        	if (i == arr.length - 1) { 
                continue; 
            } 
 
        	newArr[j++] = arr[i]; 
        }
        return newArr;
	}
	public static boolean numFound (int[] arr, int i) {
		boolean found = false;
		for (int element : arr) {
            if (element == i) {
                found = true;
                break;
            }
        }
		return found;
	}



	

}
