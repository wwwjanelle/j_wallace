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
	
	public AverageGrade() {}
	
	public void setAverageStrategy (AverageStrategy as) {
		averageStrategy = as;
	}
	
	public Integer performAverage (List<Integer> grades) throws EmptyListException {
		average = averageStrategy.compute(grades);
		return average;
	}
	

}
