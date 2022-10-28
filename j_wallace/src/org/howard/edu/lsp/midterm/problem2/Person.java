package org.howard.edu.lsp.midterm.problem2;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

public class Person {
	/**
	 * A class for person records. Has the following methods:
	 * - toString
	 * - equals
	 *
	 */
	
	private String name; 
	private int age; 
	private String socialSecurityNumber;

	public Person(String name,  String socialSecurityNumber, int age) {
		/**
		 * Constructor
		 *
		 */
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		/**
		 * Returns the person’s name, age and social security number.
		 * Input: none
		 * Output: String
		 *
		 */
		return this.name + ", " + this.age + ", " + this.socialSecurityNumber;
		
	}

	public boolean equals(Person person2) {
		/**
		 * Returns true if the social security numbers are the same.
		 * Input: Person
		 * Output: boolean
		 *
		 */
		if (this.socialSecurityNumber == person2.socialSecurityNumber) {
			return true;
		}
		return false;
	}

}
