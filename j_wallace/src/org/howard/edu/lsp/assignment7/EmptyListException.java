package org.howard.edu.lsp.assignment7;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */
@SuppressWarnings("serial")
public class EmptyListException extends Exception {
	/**
	 * Contains the EmptyListException extension.
	 *
	 */
	public EmptyListException() {}
	public EmptyListException(String message)
    {
       super(message);
    }

}
