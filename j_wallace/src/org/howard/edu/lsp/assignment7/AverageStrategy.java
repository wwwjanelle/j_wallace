package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import java.util.List;

public interface AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException;

}
