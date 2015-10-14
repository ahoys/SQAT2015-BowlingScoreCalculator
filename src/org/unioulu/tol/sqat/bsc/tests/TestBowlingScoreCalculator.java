package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;
import org.unioulu.tol.sqat.bsc.Frame;
import org.unioulu.tol.sqat.bsc.BowlingGame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	@Test
	public void testValidFrameScore() {
		Frame singleframe = new Frame(1, 4);
		assertEquals(5, singleframe.score(1, 4));
	}
	
	@Test
	public void testIsStrike() {
		Frame singleframe = new Frame(10, 0);
		assertEquals(true, singleframe.isStrike());
	}

}
