package org.howard.edu.lsp.midterm.problem2;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	@DisplayName("Return the person’s name, age and social security number.")
	public void testToString() {
		Person person1 = new Person("name1", "111-11-111", 18);
		assertEquals("name1, 18, 111-11-111", person1.toString());
	}
	
	@Test
	@DisplayName("Compare two persons.")
	public void testEquals() {
		Person person1 = new Person("name1", "111-11-111", 18);
		Person person2 = new Person("name2", "111-11-111", 34);

		assertTrue(person1.equals(person2));
	}

}
