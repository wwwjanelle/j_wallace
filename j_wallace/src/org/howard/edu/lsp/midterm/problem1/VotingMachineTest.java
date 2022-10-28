package org.howard.edu.lsp.midterm.problem1;
/**
 * Janelle Wallace
 * @author janellewallace
 *
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VotingMachineTest {

	@Test
	@DisplayName("Add a candidate to the voting machine.")
	public void testAddCandidate() {
		VotingMachine votingmachine = new VotingMachine();
		votingmachine.addCandidate("Joe Biden");
		assertTrue(votingmachine.containsCandidate("Joe Biden"));
	}
	
	@Test
	@DisplayName("Get votes from voting machine.")
	public void testCastVotes() throws UnknownCandidateException {
		VotingMachine votingmachine = new VotingMachine();
		votingmachine.addCandidate("Joe Biden");
		votingmachine.castVotes("Joe Biden", 5);
		assertEquals(5, votingmachine.getVotes("Joe Biden"));
		
	}
	
	@Test
	@DisplayName("Get votes from the voting machine when candidate is nonexistent.")
	public void testGetVotes() throws UnknownCandidateException {
		VotingMachine emptymachine = new VotingMachine();
	    Throwable exception = assertThrows(UnknownCandidateException.class, () -> emptymachine.getVotes("Joe Biden"));
	    assertEquals("Candidate name is not present.", exception.getMessage());
		
	}
	
	@Test
	@DisplayName("Sum of all votes in voting machine.")
	public void testSum() {
		VotingMachine votingmachine = new VotingMachine();
		votingmachine.addCandidate("Joe Biden");
		votingmachine.addCandidate("Santa Claus");
		votingmachine.addCandidate("Mickey Mouse");

		votingmachine.castVotes("Joe Biden", 5);
		votingmachine.castVotes("Santa Claus", 20);
		votingmachine.castVotes("Mickey Mouse", 3);

		assertEquals(28, votingmachine.sum());
		
	}


}
