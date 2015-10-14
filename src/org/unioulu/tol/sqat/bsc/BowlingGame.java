package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}

	public int incrementScore(Frame frame){
		//to be implemented
		return this.score + frame.score();
	}

	public int score(){
		//to be implemented
		return 0;
	}
		
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
