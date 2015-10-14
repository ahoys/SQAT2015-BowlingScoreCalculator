package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;
import org.unioulu.tol.sqat.bsc.Frame;
import org.unioulu.tol.sqat.bsc.BowlingGame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	@Test
	public void validFrameScore() {
		Frame singleframe = new Frame(0, 0);
		assertEquals(5, singleframe.score(1, 4))
		fail("Not yet implemented");
	}

}
