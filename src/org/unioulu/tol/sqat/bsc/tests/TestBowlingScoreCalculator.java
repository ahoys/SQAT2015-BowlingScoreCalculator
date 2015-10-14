package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;
import org.unioulu.tol.sqat.bsc.Frame;
import org.unioulu.tol.sqat.bsc.BowlingGame;

import org.junit.Test;

public class TestBowlingScoreCalculator {
	
	@Test
	public void testValidFrameScore() {
		Frame singleframe = new Frame(1, 4);
		assertEquals(5, singleframe.score());
	}
	
	@Test
	public void testValidFirstThrowValue() {
		Frame singleframe = new Frame(10, 0);
		assertEquals(true, singleframe.validThrow());
	}
	
	@Test
	public void testValidSecondThrowValue() {
		Frame singleframe = new Frame(0, 10);
		assertEquals(true, singleframe.validThrow());
	}
	
	@Test
	public void testTooHighFirstThrowValue() {
		Frame singleframe = new Frame(11, 0);
		assertEquals(false, singleframe.validThrow());
	}
	
	@Test
	public void testTooLowFirstThrowValue() {
		Frame singleframe = new Frame(-1, 0);
		assertEquals(false, singleframe.validThrow());
	}
	
	@Test
	public void testTooHighSecondThrowValue() {
		Frame singleframe = new Frame(0, 11);
		assertEquals(false, singleframe.validThrow());
	}
	
	@Test
	public void testTooLowSecondThrowValue() {
		Frame singleframe = new Frame(0, -1);
		assertEquals(false, singleframe.validThrow());
	}
	
	@Test
	public void testIsStrike() {
		Frame singleframe = new Frame(10, 0);
		assertEquals(true, singleframe.isStrike());
	}
	
	@Test
	public void testIsNotStrike() {
		Frame singleframe = new Frame(0, 0);
		assertEquals(false, singleframe.isStrike());
	}
	
	@Test
	public void testIsSpare() {
		Frame singleframe = new Frame(1, 9);
		assertEquals(true, singleframe.isSpare());
	}
	
	@Test
	public void testIsNotSpare() {
		Frame singleframe = new Frame(0, 0);
		assertEquals(false, singleframe.isSpare());
	}
	
	@Test
	public void testIsLastFrameOfTheMatch() {
		Frame singleframe = new Frame(0, 0);
		assertEquals(true, singleframe.isLastFrame());
	}

}
