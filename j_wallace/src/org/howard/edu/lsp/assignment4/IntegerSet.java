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
	ArrayList<Integer> integerset;
	
	public IntegerSet() {
		this.integerset = new ArrayList<Integer>();
		
	}
	
	public void clear() {
		this.integerset.clear();
		
	}
	
	public int length() {
		return this.integerset.size();
		
	}
	
	public boolean equals(IntegerSet set2) {
		boolean equalto = true;
		for (Integer i : this.integerset) {
			if(set2.contains(i) == false) {
				equalto = false;
			}
			
		}
		return equalto;
		
	}
	
	public boolean contains(int value) {
		return this.integerset.contains(value);
		
	}
	
	public Integer largest() throws IntegerSetException {
		if (this.integerset.isEmpty()) {
			throw new IntegerSetException("Integer set is empty");
		}
		return Collections.max(this.integerset);
		
	}
	
	public Integer smallest() throws IntegerSetException {
		if (this.integerset.isEmpty()) {
			throw new IntegerSetException("Integer set is empty");
		}
		return Collections.min(this.integerset);
		
	}
	
	public void add(Integer item) {
		if(this.integerset.contains(item)) {
			return;
		}
		this.integerset.add(item);
		
	}
	
	public void remove(Integer item) {
		if(this.integerset.contains(item) == false) {
			return;
		}
		this.integerset.remove(Integer.valueOf(item));
		
	}
	
	public void union(IntegerSet set2) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array = set2.toArrayList();

		HashSet<Integer> unionSet = new HashSet<Integer>();
		unionSet.addAll(array);
		unionSet.addAll(this.integerset);
		
		this.integerset.clear();
		this.integerset.addAll(unionSet);

	}
	
	public void intersect(IntegerSet set2) {
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		
		for (Integer i : this.integerset) {
			if(set2.contains(i)) {
				intersect.add(i);
			}
			
		}
		this.integerset = intersect;
		
	}
	
	public void diff(IntegerSet set2) {
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
		return this.integerset.isEmpty();
		
	}
	
	public String toString() {
		return this.integerset.toString();
		
	}
	
	public ArrayList<Integer> toArrayList() {
		
		return this.integerset;
		
	}
	
	public void addAll(ArrayList<Integer> arr) {
		this.integerset.addAll(arr);
	}
	

}
