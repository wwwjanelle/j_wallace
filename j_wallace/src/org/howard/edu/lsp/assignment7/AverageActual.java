package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import java.util.List;

public class AverageActual implements AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()) {
			throw new EmptyListException("List is empty.");
		}
		
		int sum = 0;
	      for (int i : grades) {
	         sum+=i;
	      }
	      
	    return sum/grades.size();
	}


}
