package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment4.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AverageGradeTest {

	@Test
	@DisplayName("Computes the actual average.")
	void testAverageActual() throws EmptyListException {
		List<Integer> grades = new ArrayList<Integer>();
        grades.add(80);
        grades.add(90);
        grades.add(90);
        grades.add(100);
        grades.add(100);
		
		AverageGrade average = new AverageGrade();
		AverageStrategy as = new AverageActual();
		average.setAverageStrategy(as);
		
		assertEquals(92, average.performAverage(grades));
		
	}
	
	@Test
	@DisplayName("Computes the average after dropping the two lowest grades.")
	void testAverageDropTwo() throws EmptyListException {
		List<Integer> grades = new ArrayList<Integer>();
        grades.add(80);
        grades.add(93);
        grades.add(70);
        grades.add(50);
        grades.add(100);
		
		AverageGrade average = new AverageGrade();
		AverageStrategy as = new AverageDropTwo();
		average.setAverageStrategy(as);
		
		assertEquals(91, average.performAverage(grades));
		
	}
	
	@Test
	@DisplayName("Assert that an EmptyListException is thrown.")
	void testEmptyListException() throws EmptyListException {
		List<Integer> grades = new ArrayList<Integer>();
		
		AverageGrade average = new AverageGrade();
		AverageStrategy as = new AverageDropTwo();
		average.setAverageStrategy(as);
		
		Throwable exception = assertThrows(EmptyListException.class, () -> average.performAverage(grades));
		String message = exception.getMessage();
	    assertTrue(message.contains("List is empty."));
		
	}

}
