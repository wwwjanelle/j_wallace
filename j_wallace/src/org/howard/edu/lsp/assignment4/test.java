package org.howard.edu.lsp.assignment4;

import java.util.Arrays;

/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

public class test {
	/**
	 * Contains the test cases for the IntegerSet class.
	 *
	 */

	public static void main(String[] args) throws IntegerSetException {
		/**
		 * Drives the test cases.
		 *
		 */
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();
		IntegerSet set6 = new IntegerSet();




		System.out.println("Value of Set1 is: " + set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of Set1 after adding 1, 2, and 3 is: " + set1.toString());
		set1.remove(3);
		System.out.println("Value of Set1 after removing 3 is: " + set1.toString());
		set1.remove(4);
		System.out.println("Value of Set1 after removing 4 is: " + set1.toString());
		set1.clear();
		System.out.println("Value of Set1 after clear is: " + set1.toString());
		System.out.println("Set1 is empty: " + set1.isEmpty());

		System.out.println(" ");
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Length of Set2 is: " + set2.length());
		System.out.println("Set2 contains 100 is: " + set2.contains(100));
		System.out.println("Set2 contains 4 is: " + set2.contains(4));
		System.out.println("Set2 maximum: " + set2.largest());
		System.out.println("Set2 minimum: " + set2.smallest());

		System.out.println(" ");
		set3.add(4);
		set3.add(5);
		set3.add(6);
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Set2 equals Set3: " + set2.equals(set3));
		System.out.println("Set2 equals Set1: " + set2.equals(set1));
		
		
		System.out.println(" ");
		set4.add(6);
		set4.add(7);
		set4.add(8);
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Value of Set4 is: " + set4.toString());
		set3.union(set4);
		System.out.println("Value of Set3 after union of Set3 and Set4: "+ set3.toString());
		
		System.out.println(" ");
		set5.add(7);
		set5.add(8);
		set5.add(9);
		System.out.println("Value of Set4 is: " + set4.toString());
		System.out.println("Value of Set5 is: " + set5.toString());
		set5.intersect(set4);
		System.out.println("Value of Set5 after intersecting of Set5 and Set4: "+ set5.toString());

		System.out.println(" ");
		set6.add(8);
		set6.add(9);
		set6.add(10);
		System.out.println("Value of Set5 is: " + set5.toString());
		System.out.println("Value of Set6 is: " + set6.toString());
		set5.diff(set6);
		System.out.println("Value of Set5 after difference of Set5 and Set6: "+ set5.toString());
		System.out.println(" ");


		try
        {
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Find largest value in Set1" );
            set1.largest();
        }
         
        catch(IntegerSetException ex)
        {
            System.out.println("IntegerSetException: Integer set is empty");
        }
		try
        {
			System.out.println("Value of Set1 is: " + set1.toString());
			System.out.println("Find smallest value in Set1" );
            set1.smallest();
        }
         
        catch(IntegerSetException ex)
        {
            System.out.println("IntegerSetException: Integer set is empty");
        }
        





	}

}
