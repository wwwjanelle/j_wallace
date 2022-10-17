package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import org.howard.edu.lsp.assignment4.IntegerSet;
import org.howard.edu.lsp.assignment4.IntegerSetException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {

//	@BeforeEach
//	public void setUp() throws Exception {
//		IntegerSet set1 = new IntegerSet();
//		IntegerSet set2 = new IntegerSet();
//	}

	@Test
	@DisplayName("Clear a set that is not empty.")
	public void testClearFull() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.clear();
		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("Clear a set that is empty.")
	public void testClearEmpty() {
		IntegerSet set1 = new IntegerSet();
		set1.clear();

		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("Remove an element from the set.")
	public void testRemoveExisting() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.remove(1);
		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("Remove an element that doesn't exist.")
	public void testRemoveNonExisting() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.remove(4);
		assertEquals("[1]", set1.toString());
	}
	
	@Test
	@DisplayName("Get the length of an empty set.")
	public void testLengthZero() {
		IntegerSet set1 = new IntegerSet();
		assertEquals(0, set1.length());
	}
	
	@Test
	@DisplayName("Get the length of a set that is not empty.")
	public void testLengthNotZero() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertEquals(2, set1.length());
	}
	
	@Test
	@DisplayName("Add elements to a set.")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertEquals("[1, 2]", set1.toString());
	}
	
	@Test
	@DisplayName("Look for an element that is in the set.")
	public void testContainsTrue() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertTrue(set1.contains(1));
	}
	
	@Test
	@DisplayName("Look for an element that is not in the set.")
	public void testContainsFalse() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		assertFalse(set1.contains(200));
	}
	
	@Test
	@DisplayName("Compare two sets that are exactly the same.")
	public void testEqualsSame() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(2);
		assertTrue(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Compare two sets that are the same but one is reversed.")
	public void testEqualsReverse() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set2.add(2);
		set2.add(1);
		assertTrue(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Compare two sets that are not the same.")
	public void testEqualsFalse() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set2.add(2);
		set2.add(3);
		assertFalse(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Find the largest value.")
	public void testLargest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		assertEquals(4, set1.largest());
	}
	
	@Test
	@DisplayName("Find the smallest value.")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		assertEquals(1, set1.smallest());
	}
	
	@Test
	@DisplayName("Find the largest value of an empty set.")
	public void testLargestException() {
		IntegerSet set1 = new IntegerSet();
	    Throwable exception = assertThrows(IntegerSetException.class, () -> set1.largest());
	    assertEquals("Integer set is empty", exception.getMessage());
	}
	
	@Test
	@DisplayName("Find the smallest value of an empty set.")
	public void testSmallestException() {
		IntegerSet set1 = new IntegerSet();
	    Throwable exception = assertThrows(IntegerSetException.class, () -> set1.smallest());
	    assertEquals("Integer set is empty", exception.getMessage());
	}
	
	@Test
	@DisplayName("Find the union.")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set2.add(3);
		set2.add(4);
		set1.union(set2);
		assertEquals("[1, 2, 3, 4]", set1.toString());
	}
	
	@Test
	@DisplayName("Find the intersection.")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set1.intersect(set2);
		assertEquals("[2, 3]", set1.toString());
	}
	
	@Test
	@DisplayName("Find the intersection of mutually exclusive sets.")
	public void testIntersectEmptySet() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set1.intersect(set2);
		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("Find the difference.")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set1.diff(set2);
		assertEquals("[1, 4]", set1.toString());
	}
	
	@Test
	@DisplayName("Find the difference of equal sets.")
	public void testDiffEmptySet() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set1.diff(set2);
		assertEquals("[]", set1.toString());
	}
	
	@Test
	@DisplayName("Set is empty.")
	public void testIsEmptyTrue() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Set is empty.")
	public void testIsEmptyFalse() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Convert to string.")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		assertEquals("[1, 2, 3, 4]", set1.toString());
	}

}
