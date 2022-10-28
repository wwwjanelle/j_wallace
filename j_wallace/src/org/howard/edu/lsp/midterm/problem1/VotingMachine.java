package org.howard.edu.lsp.midterm.problem1;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

import java.util.HashMap;

public class VotingMachine {
	/**
	 * A class for a simplified voting machine. Has the following methods:
	 * - addCandidate
	 * - castVotes
	 * - getVotes
	 * - sum
	 * - containsCandidate
	 *
	 */
	
	HashMap<String, Integer> dictionary;
	
	public VotingMachine() {
		/**
		 * Constructor
		 *
		 */

		this.dictionary = new HashMap<String, Integer>();
		
	}
	
	public void addCandidate(String name) {
		/**
		 * Adds candidate name.
		 * Input: String
		 * Output: none
		 *
		 */
		this.dictionary.put(name, 0);
		
	} 
	
	public void castVotes(String name, int votes) {
		/**
		 * Adds votes for the specified candidate.
		 * Input: String, int
		 * Output: none
		 *
		 */
		Integer count;
		count = this.dictionary.get(name) + votes;
		this.dictionary.put(name, count);
		
	}
	
	public int getVotes(String names)  throws UnknownCandidateException {
		/**
		 * Returns the number of votes for the specified candidate.
		 * Input: String
		 * Output: int
		 *
		 */
		if (this.dictionary.containsKey(names) == false) {
			throw new UnknownCandidateException("Candidate name is not present.");
		}
		
		return this.dictionary.get(names);

	}
	
	public int sum() {
		/**
		 * Returns the sum of all votes in the voting machine.
		 * Input: None
		 * Output: int
		 *
		 */
		Integer sum = 0;
		
		for (HashMap.Entry<String, Integer> map :
            this.dictionary.entrySet()) {

           sum = sum + map.getValue();
       }
		
		return sum;

	}
	
	public boolean containsCandidate(String name) {
		/**
		 * Returns true if the candidate exists in the voting machine.
		 * Input: String
		 * Output: boolean
		 *
		 */
		return this.dictionary.containsKey(name);
	}




}
