package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
import java.util.List;

public interface AverageStrategy {
	/**
	 * Strategy interface for computing the average grade. Throws an exception when list is empty
	 *Input: List<Integer>
	 *Output: int
	 */
	public int compute(List<Integer> grades) throws EmptyListException;

}
