package org.howard.edu.lsp.midterm.problem1;
import java.util.HashMap;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

public class VotingMachine {
	
	HashMap<String, Integer> dictionary;
	
	public VotingMachine() {
		/**
		 * Constructor
		 *
		 */

		this.dictionary = new HashMap<String, Integer>();
		
	}
	
	public void addCandidate(String name) {
		this.dictionary.put(name, 0);
		
	} 
	
	public void castVotes(String name, int votes) {
		Integer count;
		count = this.dictionary.get(name) + votes;
		this.dictionary.put(name, count);
		
	}
	
	public int getVotes(String names)  throws UnknownCandidateException {
		
		if (this.dictionary.containsKey(names) == false) {
			throw new UnknownCandidateException("Candidate name is not present.");
		}
		
		return this.dictionary.get(names);

	}
	
	public int sum() {
		
		Integer sum = 0;
		
		for (HashMap.Entry<String, Integer> map :
            this.dictionary.entrySet()) {

           sum = sum + map.getValue();
       }
		
		return sum;

	}
	
	public boolean containsKey(String name) {
		return this.dictionary.containsKey(name);
	}




}
