package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import java.util.List;

public class AverageGrade {
	AverageStrategy averageStrategy;
	Integer average;
	
	public AverageGrade() {
		/**
		 * Constructor
		 *
		 */
	}
	
	public void setAverageStrategy (AverageStrategy as) {
		/**
		 * Sets the given Average Strategy
		 * Input: AverageStrategy
		 * Output: void
		 *
		 */
		averageStrategy = as;
	}
	
	public Integer performAverage (List<Integer> grades) throws EmptyListException {
		/**
		 * Computes the average using the defined strategy. Throws an exception when the list is empty.
		 * Input: List<Integer>
		 * Output: Integer
		 */
		average = averageStrategy.compute(grades);
		return average;
	}
	

}
