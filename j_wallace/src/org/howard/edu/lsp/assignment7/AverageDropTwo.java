package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import java.util.Collections;
import java.util.List;

public class AverageDropTwo implements AverageStrategy{
	/**
	 * Computes the combined average after dropping the two lowest grades in the list. Throws an exception when list is empty
	 *Input: List<Integer>
	 *Output: int
	 */

	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()) {
			throw new EmptyListException("List is empty.");
		}
		
		grades.remove(grades.indexOf(Collections.min(grades)));
		grades.remove(grades.indexOf(Collections.min(grades)));
		
		int sum = 0;
	      for (int i : grades) {
	         sum+=i;
	      }
	      
	    return sum/grades.size();
	}

}
