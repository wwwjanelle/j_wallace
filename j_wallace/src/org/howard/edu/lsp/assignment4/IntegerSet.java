package org.howard.edu.lsp.assignment4;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class IntegerSet {
	/**
	 * A class for a set of integers. Has the following methods:
	 * - clear
	 * - length
	 * - equals
	 * - contains
	 * - largest
	 * - smallest
	 * - add
	 * - remove
	 * - union
	 * - intersect
	 * - diff
	 * - isEmpty
	 * - toString
	 * - toArrayList
	 * - addAll
	 *
	 */

	ArrayList<Integer> integerset;
	
	public IntegerSet() {
		/**
		 * Constructor
		 *
		 */

		this.integerset = new ArrayList<Integer>();
		
	}
	
	public void clear() {
		/**
		 * Removes all values.
		 * Input: None
		 * Output: None
		 *
		 */
		this.integerset.clear();
		
	}
	
	public int length() {
		/**
		 * Returns length of the set.
		 * Input: None
		 * Output: int
		 *
		 */
		return this.integerset.size();
		
	}
	
	public boolean equals(IntegerSet set2) {
		/**
		 * Returns true if the set contains the exact same values.
		 * Input: None
		 * Output: boolean
		 *
		 */
		boolean equalto = true;
		for (Integer i : this.integerset) {
			if(set2.contains(i) == false) {
				equalto = false;
			}
			
		}
		return equalto;
		
	}
	
	public boolean contains(int value) {
		/**
		 * Returns true if the value exists in the set.
		 * Input: int
		 * Output: boolean
		 *
		 */
		return this.integerset.contains(value);
		
	}
	
	public Integer largest() throws IntegerSetException {
		/**
		 * Returns the maximum value in the set.
		 * Input: None
		 * Output: Integer
		 *
		 */
		if (this.integerset.isEmpty()) {
			throw new IntegerSetException("Integer set is empty");
		}
		return Collections.max(this.integerset);
		
	}
	
	public Integer smallest() throws IntegerSetException {
		if (this.integerset.isEmpty()) {
			/**
			 * Returns the minimum value in the set.
			 * Input: None
			 * Output: Integer
			 *
			 */
			throw new IntegerSetException("Integer set is empty");
		}
		return Collections.min(this.integerset);
		
	}
	
	public void add(Integer item) {
		/**
		 * Adds the item to the set.
		 * Input: Integer
		 * Output: None
		 *
		 */
		if(this.integerset.contains(item)) {
			return;
		}
		this.integerset.add(item);
		
	}
	
	public void remove(Integer item) {
		/**
		 * Removes the item from the set.
		 * Input: Integer
		 * Output: None
		 *
		 */
		if(this.integerset.contains(item) == false) {
			return;
		}
		this.integerset.remove(Integer.valueOf(item));
		
	}
	
	public void union(IntegerSet set2) {
		/**
		 * Finds the union of the sets.
		 * Input: IntegerSet
		 * Output: None
		 *
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array = set2.toArrayList();

		HashSet<Integer> unionSet = new HashSet<Integer>();
		unionSet.addAll(array);
		unionSet.addAll(this.integerset);
		
		this.integerset.clear();
		this.integerset.addAll(unionSet);

	}
	
	public void intersect(IntegerSet set2) {
		/**
		 * Finds the intersection of the sets.
		 * Input: IntegerSet
		 * Output: None
		 *
		 */
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		
		for (Integer i : this.integerset) {
			if(set2.contains(i)) {
				intersect.add(i);
			}
			
		}
		this.integerset = intersect;
		
	}
	
	public void diff(IntegerSet set2) {
		/**
		 * Finds the difference of the sets.
		 * Input: IntegerSet
		 * Output: None
		 *
		 */
		ArrayList<Integer> diff = new ArrayList<Integer>();
		
		for (Integer i : this.integerset) {
			if(set2.contains(i) == false) {
				diff.add(i);
			}
		}
		for (Integer i : set2.toArrayList()) {
			if(this.integerset.contains(i) == false) {
				diff.add(i);
			}
		}
		this.integerset = diff;
		
	}
	
	public boolean isEmpty() {
		/**
		 * Returns true if the set is empty.
		 * Input: None
		 * Output: boolean
		 *
		 */
		return this.integerset.isEmpty();
		
	}
	
	public String toString() {
		/**
		 * Converts the set into a string.
		 * Input: None
		 * Output: String
		 *
		 */
		return this.integerset.toString();
		
	}
	
	public ArrayList<Integer> toArrayList() {
		/**
		 * Converts the set into an ArrayList.
		 * Input: None
		 * Output: ArrayList
		 *
		 */
		
		return this.integerset;
		
	}
	
	public void addAll(ArrayList<Integer> arr) {
		/**
		 * Adds the elements of an ArrayList to the set.
		 * Input: ArrayList
		 * Output: None
		 *
		 */
		this.integerset.addAll(arr);
	}
	

}
