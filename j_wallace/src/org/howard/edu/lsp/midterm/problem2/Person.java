package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

	public Person(String name,  String socialSecurityNumber, int age) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		return this.name + ", " + this.age + ", " + this.socialSecurityNumber;
		
	}

	public boolean equals(Person person2) {
		if (this.socialSecurityNumber == person2.socialSecurityNumber) {
			return true;
		}
		return false;
	}

}
